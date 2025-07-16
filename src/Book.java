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
}