/*
PSEUDOCODE:

FUNCTION SumDigits(n)
START
sum ← 0
WHILE n > 0
    digit ← n % 10
    sum ← sum + digit
    n ← n / 10
PRINT sum
END
END FUNCTION
*/

public class Q9_SumDigits {
    public static void sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumDigits(123);
    }
}