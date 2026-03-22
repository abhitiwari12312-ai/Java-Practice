/*
PSEUDOCODE:

FUNCTION FindMin(arr)
START
min ← arr[0]
FOR i ← 1 to length(arr)-1
    IF arr[i] < min THEN
        min ← arr[i]
PRINT min
END
END FUNCTION
*/

public class Q3_FindMin {
    public static void findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        findMin(arr);
    }
}