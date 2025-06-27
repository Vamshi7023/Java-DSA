package JAVA_DSA_Course;

public class BinarySearchsession1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k=6;
        int l=0;
        int n = arr.length-1;
        int r = n-1;
        
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==k){
                System.out.println(arr[mid]);
                return;
            }
            else if(arr[mid]>k){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
    }
}
