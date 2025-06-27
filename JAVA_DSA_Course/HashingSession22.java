package JAVA_DSA_Course;
import java.util.HashMap;
public class HashingSession22 {
    public static void main(String[] args) {
        String a = "abdadccacd";
        String c = "edac";
        int min =1000;
        HashMap<Character,Integer> h = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            h.put(a.charAt(i), h.getOrDefault(a.charAt(i),0)+1);
        }
        for (int i = 0; i < c.length(); i++) {
            if (!h.containsKey(c.charAt(i))) {
                min=0;
            }
            if (h.containsKey(c.charAt(i))) {
                min = Math.min(min, h.get(c.charAt(i)));
            }
        }
        System.out.println(min);
    }
}
