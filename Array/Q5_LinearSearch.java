/*
PSEUDOCODE:

FUNCTION LinearSearch(arr, key)
START
FOR i ← 0 to length(arr)-1
    IF arr[i] == key THEN
        PRINT "Found at index i"
        RETURN
PRINT "Not Found"
END
END FUNCTION
*/

public class Q5_LinearSearch {
    public static void linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        linearSearch(arr, 30);
    }
}