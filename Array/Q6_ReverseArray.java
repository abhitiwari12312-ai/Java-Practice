/*
PSEUDOCODE:

FUNCTION ReverseArray(arr)
START
left ← 0, right ← length(arr)-1
WHILE left < right
    swap arr[left] and arr[right]
    left ← left + 1
    right ← right - 1
PRINT array
END
END FUNCTION
*/

public class Q6_ReverseArray {
    public static void reverseArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
    }
}