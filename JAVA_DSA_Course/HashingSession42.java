package JAVA_DSA_Course;
import java.util.*;
public class HashingSession42 {
    // public static void main(String[] args) {
    //     int a[] = {1,2,3,4,-1,-2,-2};
    //     int count=0;
    //     for (int i = 0; i < a.length; i++) {
    //         for (int j = i+1; j < a.length; j++) {
    //             for (int j2 = j+1; j2 < a.length; j2++) {
    //                 for (int k = j2+1; k < a.length; k++) {
    //                     if (a[i]+a[j]+a[j2]+a[k]==0) {
    //                         count++;
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     System.out.println(count);
    // }
    // Optimized Approach O(2*n^3) --> O(n^3)
    public static void main(String[] args) {
        int a[] = {1,2,3,4,-1,-2,-2};
        int count=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 3; i < a.length; i++) {
            h.put(a[i],h.getOrDefault(a[i],0)+1);
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int j2 = j+1; j2 < a.length-1; j2++) {
                    int d = -(a[i]+a[j]+a[j2]);
                    if (h.containsKey(d)) {
                        count+=h.get(d);
                    }
                    h.remove(a[j2+1]);
                }
                for (int j2 = j+2; j2 < a.length; j2++) {
                    h.put(a[j2],h.getOrDefault(a[j2],0)+1);
                }
            }
        }
        System.out.println(count);
    }

    //O(n^2) approach in part 2 video
}
