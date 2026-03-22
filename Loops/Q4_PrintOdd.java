/*
PSEUDOCODE:

FUNCTION PrintOdd(n)
START
FOR i ← 1 to n
    IF i % 2 != 0 THEN
        PRINT i
END FOR
END
END FUNCTION
*/

public class Q4_PrintOdd {
    public static void printOdd(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printOdd(10);
    }
}