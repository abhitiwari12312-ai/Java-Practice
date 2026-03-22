/*
PSEUDOCODE:

FUNCTION CheckPrime(n)
START
count ← 0
FOR i ← 1 to n
    IF n % i == 0 THEN
        count ← count + 1

IF count == 2 THEN
    PRINT "Prime"
ELSE
    PRINT "Not Prime"

END
END FUNCTION
*/

public class Q10_CheckPrime {
    public static void checkPrime(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {
        checkPrime(7);
    }
}