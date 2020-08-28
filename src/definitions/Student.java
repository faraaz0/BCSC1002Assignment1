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
}
