/*
PSEUDOCODE:

FUNCTION PrintNumbers(n)

    START

    FOR i ← 1 to n
        PRINT i

    END FOR

    END

END FUNCTION
*/

public class Q1_PrintNumbers {

    public static void printNumbers(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        int n = 5;

        printNumbers(n);
    }
}