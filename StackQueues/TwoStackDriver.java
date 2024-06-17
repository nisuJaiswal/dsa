package StackQueues;

public class TwoStackDriver {
    public static void main(String[] args) {

        TwoStacks ts = new TwoStacks(5);
        ts.pushFirst(5);
        ts.pushSecond(10);
        ts.pushSecond(15);
        ts.pushFirst(11);
        ts.pushSecond(7);
        System.out.println("Popped element from stack1 is "
                + ": " + ts.popFirst());
        ts.pushSecond(40);
        System.out.println("Popped element from stack2 is "
                + ": " + ts.popSecond());

    }
}
