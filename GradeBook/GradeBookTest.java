import java.util.Scanner;

public class GradeBookTest {
    public static void main(String args[]) {
        GradeBook myGradeBook = new GradeBook("Learning Java");

        myGradeBook.displayMessage();
        myGradeBook.inputGrades();
        myGradeBook.displayGradeReport();
    }
}
