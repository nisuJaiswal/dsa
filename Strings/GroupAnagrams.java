import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> getAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> res = getAnagrams(strs);
        Iterator<List<String>> it = res.iterator();

        System.out.println();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
