/*
PSEUDOCODE:

FUNCTION Grade(marks)
START
IF marks >= 90 THEN
    PRINT "A"
ELSE IF marks >= 75 THEN
    PRINT "B"
ELSE IF marks >= 50 THEN
    PRINT "C"
ELSE
    PRINT "Fail"
END
END FUNCTION
*/

public class Q7_GradeSystem {
    public static void grade(int marks) {
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 75) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        grade(82);
    }
}