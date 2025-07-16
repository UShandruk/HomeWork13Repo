import java.util.Objects;

/// Книга
public class Book {
    /// Название
    private String name;
    /// Автор
    private Author author;
    /// Год издания
    private int publicationYear;

    /// Конструктор
    public Book(String name, Author author, int publicationYear)
    {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName()
    {
        return this.name;
    }

    public Author getAuthor()
    {
        return this.author;
    }

    public int getPublicationYear()
    {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear)
    {
        this.publicationYear = publicationYear;
    }

    /// Преобразовать объект в строку
    @Override
    public String toString() {
        return name + " - " + author.toString() + publicationYear;
    }

    /// Сравнить текущий объект с переданным в параметр
    @Override
    public boolean equals(Object o) {
        System.out.println(o.getClass());
        System.out.println(this.getClass());
        boolean isEqual = false;

        if(o.getClass() == this.getClass()) {
            isEqual = this.name.equals(((Book)o).name) &&
                    this.author.toString().equals(((Book)o).author.toString()) &&
                    this.publicationYear == ((Book)o).publicationYear;
        }
        return isEqual;
    }

    /// Получить хеш код
    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
}