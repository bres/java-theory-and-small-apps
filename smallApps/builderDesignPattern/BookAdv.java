package smallApps.builderDesignPattern;

import smallApps.shopping.ShoppingItem;

public class BookAdv implements ShoppingItem {

    //fields
    private String bookTitle;
    private String bookAuthor;
    private String pubYear;

    //default constructor
    public BookAdv() {
    }

    //overloaded constructor
    public BookAdv(String bookTitle, String bookAuthor, String pubYear) {
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
