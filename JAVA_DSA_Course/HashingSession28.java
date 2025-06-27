package JAVA_DSA_Course;
import java.util.*;
public class HashingSession28 {
    public static void main(String[] args) {
        int arr2[] = {10,5,2,7,1,9,8,7};
        HashMap <Integer,Integer> h = new HashMap<>();
        int sum=0;
        int k=15;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            sum+=arr2[i];
            if (h.containsKey(sum-k)) {
                min = Math.min(min, i-h.get(sum-k));
            }
            if (!h.containsKey(sum)) {
                h.put(sum, i);
            }
        }
        System.out.println(min);
    }
}