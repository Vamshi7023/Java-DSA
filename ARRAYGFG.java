public class ARRAYGFG {
    static int insertElement(int[] arr, int n, int capacity, int key) {
        // Check if the array is already full
        if (n >= capacity) {
            System.out.println("Array is full. Cannot insert element.");
            return n; // Return current size without any change
        }

        // Insert the key at the end of the array
        arr[2] = key;

        // Increment the size after insertion
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 }; // Example array

        int n = arr.length; // Current size of the array
        int capacity = 10; // Maximum capacity of the array
        int key = 16; // Element to be inserted

        System.out.println("Before Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Insert the element and update the size of the array
        n = insertElement(arr, n, capacity, key);

        System.out.println("\nAfter Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
