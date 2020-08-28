/*  Created by IntelliJ IDEA.
 *  User: Md. Faraaz Siddiqui (faraaz0)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String bookISBNNumber;

    public Book(String bookName, String authorName, String bookISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookISBNNumber = bookISBNNumber;
    }

    public String getBookName() {

        return bookName;
    }

    public void setBookName(String bookName) {

        this.bookName = bookName;
    }

    public String getAuthorName() {

        return authorName;
    }

    public void setAuthorName(String authorName) {

        this.authorName = authorName;
    }

    public String getIsbnNumber() {

        return bookISBNNumber;
    }

    public void setIsbnNumber(String bookISBNNumber) {

        this.bookISBNNumber = bookISBNNumber;
    }

    @Override
    public String toString() {
        return String.format(
                "Book Name: %s, Author Name: %s, ISBN Number: %s",
                getBookName(), getAuthorName(), getIsbnNumber()
        );
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getIsbnNumber(), book.getIsbnNumber());
    }

    @Override
    public int hashCode () {
        return Objects.hash(getBookName(), getAuthorName(), getIsbnNumber());
    }


}
