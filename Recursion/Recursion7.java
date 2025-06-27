package Recursion;

public class Recursion7 {

    //Search an element in the array using recursion

    // static boolean Search(int [] arr,int target,int n,int idx){
    //     //Base case 
    //     if(idx>=n){
    //         return false;
    //     }

    //     //Self work
    //     if(arr[idx]==target) return true;

    //     //Recursive work
    //     return Search(arr, target, n, idx+1);

    // }
    // public static void main(String[] args) {
    //     int [] arr = {7,9,5,3,8};
    //     if(Search(arr,8,arr.length, 0)){
    //         System.out.println("YES");

    //     }
    //     else{
    //         System.out.println("NO");
    //     }
        
    // }

    //Search an element in the array using recursion and the indexes 
    // static int Search(int [] arr,int target,int n,int idx){
    //     //Base case 
    //     if(idx>=n){
    //         return 0;
    //     }

    //     //Self work
    //     if(arr[idx]==target) {
    //         System.out.println("Yes");
    //         System.out.println(idx);
    //         return 1;
    //     }

    //     //Recursive work
    //     Search(arr, target, n, idx+1);

    //     return 0;

    // }
    // public static void main(String[] args) {
    //     int [] arr = {7,9,8,3,80};
    //     Search(arr,8,arr.length, 0);
    // }

    //Give n an array arr of the size N and an integer X.The task is to find all the indices of the integer X in the array

    static void SearchIndices(int[] arr,int idx,int target){
        if(idx>=arr.length){
            return ;
        }

        //Self work
        if(arr[idx]==target) {
            System.out.println(idx);
        }

        //Recursive work
        SearchIndices(arr, idx+1,target);
    }
    public static void main(String [] args){
        int arr[]= {12,2,5,3,7,2,4,2};
        SearchIndices(arr, 0,2);
    }
       
}
