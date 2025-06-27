package JAVA_DSA_Course;
import java.util.*;
public class HashingSession23 {
    public static void main(String[] args) {
        int arr[] ={1,5,5,1,1,8,8,10,10};
        int count=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(h.entrySet());
        for (int key : h.keySet()) {
            if (h.get(key)==1) {
                System.out.println("-1 No trips");
                return;
            }
            if (h.get(key)>=2) {
                count++;
            }
        }
        System.out.println(count+" Trips");
    }
}
