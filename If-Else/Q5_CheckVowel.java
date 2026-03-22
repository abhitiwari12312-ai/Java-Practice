/*
PSEUDOCODE:

FUNCTION CheckVowel(ch)
START
IF ch is a,e,i,o,u THEN
    PRINT "Vowel"
ELSE
    PRINT "Consonant"
END
END FUNCTION
*/

public class Q5_CheckVowel {
    public static void checkVowel(char ch) {
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
            ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        checkVowel('a');
    }
}