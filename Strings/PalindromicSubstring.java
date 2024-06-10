public class PalindromicSubstring {

    public static boolean checkPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }

    public static int usingBruteforce(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (checkPalindrome(s, i, j))
                    ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(usingBruteforce("ab"));
    }
}
