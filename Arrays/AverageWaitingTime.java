public class AverageWaitingTime {
    public static double getWaitingTime(int[][] arr) {
        int time = 0;
        int res = 0;

        for (int[] el : arr) {
            int arrival = el[0];
            int cooking = el[1];

            if (time < arrival)
                time = arrival;

            res += (time - arrival + cooking);
            time += cooking;
        }

        return res / arr.length;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 2, 5 }, { 4, 3 } };

        System.out.println();
        System.out.println("Average Waiting Time:  " + getWaitingTime(arr));
    }
}
