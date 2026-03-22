/*
PSEUDOCODE:

FUNCTION SumN(n)
START
sum ← 0
FOR i ← 1 to n
    sum ← sum + i
PRINT sum
END
END FUNCTION
*/

public class Q5_SumN {
    public static void sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumN(5);
    }
}