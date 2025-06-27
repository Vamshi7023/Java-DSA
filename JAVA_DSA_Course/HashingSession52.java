package JAVA_DSA_Course;
import java.util.*;
public class HashingSession52 {
    public static void main(String[] args) {
        int sum = 0;
        String a = ".abcaab";
        HashMap<Character, Integer> k = new HashMap<>();
        int l = 1;
        int r = 6;
        for (int i = l; i <= r; i++) {
            k.put(a.charAt(i), k.getOrDefault(a.charAt(i), 0) + 1);
            sum += k.get(a.charAt(i));
        }
        System.out.println(sum);
    }
}
