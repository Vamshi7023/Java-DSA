package JAVA_DSA_Course;
import java.util.*;
public class GraphsSession1 {
    public static void main(String[] args) {
        //Brute force approach 
        // int n = 5;
        // int m = 6;
        // int [][] a = new int[6][6];
        // Scanner s = new Scanner(System.in);
        // for (int i = 0; i < m; i++) {
        //     int b = s.nextInt();
        //     int c = s.nextInt();

        //     a[b][c] = 1;
        //     a[c][b] = 1;
        // }
        // for (int i = 0; i < a.length; i++) {
        //     int count =0;
        //     for (int j = 0; j < a.length; j++) {
        //         if (a[i][j]==1) {
        //             count ++;
        //         }
        //     }
        //     System.out.println(i+" "+count);
        // }

        //Effecient Approach
        
        Scanner s = new Scanner(System.in);
        int n = 5;//number of nodes 
        int m = 4;//number of edges
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        
        // Creating n number of empty lists inside the adjacency list
        for (int i = 0; i < n; i++) {
            a.add(new ArrayList<>()); // Initialize each list
        }
        
        // Input the edges for the graph
        for (int i = 0; i < m; i++) {
            int x = s.nextInt(); // First vertex of the edge
            int y = s.nextInt(); // Second vertex of the edge
            
            // Add y to x's list and x to y's list since it's an undirected graph
            a.get(x).add(y);
            a.get(y).add(x);
        }
        
        // Output the adjacency list and size of each node's connection
        System.out.println();
        System.out.println();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // int c = a.get(i).size(); // Get the number of edges for node i
            // sum+=c;
            System.out.println(i +" --> "+a.get(i));
        }
        System.out.println(sum);
        
    }
}
