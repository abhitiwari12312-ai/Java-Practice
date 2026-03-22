/*
PSEUDOCODE:

FUNCTION ArraySum(arr)
START
sum ← 0
FOR each element in arr
    sum ← sum + element
PRINT sum
END
END FUNCTION
*/

public class Q1_ArraySum {
    public static void arraySum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arraySum(arr);
    }
}