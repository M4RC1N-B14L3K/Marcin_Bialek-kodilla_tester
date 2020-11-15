public class Book {

    private String author;
    private String title;

    public static String of(String author, String title) {
        Book book = new Book("Isaac Asimov", "The Galaxy");
        return book;
    }
}
