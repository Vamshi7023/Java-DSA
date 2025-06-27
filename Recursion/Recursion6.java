package Recursion;

public class Recursion6 {

    //Printing the array using recursion

    // static void arr(int [] arr,int idx){
    //     if(idx==arr.length){
    //         return;
    //     }
    //     System.out.println(arr[idx]);

    //     arr(arr, idx+1);
    // }
    // public static void main(String[] args) {
    //     int [] arr = {1,2,3,4,5};
    //     arr(arr, 0);
    // }

    //Printing the greatest element in the array using recursion

    // static int greatest(int [] arr,int idx){
        
    //     //Base case 
    //     if(idx==arr.length){
    //         return idx;
    //     }

    //     //Recursive work

    //     int G=greatest(arr, idx+1);

    //     //Self work

    //     return Math.max(arr[idx], G);//Traversing and finding the max

    // }

    // public static void main(String[] args) {
    //     int [] arr = {7,9,423,3,800000};
    //     System.out.println(greatest(arr, 0));
    // }
    

    //Sum of integers in the array using recursion
    static int SumOfArray(int [] arr,int idx){
        
        //Base case 
        if(idx==arr.length-1){
            return arr[idx];
        }

        //Recursive work

        int G=SumOfArray(arr, idx+1);

        //Self work

        return arr[idx]+ G;
    }

    public static void main(String[] args) {
        int [] arr = {7,9,4,3,8};
        System.out.println(SumOfArray(arr, 0));
    }
}
