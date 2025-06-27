package JAVA_DSA_Course;

import java.util.*;

public class GraphsSession2 {
    public static void main(String[] args) {
        //BFS
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = s.nextInt();
        int e = s.nextInt();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        boolean[] vis = new boolean[n];
        for(int i=0;i<e;i++){

            int a = s.nextInt();
            int b = s.nextInt();

            adj.get(a).add(b);
            adj.get(b).add(a);

        }
        vis[0] = true;//rootnode mark as visited
        Queue<Integer> q= new ArrayDeque<>();
        q.add(0);
        while (!q.isEmpty()) {
            int node = q.poll();
            l.add(node);
            for(int a:adj.get(node)){
                if (!vis[a]) {
                    vis[a] = true;
                    q.add(a);
                }
            }         
        }
        System.out.println(l);
    }
}
