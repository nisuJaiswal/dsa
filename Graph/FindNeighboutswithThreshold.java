package Graph;

public class FindNeighboutswithThreshold {
    public static int findCity(int n, int[][] edges, int t) {
        int m = edges.length;
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    d[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (edges[i][2] <= t) {
                d[edges[i][0]][edges[i][1]] = edges[i][2];
                d[edges[i][1]][edges[i][0]] = edges[i][2];
            }
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                if (d[i][k] == Integer.MAX_VALUE)
                    continue;
                for (int j = i; j < n; j++) {
                    if (d[k][j] < Integer.MAX_VALUE && d[i][j] > (d[i][k] + d[k][j])) {
                        d[i][j] = d[j][i] = d[i][k] + d[k][j];
                    }
                }
            }
        }
        int count = n;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (d[i][j] <= t) {
                    c++;
                }
            }
            if (c <= count) {
                count = c;
                ans = i;
            }
        }
        return ans;
    }
}
