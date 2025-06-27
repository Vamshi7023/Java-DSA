package JAVA_DSA_Course;
import java.util.*;
public class TwoPointersSession19 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {1,2,1};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        

        //MY METHOD 
        // int i=arr1.length-1;
        // int j=0;
        // int count =0;
        // while (i >= 0 && j < arr2.length) {
        //     if(arr1[i]>arr2[j]){
        //         count++;
        //         i--;
        //         j++;
        //     }
        //     else break;
        // }

        //KUMAR K METHOD BOTH WILL GIVE SAME OUTPUT
        int i=0;
        int j=0;
        int count =0;
        while (i <arr1.length && j < arr2.length) {
            if(arr1[i]>arr2[j]){
                count++;
                i++;
                j++;
            }
            else i++;
        }

        System.out.println(count);
    }
}
