import java.util.HashMap;
import java.util.Map;

public class PrintDuplicates {
    public static void printDuplicateValues(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> x : map.entrySet()) {
            if (x.getValue() > 1) {
                System.out.println(x.getKey() + " count: " + x.getValue());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println();
        printDuplicateValues("testing");
    }
}
