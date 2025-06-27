package Sorting;

public class SelectionSort {


    //Solve these code afterwards but alternative code is writen down side

    // static void Selection(int a[]){
    //     int n = a.length;
    //     int b= a[0];
    //     for(int i = 0 ; i<n;i++){
    //         if(a[i]<b){
    //             b=a[i];
    //         }            
    //         int ans [] = new int[n];
    //         for(int j=0;j<n;j++){
    //             ans[j]=b;
    //             System.out.println(ans[j]+" ");
    //         }
    //         a[i] = Integer.MAX_VALUE;
    //     }
    //     //System.out.println(b);
    // }

    // public static void main(String[] args) {
    //     int a[] = {9,1,6,90,12,4};
    //     Selection(a);
    // }

    //Alternative method for selection sort

    static void Selectin(int a[]){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){//next 5 lines are use to find the minimum element in the array 
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex]=temp;         
        }
        for(int k=0;k<n;k++){
            System.out.print(a[k] + " ");
        }
    }

    public static void main(String[] args) {
        int a [] = {4,1,3,9,7};
        Selectin(a);
    }

}
