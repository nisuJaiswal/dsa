
import java.util.*;

public class FormLargestNumber {

    public static void largestNumber(Vector<String> arr) {
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String X, String Y) {
                // TODO Auto-generated method stub
                String XY = X + Y;
                String YX = Y + X;

                int res = XY.compareTo(YX);

                return res == 0 ? 0 : (res < 0 ? 1 : -1);
                // return 0;
            }
        });

        Iterator<String> it = arr.iterator();
        System.out.print("\n Biggest element: ");
        while (it.hasNext()) {
            System.out.print(it.next());
        }

    }

    public static void main(String[] args) {
        Vector<String> array;
        array = new Vector<>();

        array.add("54");
        array.add("546");
        array.add("548");
        array.add("60");
        largestNumber(array);
    }
}
