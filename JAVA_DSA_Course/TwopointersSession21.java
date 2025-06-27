package JAVA_DSA_Course;
import java.util.*;

public class TwopointersSession21 {
    public static void main(String[] args) {
        //Brute force Approach
        HashMap<Integer,Integer> h = new HashMap<>();
        int arr[]= {1,2,1,5,2,5,8,6,7,8,5};
        for (int i = 0; i < arr.length; i++) {
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        System.out.println(h.size());
        System.out.println(h.entrySet());

        int a = h.size()/2;

        List<Integer> keylist = new ArrayList<>(h.keySet());

        System.out.println(keylist.get(a));
    }
}
