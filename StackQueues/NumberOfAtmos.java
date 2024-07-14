package StackQueues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class NumberOfAtmos {
    public static String getAtom(String formula) {

        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new HashMap<>());
        int len = formula.length(), i = 0;

        while (i < len) {
            char c = formula.charAt(i);

            if (c == '(') {
                stack.push(new HashMap<>());
                i++;
            } else if (c == ')') {
                Map<String, Integer> top = stack.pop();
                i += 1;

                int start = i;

                while (i < len && Character.isDigit(formula.charAt(i)))
                    i += 1;

                int mul = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;

                for (String atom : top.keySet()) {
                    stack.peek().put(atom, stack.peek().getOrDefault(atom, 0) + top.get(atom) * mul);
                }

            } else {
                int start = i;
                i += 1;
                while (i < len && Character.isLowerCase(formula.charAt(i)))
                    i += 1;

                String el = formula.substring(start, i);

                start = i;

                while (i < len && Character.isDigit(formula.charAt(i)))
                    i += 1;

                int count = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;

                stack.peek().put(el, stack.peek().getOrDefault(el, 0) + count);
            }
        }

        StringBuilder sb = new StringBuilder();
        Map<String, Integer> topMap = stack.pop();
        List<String> elements = new ArrayList<>(topMap.keySet());
        Collections.sort(elements);
        for (String el : elements) {
            sb.append(el);
            int count = topMap.get(el);
            if (count > 1)
                sb.append(count);
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "K4(ON(SO3)2)2";
        System.out.println();
        System.out.println(getAtom(str));

    }
}
