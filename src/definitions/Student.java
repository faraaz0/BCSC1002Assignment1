/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String[] nameOfTheStudent;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] books;

    public Student(String nameOfTheStudent, long universityRollNumber, int numberOfBooksIssued) {
        this.nameOfTheStudent = nameOfTheStudent.split(" ");
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.books = new Book[numberOfBooksIssued];
    }

    public String[] getNameOfTheStudent() {

        return nameOfTheStudent;
    }

    public void setNameOfTheStudent(String[] nameOfTheStudent) {

        this.nameOfTheStudent = nameOfTheStudent;
    }

    public long getUniversityRollNumber() {

        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {

        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssued() {

        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {

        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addNewBook(String bookName) {
        System.out.println(bookName + " has been successfully issued.");
    }

    public void myIssuedBooks() {
        for (Book books : books) {
            System.out.println(books);
        }
    }
}
