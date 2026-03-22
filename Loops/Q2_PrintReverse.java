/*
PSEUDOCODE:

FUNCTION PrintReverse(n)
START
FOR i ← n to 1
    PRINT i
END FOR
END
END FUNCTION
*/

public class Q2_PrintReverse {
    public static void printReverse(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printReverse(5);
    }
}