package JAVA_DSA_Course;

public class BinarySearchSession2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9};
        int l = 0;
        int r = arr.length - 1;
        int k = 6;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] < k) {
                l = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] < k) {
                    System.out.println("Element would be placed at index: " +arr[mid]);
                    return;
                } else {
                    r = mid - 1;
                }
                
            } 
        }

        System.out.println("Element not found");
    }
}
