/*
PSEUDOCODE:

FUNCTION Square(n)
START
result ← n * n
PRINT result
END
END FUNCTION
*/

public class Q4_SquareOfNumber {
    public static void square(int n) {
        int result = n * n;
        System.out.println(result);
    }

    public static void main(String[] args) {
        square(4);
    }
}