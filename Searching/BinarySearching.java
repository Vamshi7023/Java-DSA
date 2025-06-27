package Searching;
import java.util.Arrays;

public class BinarySearching {
    static int BinarySearch(int arr[],int target){
        Arrays.sort(arr);
        int i=0;
        int j= arr.length-1;

        

        while(i<=j){
            int mid=i+(j-i)/2;
            if(target==arr[mid]){
                return mid;
            }

            if(arr[mid]>target){
                j=mid-1;
            }
            else i=mid+1;
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,10,12,30,36,40,46,70};
        
        int target = 46;

        System.out.println(BinarySearch(arr, target));

    }
}
