/*
PSEUDOCODE:

FUNCTION Greater(a, b)
START
IF a > b THEN
    PRINT a
ELSE
    PRINT b
END
END FUNCTION
*/

public class Q5_CheckNumberGreater {
    public static void greater(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        greater(10, 20);
    }
}