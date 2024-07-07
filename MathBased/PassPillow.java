public class PassPillow {
    public static int getPerson(int n, int time) {
        int completed = time / (n - 1);
        int rem = time % (n - 1);

        int res = 0;
        if (completed % 2 == 0) {
            res = rem + 1;
        } else {
            res = n - rem;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.print(getPerson(4, 5));
    }
}
