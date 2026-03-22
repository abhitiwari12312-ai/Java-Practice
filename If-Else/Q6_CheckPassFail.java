/*
PSEUDOCODE:

FUNCTION CheckResult(marks)
START
IF marks >= 40 THEN
    PRINT "Pass"
ELSE
    PRINT "Fail"
END
END FUNCTION
*/

public class Q6_CheckPassFail {
    public static void checkResult(int marks) {
        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        checkResult(35);
    }
}