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
}