public class CelebrityProblem {

    static int findCelebrity(int[][] M, int n) {
        int a = 0, b = n - 1;
        while (a < b) {
            if (M[a][b] == 1)
                a++;
            else
                b--;
        }

        int celeb = a;

        for (int i = 0; i < n; i++) {
            if (i != celeb) {
                if (M[celeb][i] == 1 || M[i][celeb] == 0)
                    return -1;
            }
        }

        return celeb;
    }

    public static void main(String[] args) {
        int[][] demo = {
                { 0, 0, 1, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 1, 0 } };

        int celebrity = findCelebrity(demo, demo.length);

        System.out.println();
        System.out.println(celebrity + " ");
    }
}
