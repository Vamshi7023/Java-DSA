package JAVA_DSA_Course;
import java.util.*;
public class Hashingsession19 {
    // --------------------------------------------Find these question in the leetcode---------------------------------------------------------
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        // Hash maps to keep track of occurrences of elements in A and B
        Set<Integer> seenInA = new HashSet<>();
        Set<Integer> seenInB = new HashSet<>();
        int commonCount = 0;
        for (int i = 0; i < n; i++) {
            // Add current elements of A and B to their respective sets
            int a = A[i];
            int b = B[i];
            // If 'a' has been seen in B before, it's a new common element
            if (seenInB.contains(a)) {
                commonCount++;
            }
            // If 'b' has been seen in A before, it's a new common element
            if (seenInA.contains(b)) {
                commonCount++;
            }
            // If 'a' and 'b' are the same and have not been counted yet
            if (a == b && !seenInA.contains(a) && !seenInB.contains(b)) {
                commonCount++;
            }
            // Add elements to the sets
            seenInA.add(a);
            seenInB.add(b);
            // Update the prefix common array
            C[i] = commonCount;
        }
        return C;
    }
    public static void main(String[] args) {
        int a[] = {1,3,2,4};
        int b[] = {3,1,2,4};
        int c[] = new int[a.length];

        for (int i = 0; i < b.length; i++) {
            // c[i] = findThePrefixCommonArray(i,a,b);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
    
}