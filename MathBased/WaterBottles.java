public class WaterBottles {
    public static int getBottles(int numBottles, int numExchange) {
        int res = numBottles;
        while (numBottles >= numExchange) {
            res += numBottles / numExchange;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.print(getBottles(15, 4));
    }
}
