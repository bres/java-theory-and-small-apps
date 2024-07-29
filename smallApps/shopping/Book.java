package smallApps.shopping;

public class Book implements ShoppingItem{

    //fields
    private String bookTitle;
    private String bookAuthor;
    private String pubYear;

    //default constructor
    public Book() {
    }

    //overloaded constructor
    public Book(String bookTitle, String bookAuthor, String pubYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.pubYear = pubYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", pubYear='" + pubYear + '\'' +
                '}';
    }
}
