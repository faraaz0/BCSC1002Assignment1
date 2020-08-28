/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] books ;

    public Library() {

        this.books = new Book[1000];
    }

    public Book[] getBooks() {

        return books;
    }

    public void setBooks(Book[] books) {

        this.books = books;
    }

    public void addReturnedBook(String bookName) {
        System.out.println(bookName + " has been successfully returned.");
    }

    public String toString() {
        return String.format(
                "Books List: %s", getBooks());
    }

}
