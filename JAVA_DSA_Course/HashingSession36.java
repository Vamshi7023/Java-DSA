package JAVA_DSA_Course;

import java.util.HashMap;

public class HashingSession36 {
    public static void main(String[] args) {
        // Brute force approach

        // int A[] = { 2, 5 };
        // int B[] = { 3, 8 };
        // int C[] = { -5, 8 };
        // int D[] = { 5, 10 };
        // int E[] = { -10, 100 };
        // int count =0;
        // for (int i = 0; i < E.length; i++) {
        // for (int j = 0; j < E.length; j++) {
        // for (int j2 = 0; j2 < E.length; j2++) {
        // for (int k = 0; k < E.length; k++) {
        // for (int k2 = 0; k2 < E.length; k2++) {
        // if (A[i]+B[j]+C[j2]+D[k]+E[k2]==0) {
        // count++;
        // System.out.println(A[i]+" "+B[j]+" "+C[j2]+" "+D[k]+" "+E[k2]);
        // }
        // }
        // }
        // }
        // }
        // }
        // System.out.println(count);

        int A[] = { 2, 5 };
        int B[] = { 3, 8 };
        int C[] = { -5, 8 };
        int D[] = { 5, 10 };
        int E[] = { -10, 100 };
        int count = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < E.length; i++) {
            h.put(E[i], h.getOrDefault(E[i], 0) + 1);
        }
        for (int i = 0; i < E.length; i++) {
            for (int j = 0; j < E.length; j++) {
                for (int j2 = 0; j2 < E.length; j2++) {
                    for (int k = 0; k < E.length; k++) {
                        int y = -(A[i] + B[j] + C[j2] + D[k]);
                        if (h.containsKey(y)) {
                            count++;
                            System.out.println(A[i] + " " + B[j] + " " + C[j2] + " " + D[k]);
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
