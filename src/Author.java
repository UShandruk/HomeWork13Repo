import java.util.Objects;

/// Автор
public class Author {
    /// Имя
    public String name;
    /// Фамилия
    private String surname;

    /// Конструктор
    public Author(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String getName()
    {
        return this.name;
    }

    public String getSurname()
    {
        return this.surname;
    }

    /// Преобразовать объект в строку
    @Override
    public String toString() {
        return surname + " " + name;
    }

    /// Сравнить текущий объект с переданным в параметр
    @Override
    public boolean equals(Object o) {
        System.out.println(o.getClass());
        System.out.println(this.getClass());
        boolean isEqual = false;

        if(o.getClass() == this.getClass()) {
            isEqual = this.name.equals(((Author)o).name) && this.surname.equals(((Author)o).surname);
        }
        return isEqual;
    }

    /// Получить хеш код
    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.surname);
    }
}