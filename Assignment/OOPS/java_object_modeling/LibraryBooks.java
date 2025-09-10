import java.util.*;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}

class Library {
    private String name;
    private List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }
    }
}

public class LibraryBooks {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("Python 101", "Guido");
        Library l1 = new Library("City Library");
        Library l2 = new Library("Town Library");
        l1.addBook(b1);
        l1.addBook(b2);
        l2.addBook(b2);
        l1.showBooks();
        l2.showBooks();
    }
}
