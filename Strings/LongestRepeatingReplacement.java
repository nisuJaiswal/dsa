public class LongestRepeatingReplacement {
    public static int getCount(String s, int k) {
        int left = 0, output = 0, largest = 0;
        int[] arr = new int[26];
        for (int right = 0; right < s.length(); right++) {
            arr[s.charAt(right) - 'A']++;

            largest = Math.max(largest, arr[s.charAt(right) - 'A']);

            if (right - left + 1 - largest > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            output = Math.max(output, right - left + 1);
        }
        return output;

    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Count: " + getCount("AABABBA", 1));
    }
}
