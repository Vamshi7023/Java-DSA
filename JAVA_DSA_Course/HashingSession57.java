package JAVA_DSA_Course;
import java.util.*;

public class HashingSession57 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2};
        int k = 1;
        int count = 0;

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int num : arr) {
            uniqueNumbers.add(num);
        }

        for (int num : uniqueNumbers) {
            if (uniqueNumbers.contains(num + k)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
