package Sorting;


public class ProblemsOnSorting {
    //Given an integer array arr move all zeros to the end of it while maintaining the relative order of the non zeros element note that you must do this in-place without making a copy of the array


    // static void BubbleSortProblem(int a[]){
    //     int n = a.length;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=0;j<n-i-1;j++){
    //             if(a[j]==0 && a[j+1] !=0){
    //                 int temp = a[j];
    //                 a[j]=a[j+1];
    //                 a[j+1]=temp;
    //             }
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr []={110,5,0,0,42};
    //     BubbleSortProblem(arr);
    //     int n = arr.length;
    //     for(int i =0;i<n;i++){
    //         System.out.println(arr[i]+" ");
    //     }
    // }



    //Give an arrayof names of the fruites you are supposed to sort it in lexograpical order using the selection sort
    static void sortfruits(String[] fruites){
        int n = fruites.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(fruites[j].compareTo(fruites[min_index])<0){
                    min_index=j;
                }

            }

            String temp = fruites[i];
            fruites[i]=fruites[min_index];
            fruites[min_index]=temp;
        }

        for(int i =0;i<n;i++){
            System.out.println(fruites[i]);
        }
    }
    public static void main(String[] args) {
        String[] fruites = {"apple", "kiwi","cherry","bannana"};

        sortfruits(fruites);
    }
    
}
