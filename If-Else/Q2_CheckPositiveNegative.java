/*
PSEUDOCODE:

FUNCTION CheckNumber(n)
START
IF n > 0 THEN
    PRINT "Positive"
ELSE IF n < 0 THEN
    PRINT "Negative"
ELSE
    PRINT "Zero"
END
END FUNCTION
*/

public class Q2_CheckPositiveNegative {
    public static void checkNumber(int n) {
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        checkNumber(-5);
    }
}