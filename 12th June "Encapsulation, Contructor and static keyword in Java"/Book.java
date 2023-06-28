public class Book {
    private String title;
    private String author;

    // Default constructor
    public Book() {
        title = "Untitled";
        author = "Unknown";
    }

    private String getTitle() {
        return title;
    }

    private String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        // Creating an instance of the Book class using the default constructor
        Book book = new Book();

        // Accessing the attributes using getters
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }

}
