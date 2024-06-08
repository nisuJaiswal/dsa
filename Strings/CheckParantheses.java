
import java.util.Stack;

public class CheckParantheses {
    public static boolean checkParantheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != c)
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println(checkParantheses("()[{}"));

    }
}
