
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] usingHashMap(int[] arr, int target) {

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if (hashMap.containsKey(diff) && hashMap.get(diff) != i) {
                return new int[] { hashMap.get(diff), i };
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4 };

        int[] res = usingHashMap(arr, 6);
        System.out.println("\nHers's the index: ");
        for (int el : res)
            System.out.println(el);
    }
}
