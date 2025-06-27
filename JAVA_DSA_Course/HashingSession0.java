package JAVA_DSA_Course;

import java.util.HashMap;

public class HashingSession0 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int arr[] = {1,1,3,4,4,2,2,4};
        for(int i=0;i<arr.length;i++){
            if(!h.containsKey(arr[i])){
                h.put(arr[i], 1);
            }
            else{
                h.put(arr[i], h.get(arr[i])+1);
            }
            
        }

        int max = Integer.MIN_VALUE;
        int k=0;
        for(HashMap.Entry<Integer,Integer> l : h.entrySet()){
            if (max<l.getValue()) {
                max = l.getValue();
                k = l.getKey();
            }
        }
        System.out.println(max+" "+k);
        int min = Integer.MAX_VALUE;
        for(int j : h.values()){
            if(min>j){
                min = j;
            }
        }
        System.out.println(min);
    }
}
