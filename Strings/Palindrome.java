package Strings;

public class Palindrome {
    public static boolean checkPalindrrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrrome("A man, a plan, a canal: Panaa"));
    }
}
