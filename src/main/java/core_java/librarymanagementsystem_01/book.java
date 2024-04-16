package core_java.librarymanagementsystem_01;

public class book {
    private int book_serialno;
    String book_name;
    private String book_author;
    private int book_quantity;
    private int bookQtyCopy;

    @Override
    public String toString() {
        return "book [book_serialno=" + book_serialno + ", book_name=" + book_name + ", book_author=" + book_author
                + ", book_quantity=" + book_quantity + ", bookQtyCopy=" + bookQtyCopy + "]";
    }

    // parameterized constructor
    public book(int book_serialno, String book_name, String book_author, int book_quantity, int bookQtyCopy) {
        this.book_serialno = book_serialno;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_quantity = book_quantity;
        this.bookQtyCopy = bookQtyCopy;
    }
    // public static void main(String[] args) {
    // book b=new book(0, null, null, 0, 0);

    // new book(0, null, null, 0, 0);
    // }
    public int getBookQtyCopy() {
        return bookQtyCopy;
    }

    public void setBookQtyCopy(int bookQtyCopy) {
        this.bookQtyCopy = bookQtyCopy;
    }

    public int getBook_serialno() {
        return book_serialno;
    }

    public void setBook_serialno(int book_serialno) {
        this.book_serialno = book_serialno;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public int getBook_quantity() {
        return book_quantity;
    }

    public void setBook_quantity(int book_quantity) {
        this.book_quantity = book_quantity;
    }

}
