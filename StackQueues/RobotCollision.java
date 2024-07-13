package StackQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Robot {
    int pos, index, health;
    char dir;

    public Robot(int pos, int index, int health, char dir) {
        this.pos = pos;
        this.index = index;
        this.health = health;
        this.dir = dir;
    }

}

public class RobotCollision {
    public static List<Integer> getHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;

        // Creating list of robots
        List<Robot> robots = new ArrayList<>();

        // Adding each robot in list
        for (int i = 0; i < n; i++) {
            robots.add(new Robot(positions[i], i, healths[i], directions.charAt(i)));
        }

        // Sort the robots based on their positions
        robots.sort((a, b) -> a.pos - b.pos);

        Stack<Robot> stack = new Stack<>();

        // Process each robot
        for (Robot robot : robots) {
            // Push and skip the iteration if robot's directions is Right
            if (robot.dir == 'R') {
                stack.push(robot);
                continue;
            }

            // If top of the stack's postions in Right and stack is not empty
            while (!stack.isEmpty() && stack.peek().dir == 'R' && stack.peek().health > 0) {

                // If current robot and top of the stack healths are same then pop from the
                // stack
                if (stack.peek().health == robot.health) {
                    stack.pop();
                    robot.health = 0;
                } else if (stack.peek().health < robot.health) {
                    // If top of the stack has lesser heath then pop from the stack and set the
                    // health of the current robot
                    stack.pop();
                    robot.health--;
                } else {
                    // Otherwise top of the stack has greater health, so just decrease the health by
                    // 1
                    stack.peek().health--;
                    robot.health = 0;
                }
            }

            // If the current robot has health more than 0 then push on the stack
            if (robot.health > 0)
                stack.push(robot);
        }
        // Sort the stack based on their indices
        stack.sort((a, b) -> a.index - b.index);

        List<Integer> res = new ArrayList<>();
        for (Robot rb : stack) {
            res.add(rb.health);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println();
        int[] positions = { 5, 4, 3, 2, 1 };
        int[] healths = { 2, 17, 9, 15, 10 };
        String directions = "RRRRR";
        List<Integer> res = getHealths(positions, healths, directions);

        System.out.print(res.toString());
    }
}
