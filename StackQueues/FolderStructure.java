package StackQueues;

import java.util.*;

public class FolderStructure {
    public static int getSteps(String[] logs) {
        Stack<String> stack = new Stack<>();

        for (String log : logs) {
            if (log.equals("./"))
                continue;
            if (log.equals("../") && stack.isEmpty())
                stack.push(log);
            if (log.equals("../") && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(log);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        String[] logs = { "d1/", "d2/", "../", "d21/", "./" };
        System.out.println();
        System.out.print(getSteps(logs));
    }
}
