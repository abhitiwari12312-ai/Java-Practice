/*
PSEUDOCODE:

FUNCTION PrintEven(n)
START
FOR i ← 1 to n
    IF i % 2 == 0 THEN
        PRINT i
END FOR
END
END FUNCTION
*/

public class Q3_PrintEven {
    public static void printEven(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printEven(10);
    }
}