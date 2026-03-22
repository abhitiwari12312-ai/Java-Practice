/*
PSEUDOCODE:

FUNCTION CountDigits(n)
START
count ← 0
WHILE n > 0
    n ← n / 10
    count ← count + 1
PRINT count
END
END FUNCTION
*/

public class Q8_CountDigits {
    public static void countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        countDigits(12345);
    }
}