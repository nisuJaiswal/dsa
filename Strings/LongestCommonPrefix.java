import java.util.Arrays;

public class LongestCommonPrefix {
    public static String getCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i))
                return res.toString();

            res.append(first.charAt(i));
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String[] strings = { "flower", "flow", "flight" };
        System.out.println("\n" + getCommonPrefix(strings));
    }
}
