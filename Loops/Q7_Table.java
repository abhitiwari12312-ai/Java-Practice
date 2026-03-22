/*
PSEUDOCODE:

FUNCTION Table(n)
START
FOR i ← 1 to 10
    PRINT n * i
END FOR
END
END FUNCTION
*/

public class Q7_Table {
    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }

    public static void main(String[] args) {
        table(5);
    }
}