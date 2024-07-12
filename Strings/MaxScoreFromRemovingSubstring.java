import java.util.Stack;

public class MaxScoreFromRemovingSubstring {
    public static int getScore(String s, int x, int y) {
        int smaller = x < y ? x : y;
        int bigger = smaller == x ? y : x;

        char firstChar = bigger == x ? 'a' : 'b';
        char secondChar = firstChar == 'b' ? 'a' : 'b';

        // System.out.println(bigger + " " + smaller + " " + firstChar + " " +
        // secondChar);
        int res = 0;

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!stack1.isEmpty() && c == secondChar && stack1.peek() == firstChar) {
                res += bigger;
                stack1.pop();
            } else
                stack1.push(c);
        }

        while (!stack1.isEmpty()) {
            char c = stack1.pop();
            if (!stack2.isEmpty() && c == secondChar && stack2.peek() == firstChar) {
                stack2.pop();
                res += smaller;

            } else
                stack2.push(c);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "cdbcbbaaabab";
        System.out.println();
        System.out.print(getScore(s, 4, 5));
    }
}
