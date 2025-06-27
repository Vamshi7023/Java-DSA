package RandomProblems;

public class MajorityElements {
    static int majority(int arr[], int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            int majority = arr[i];
            if (arr[i] == majority) {
                count++;
                if (count > n / 2) {
                    return majority;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3,1,3,3, 2 };
        int n = arr.length;

        System.out.println(majority(arr, n));

    }
}
