/*
PSEUDOCODE:

FUNCTION CheckEvenOdd(n)
START
IF n % 2 == 0 THEN
    PRINT "Even"
ELSE
    PRINT "Odd"
END
END FUNCTION
*/

public class Q1_CheckEvenOdd {
    public static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(7);
    }
}