package JAVA_DSA_Course;

public class TwoPointersSession2 {

    //Brute force approach 

    // public static int Closest(int arr[],int arr1[],int target){
    //     int cloaseset=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr1.length;j++){
    //             int a = arr[i]+arr1[j];
    //             if(a<=target&&a>cloaseset){//a>closest because we should find weather the new sum is greater than previous sum and closest to the target
    //                 cloaseset = a;
    //             }
    //         }
    //     }
    //     return cloaseset;
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,4,5,7};
    //     int arr1[] = {10,20,30,40};
    //     int target = 32;
    //     System.out.println(Closest(arr, arr1, target));
    // }



    //Efeceient approach

    public static int Closest(int arr[],int arr1[],int target){
        int i=0;
        int j=arr1.length-1;
        int n = 0;
        while (i<arr.length && j>=0) {
            n = arr[i]+arr1[j];
            if(n<=target){
                return n;
            }
            else if(n>target){
                j--;
            }
            else{
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int arr1[] = {1,4,5,7};
        int arr[] = {10,20,30,40};
        int target = 32;
        System.out.println(Closest(arr, arr1, target));
    }
    
}
