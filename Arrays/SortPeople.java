import java.util.*;

public class SortPeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] res = new String[names.length];

        for (int j = heights.length - 1, i = 0; j >= 0; i++, j--) {
            res[i] = map.get(heights[j]);
        }

        return res;
    }

    public static void main(String[] args) {
        String[] people = { "Mary", "John", "Emma" };
        int[] heights = { 180, 165, 170 };
        System.out.println();
        String[] res = sortPeople(people, heights);

        System.out.println(Arrays.toString(res));
    }
}
