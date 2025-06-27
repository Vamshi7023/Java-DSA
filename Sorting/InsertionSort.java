package Sorting;

public class InsertionSort {

    // static void Insertion(int a[]) {
    //     int n = a.length;
    //     for (int i = 1; i < n; i++) {
    //         for (int j = i; j > 0; j--) {
    //             if (a[j] < a[j - 1]) {
    //                 int temp = a[j];
    //                 a[j] = a[j - 1];
    //                 a[j - 1] = temp;
    //             }
    //         }
    //     }

    //     for (int k = 0; k < n; k++) {
    //         System.out.print(a[k] + " ");
    //     }
    // }

    // public static void main(String[] args) {
    //     int a[] = { 1, 5, 90, 3, 7 };

    //     Insertion(a);
    // }






    static void Insertion(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr [] = {5,2,7,5,4};
        Insertion(arr);
    }

}
