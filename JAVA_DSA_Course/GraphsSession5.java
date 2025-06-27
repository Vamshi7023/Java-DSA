package JAVA_DSA_Course;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphsSession5 {
    static int[] used = new int[100005];
    static ArrayList<Integer>[] G = new ArrayList[100005];
    static int c;

    static void dfs(int source) {
        System.out.print(source + " ");
        c++;
        used[source] = 1;

        for (int u : G[source]) {
            if (used[u] == 0) {
                dfs(u);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Initialize each list in the adjacency array
        for (int i = 0; i <= n; i++) {  // Using i <= n to include 0-based index as well
            G[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) { // Standard for loop iteration
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            G[x].add(y);
            G[y].add(x);
        }

        for (int i = 0; i < n; i++) {
            if (used[i] == 0) {
                c = 0;
                dfs(i);
                System.out.println();
                System.out.println(c);
            }
        }
    }
}
