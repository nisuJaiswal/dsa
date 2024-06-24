package StackQueues;

import java.util.Stack;

public class FindDuplicates {
    public static boolean findDuplicateparenthesis(String s) {
        if (s == null)
            return false;

        Stack<Character> st = new Stack<>();
        char[] str = s.toCharArray();
        for (char ch : str) {
            if (ch == ')') {
                char top = st.peek();
                st.pop();

                int innerEl = 0;
                while (top != '(') {
                    innerEl += 1;
                    top = st.peek();
                    st.pop();
                }

                if (innerEl == 0)
                    return true;

            } else {
                st.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "( ((a + B)) * (c) )";

        System.out.println();
        if (findDuplicateparenthesis(str)) {
            System.out.println("Duplicate Found ");
        } else {
            System.out.println("No Duplicates Found ");
        }

    }
}
