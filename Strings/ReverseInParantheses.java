public class ReverseInParantheses {
    static int i = 0;

    public static String getString(String str) {
        char[] arr = str.toCharArray();
        return helper(arr);
    }

    public static String helper(char[] arr) {
        StringBuilder sb = new StringBuilder();
        while (i < arr.length) {
            if (arr[i] == ')') {
                i++;
                return sb.reverse().toString();

            } else if (arr[i] == '(') {
                i++;
                String st = helper(arr);
                sb.append(st);

            } else {
                sb.append(arr[i++]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(ed(et(oc))el)";
        System.out.println();
        System.out.print(getString(s));
    }
}
