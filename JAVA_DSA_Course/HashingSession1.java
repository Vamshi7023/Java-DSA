package JAVA_DSA_Course;
import java.util.HashMap;
public class HashingSession1 {
    // public static void main(String[] args) {
    //     int arr [] = {3,1,3,3,2,3};
    //     for(int i = 0;i<arr.length;i++){
    //         for(int j = i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j]&&Math.abs(i-j)==2){
    //                 System.out.println(i+" "+j);
    //             }
    //         }
    //     }
    // }
    
    //Optimized way
    public static void main(String[] args) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int arr[] = {3,1,4,5,2,3,4,3,5};
        int k=3;
        for(int i=0;i<arr.length;++i){
            if(h.containsKey(arr[i]) && i-h.get(arr[i])<=k){//h.get will give the value of the key element
                System.out.println("Yes");
            }
            else{
                h.put(arr[i],i);
            }
        }
    }
}
