package JAVA_DSA_Course;
import java.util.*;
public class HashingSession8 {
    // public static void main(String[] args) {
    //     int arr[] = {3,-1,2,-2,4,3};
    //     int k=4;
    //     int max=0;
    //     int min = Integer.MAX_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         int sum=0;
    //         for(int j=i;j<arr.length;j++){
    //             sum +=arr[j];
    //             if(sum==k && j-i+1>max){
    //                 max = j-i+1;
                    
    //             }
    //             else{min = j-i+1;}
    //         }
    //     }
    //     System.out.println(max);
    //     System.out.println(min);
    // }

    public static void main(String[] args) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int arr [] = {10,2,-2,-20,10};
        int sum=0;
        int max = 0;
        int k = -10;
        int pair[] = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (h.containsKey(sum-k)) {
                int length = i - h.get(sum-k);
                if(length>max){
                    max = length;
                }
                pair[0] = h.get(sum-k)+1;
                pair[1] = i;
            }
            if (!h.containsKey(sum)) {
                h.put(sum, i);  
            }
        }
        System.out.println(max);
        if (pair[0] != -1) {
            System.out.println( pair[0] + ", " + pair[1] );
        } else {
            System.out.println("No subarray with sum " + k + " found.");
        }
    }
}