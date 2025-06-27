package Sorting;
class Quicksort {

    static int partition(int arr[], int lb, int ub) {
        int pivot = arr[lb];
        int count =0;


        //Keeping the pivot element in the correct position
        for(int i=lb+1;i<=ub;i++){//lb+1 because first elemetnt will be the pivot element so it will compare to every element, it should not compare with it self
            if(arr[i]<=pivot){
                count ++;
            }
        }
        int pivotIndex = lb + count;
        int temp = arr[lb];
        arr[lb] = arr[pivotIndex];
        arr[pivotIndex] = temp;


        int i = lb;
        int j = ub;

        //Keeping the elements in the correct positions
        while(i < pivotIndex && j > pivotIndex){
            while (arr[i]<=pivot) {//<= because all the duplecate values should be coming behind the pivot value
                i++;
            }
            while (arr[j]>pivot) {
                j--;
            }

            if(i<pivotIndex && j > pivotIndex){
                int temap = arr[i];
                arr[i] = arr[j];
                arr[j] = temap;
                i++;
                j--;
            }

        }

        return pivotIndex;

    }

    static void QuickSort(int arr[], int lb, int ub) {
        if (lb >= ub) return;
            int pivot = partition(arr, lb, ub);
            QuickSort(arr, lb, pivot - 1);
            QuickSort(arr, pivot + 1, ub);
        
    }

    public static void main(String[] args) {
        int arr[] = {7,1, 3, 6, 9, 10, 4, 100};
        int lb = 0;
        int ub = arr.length - 1;
        

        QuickSort(arr, lb, ub);

        // Print the sorted array
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
