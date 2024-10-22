import library.books.Book;

public class BookPackaging {
    public static void main(String[] args) {
        Book myBook = new Book("Java Programming", "John Doe", 29.99);

        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Price: $" + myBook.getPrice());
    }
}