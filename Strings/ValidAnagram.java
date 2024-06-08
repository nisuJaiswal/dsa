
import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static boolean usingArray(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }

    public static boolean usingHasMap(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (char i : t.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) - 1);
        }

        for (int x : map.values()) {
            if (x != 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println("Output: \n");
        System.out.println(usingHasMap("anagram", "anagram"));
    }
}
