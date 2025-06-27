package Sorting;

public class MergeSort {
    static void merge(int arr[], int lb, int mid, int ub) {
        int n1 = mid - lb + 1;// Size of the left array
        int n2 = ub - mid;// Size of the Right arry
        int left[] = new int[n1];// creating the left array
        int right[] = new int[n2];// Creating the right array
        int i, j, k;
        for (i = 0; i < n1; i++)
            left[i] = arr[lb + i];// Adding the elements in the left array from 0 position to mid element
        for (j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];// Adding the element in the right array from mid+1 to the n-1 position
        i = 0;// left arr i starts from 0
        j = 0;// right arr j starts from 0
        k = lb;// main arr k starts from 0 which is equal to lb
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        // Entering the remaining elements if the i or j loop comes to the end
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    static void Mergesort(int arr[], int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;

            Mergesort(arr, lb, mid);

            Mergesort(arr, mid + 1, ub);

            merge(arr, lb, mid, ub);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 9, 1, 4, 0, 4 };
        int n = arr.length;
        int lb = 0;
        int ub = n - 1;
        Mergesort(arr, lb, ub);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
