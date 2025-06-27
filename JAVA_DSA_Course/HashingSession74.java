package JAVA_DSA_Course;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashingSession74 {
    public static void main(String[] args) {
        String arr[] = {"Cat","Dog","Cat","what","Dog"};
        HashMap<String,Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            h.put(arr[i],h.getOrDefault(arr[i], 0)+1);
        }
        ArrayList<String> l = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : h.entrySet()){
            int b = entry.getValue();
            String a= entry.getKey();
            if (b>1) {
                l.add(a);
            }
        }
        Collections.sort(l);
        System.out.println(l);
    }
}
