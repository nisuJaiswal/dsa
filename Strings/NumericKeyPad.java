public class NumericKeyPad {
    public static void convert(String[] arr, String sentence) {
        String output = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ')
                output += 0;
            else {
                int res = sentence.charAt(i) - 'A';
                output += arr[res];
            }
        }

        System.out.println(output);
    }

    public static void main(String[] args) {
        String[] str = { "2", "22", "222", "3", "33", "333",
                "4", "44", "444", "5", "55", "555",
                "6", "66", "666", "7", "77", "777",
                "7777", "8", "88", "888", "9", "99",
                "999", "9999" };

        System.out.println();
        convert(str, "NISU JAISWAL");
    }
}
