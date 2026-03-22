/*
PSEUDOCODE:

FUNCTION CheckLeap(year)
START
IF (year % 4 == 0 AND year % 100 != 0) OR (year % 400 == 0) THEN
    PRINT "Leap Year"
ELSE
    PRINT "Not Leap Year"
END
END FUNCTION
*/

public class Q4_CheckLeapYear {
    public static void checkLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }

    public static void main(String[] args) {
        checkLeap(2024);
    }
}