package JAVA_DSA_Course;
import java.util.HashMap;
import java.util.Map;
public class HashingSession2 {
    public static void main(String[] args) {
        int arr [] ={1,3,4,5,2,5,6};
        int k = 10;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if (arr[i]+arr[j]==k) {
        //             System.out.println("Yes");
        //         }
        //     }
        // }
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int g = k-arr[i];
            if(h.containsKey(g)){
                System.out.println("Yes");
            }
            h.put(arr[i],i);   
        }
    }
}