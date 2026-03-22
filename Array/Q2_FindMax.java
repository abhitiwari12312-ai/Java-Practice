/*
PSEUDOCODE:

FUNCTION FindMax(arr)
START
max ← arr[0]
FOR i ← 1 to length(arr)-1
    IF arr[i] > max THEN
        max ← arr[i]
PRINT max
END
END FUNCTION
*/

public class Q2_FindMax {
    public static void findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        findMax(arr);
    }
}