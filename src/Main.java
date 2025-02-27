public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джордж", "Оруэлл");
        Author author2 = new Author("Фёдор", "Достоевский");

        Book book1 = new Book("1984", author1, 1949);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        System.out.println("Книга: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFullName() + ", Год издания: " + book1.getPublicationYear());
        System.out.println("Книга: " + book2.getTitle() + ", Автор: " + book2.getAuthor().getFullName() + ", Год издания: " + book2.getPublicationYear());


        book1.setPublicationYear(1950);
        System.out.println("После изменения года издания:");
        System.out.println("Книга: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFullName() + ", Год издания: " + book1.getPublicationYear());

    }
}