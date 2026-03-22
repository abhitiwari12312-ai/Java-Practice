/*
PSEUDOCODE:

FUNCTION Add(a, b)
START
sum ← a + b
PRINT sum
END
END FUNCTION
*/

public class Q2_AddTwoNumbers {
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        add(5, 3);
    }
}