package JAVA_DSA_Course;
import java.util.*;
public class HashingSession56 {
    public static void main(String[] args) {
        int a[] = {1,8,10,8,-5,8}; 
        int n = a.length;
        int prefix[] = new int[n+1];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = a[i-1]+prefix[i-1];
        }
        HashMap<Integer,Integer> h = new HashMap<>();
        int ans = 0 ;
        for (int i = 0; i < n; i++) {
            if (!h.containsKey(a[i])) {
                h.put(a[i],prefix[i]);
            }
            else{
                ans = Math.max(ans,prefix[i+1]-h.get(a[i]));
            }
            
        }
        System.out.println(ans);
    }
}
