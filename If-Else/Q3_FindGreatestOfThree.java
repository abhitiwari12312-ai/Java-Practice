/*
PSEUDOCODE:

FUNCTION Greatest(a, b, c)
START
IF a > b AND a > c THEN
    PRINT a
ELSE IF b > a AND b > c THEN
    PRINT b
ELSE
    PRINT c
END
END FUNCTION
*/

public class Q3_FindGreatestOfThree {
    public static void greatest(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        greatest(10, 25, 15);
    }
}