package JAVA_DSA_Course;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapPart2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer,Integer> h= new HashMap<>();
        int arr [] = {1,3,4,51,23,4,5,3,3,1};
        for(int i=0;i<arr.length;i++){
            if (!h.containsKey(arr[i])) {
                h.put(arr[i], 1);
            }
            else{
                h.put(arr[i], h.get(arr[i])+1);
            }
        }
        int q = s.nextInt();
        for(int i=0;i<q;i++){
            int target = s.nextInt();
            //System.out.println(h.containsKey(target));
            int e = h.getOrDefault(target, null);
            System.out.println(e);
        }
    }
}
