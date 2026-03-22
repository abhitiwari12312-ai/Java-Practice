/*
PSEUDOCODE:

FUNCTION Factorial(n)
START
fact ← 1
FOR i ← 1 to n
    fact ← fact * i
PRINT fact
END
END FUNCTION
*/

public class Q6_Factorial {
    public static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        factorial(5);
    }
}