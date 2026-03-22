/*
PSEUDOCODE:

FUNCTION CountEvenOdd(arr)
START
even ← 0, odd ← 0
FOR each element in arr
    IF element % 2 == 0 THEN
        even ← even + 1
    ELSE
        odd ← odd + 1
PRINT even, odd
END
END FUNCTION
*/

public class Q4_CountEvenOdd {
    public static void countEvenOdd(int[] arr) {
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        countEvenOdd(arr);
    }
}