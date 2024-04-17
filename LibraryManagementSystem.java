class Book {
    private String title;
    private String author;
    private int id;

    // Create a Constructor
    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
    }
}
// Create user class
class User {
    private String name;
    private final String membershipID;

    public User(String name, String membershipID) {
        this.name = name;
        this.membershipID = membershipID;
    }

    public void displayInfo() {
        System.out.println("User Name: " + name);
        System.out.println("User Membership ID: " + membershipID);
    }
}


// inheritance user class
class LibraryUser extends User {
    private Book[] borrowedBooks;

    // Constructor
    public LibraryUser(String name, String membershipID) {
        super(name, membershipID);
        borrowedBooks = new Book[5]; 
    }

    // Overloaded 
    public void borrowBook(int bookID)
    {

    }

    // Polimorphism
    public void borrowBook(Book book)
    {

    }

    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            if (book != null) {
                book.displayDetails();
            }
        }
    }

    //  Book object and return 
    public Book returnBook(Book book)
    {
        return book;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) 
    {
        Book book1 = new Book("Head First Java", "Kathy Sierra", 22201077);
        book1.displayDetails();

        User user1 = new User("Sakhawat Hossain", "C-1947");
        user1.displayInfo();

        LibraryUser libraryUser1 = new LibraryUser("Siam Ahmed","C-1948" );
        libraryUser1.displayInfo();
    }
}
