/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;


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

    public void returnAnIssuedBook(String bookName) {
        System.out.println(bookName + " has been successfully returned.");
    }

    @Override
    public String toString() {
        return String.format(
                "Student Name: %s, University Roll Number: %l, Number Of Books Issued: %d, Name Of Books Issued By The Student: %d",
                getNameOfTheStudent(), getUniversityRollNumber(), getNumberOfBooksIssued(), getBooks()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                Arrays.equals(getNameOfTheStudent(), student.getNameOfTheStudent()) &&
                Arrays.equals(getBooks(), student.getBooks());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getUniversityRollNumber(), getNumberOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getNameOfTheStudent());
        result = 31 * result + Arrays.hashCode(getBooks());
        return result;
    }
}
