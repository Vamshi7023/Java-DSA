package Sorting;

public class Bublesort {
    static void bublesort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n-1 ; i++) {//n-1 is used ecause last element will be automatically sorted after sorting the n-1 elements
            for (int j = 0; j < n - i - 1; j++) {//n-i-1 is writen because already last i postions are sorted so no need to check them again

                if (a[j] > a[j + 1]) {//This line is writen to check and swap the elements

                    //Swapping the elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    } 

    public static void main(String[] args) {
        int a[] = { 2, 1, 7, 14, 5 };
        bublesort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
     }
}