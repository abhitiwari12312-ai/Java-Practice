/*
PSEUDOCODE:

FUNCTION Swap(a, b)
START
temp ← a
a ← b
b ← temp
PRINT a, b
END
END FUNCTION
*/

public class Q3_SwapTwoNumbers {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        swap(2, 5);
    }
}