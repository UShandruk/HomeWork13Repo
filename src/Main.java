public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Федор", "Достоевский");
        Book book1 = new Book("Идиот",author1, 1965);

        Author author2 = new Author("Иван", "Ефремов");
        Book book2 = new Book("Час быка", author2, 2001);

        System.out.println("Год издания до изменения: " + book1.getPublicationYear());
        book1.setPublicationYear(2000);
        System.out.println("Год издания после изменения: " + book1.getPublicationYear());
    }
}