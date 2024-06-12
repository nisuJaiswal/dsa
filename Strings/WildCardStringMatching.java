public class WildCardStringMatching {
    public static boolean checkWild(String str, String ptrn) {

        // i for string and j for pattern index
        int i = 0, j = 0;
        // start points the index of start found in pattern while matchedStar gives
        // index in given string
        int starIndex = -1, matchedStar = -1;

        while (i < str.length()) {
            if (j < ptrn.length() && (str.charAt(i) == ptrn.charAt(j) || ptrn.charAt(j) == '?')) {
                i++;
                j++;
            } else if (j < ptrn.length() && ptrn.charAt(j) == '*') {
                starIndex = j;
                matchedStar = i;
                j++;
            } else if (starIndex != -1) {
                j = starIndex + 1;
                i = matchedStar + 1;
                matchedStar = i;
            } else
                return false;
        }

        while (j < ptrn.length() && ptrn.charAt(j) == '*')
            j++;

        return j == ptrn.length();
    }

    public static void main(String[] args) {
        System.out.println();
        String str = "aabaa", pattern = "aa*";

        System.out.println("Res: " + checkWild(str, pattern));
    }
}
