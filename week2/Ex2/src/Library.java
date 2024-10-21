import java.util.Scanner;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "name=" + name + ",email=" + email + "gender=" + gender;
    }
}

class Book {

    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    String getName() {
        return name;
    }
    Author getAuthor() {
        return author;
    }
    double getPrice() {
        return price;
    }
    void setPrice(double price) {
        this.price = price;
    }
    int getQty() {
        return qty;
    }
    void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "bookname=" + name + ", " + author.toString() + ",price=" + price + ",qty=" + qty;
    }

}

class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full.");
        }
    }

    public void updateBookPrice(String bookName, double newPrice) {
        for (int i = 0; i < count; i++) {
            if (books[i].getName().equalsIgnoreCase(bookName)) {
                books[i].setPrice(newPrice);
                System.out.println("Updated price for: " + bookName);
                return;
            }
        }
        System.out.println("Book not found: " + bookName);
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        Library library = new Library(5);

        Author author1 = new Author("J.K. Rowling", "jk.rowling@example.com", 'F');
        Author author2 = new Author("George R.R. Martin", "george.martin@example.com", 'M');

        Book book1 = new Book("Harry Potter", author1, 39.99, 10);
        Book book2 = new Book("Game of Thrones", author2, 49.99, 5);

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books in the library:");
        library.displayBooks();

        library.updateBookPrice("Harry Potter", 34.99);

        System.out.println("\nBooks in the library after price update:");
        library.displayBooks();
    }
}