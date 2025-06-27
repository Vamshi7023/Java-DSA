package JAVA_DSA_Course;

import java.util.*;

public class GraphsSession6 {
    public static void bfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int[] component, int countid) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(i);
        vis[i] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            component[node] = countid;
            for (int a : adj.get(node)) {
                if (!vis[a]) {
                    vis[a] = true;
                    q.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Number of nodes
        int e = s.nextInt(); // Number of edges

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] component = new int[n];
        boolean[] vis = new boolean[n];
        int countid = 1;

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) { // Read edges
            int u = s.nextInt();
            int v = s.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        for (int i = 0; i <n; i++) {
            if (!vis[i]) {
                bfs(i, adj, vis, component, countid);
                countid++;
            }
        }

        System.out.println("Component array:");
        System.out.println(Arrays.toString(component));

        
    }
}
