
class ConsecutiveLetters {
    public static String getConsecutiveString(String str) {
        StringBuffer res = new StringBuffer();
        char prev = str.charAt(0);
        res.append(prev);

        for (int i = 1; i < str.length() - 1; i++) {
            char curr = str.charAt(i);

            if (prev != curr) {
                res.append(curr);
                prev = curr;
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println("\n " + getConsecutiveString("aaabaa"));
    }
}