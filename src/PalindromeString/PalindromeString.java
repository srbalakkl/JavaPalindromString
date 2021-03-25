package PalindromeString;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Please enter string");
        Scanner in = new Scanner(System.in);
        String strVal = in.next();
        in.close();
        System.out.println("The output is -> " + isPalindrome(strVal));
    }

    private static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}
