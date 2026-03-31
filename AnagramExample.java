//Example for simple Anagram in Java
import java.util.Arrays;
public class AnagramExample {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String s1, String s2) {
        // Remove whitespace and convert to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        // Convert strings to char arrays
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        // Check if sorted char arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }
}