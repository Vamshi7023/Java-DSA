package JAVA_DSA_Course;
import java.util.*;
public class TwoPointersSession10 {
    public static void main(String[] args) {
        int[] b = {2,1,4,3,2,1,1,4};
        int n = b.length;
        int l = 2;
        int r = 4;
        int u = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> k = new HashMap<>();
            for (int j = i; j < n; j++) {
                if (b[j] >= l && b[j] <= r) {
                    k.put(b[j], k.getOrDefault(b[j], 0) + 1);
                }
                if (k.size() == Math.abs(r - l + 1)) {
                    int length = Math.abs(j - i + 1);
                    u = Math.min(length, u);
                }
            }
        }
        System.out.println(u);
    }
}
