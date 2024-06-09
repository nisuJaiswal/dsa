import java.util.*;

public class LongestSubStringWORepeating {
    public static int longest(String str) {
        Set<Character> map = new HashSet<>();

        int left = 0, output = 0;

        for (int right = 0; right < str.length(); right++) {
            if (!map.contains(str.charAt(right))) {
                map.add(str.charAt(right));
                output = Math.max(right - left + 1, output);

            } else {
                while (map.contains(str.charAt(right))) {
                    map.remove(str.charAt(left));
                    left++;
                }
                map.add(str.charAt(right));
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(longest("abcadabcde"));
    }
}
