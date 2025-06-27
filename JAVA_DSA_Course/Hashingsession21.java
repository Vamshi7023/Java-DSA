package JAVA_DSA_Course;
import java.util.HashMap;
public class Hashingsession21 {
    public static int check(int i){
        int sum =0;
        while (i>0) {
            int a = i%10;
            sum+=a;
            i/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a [] = {51,71,17,42};
        int max =-1;
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int digitsum = check(a[i]);
            if (h.containsKey(digitsum)) {
                int d = h.get(digitsum)+a[i];
                max = Math.max(max,d);
                h.put(digitsum, Math.max(a[i],h.get(digitsum)));
            }
            else{
                h.put(digitsum,a[i]);
            }
        }
        System.out.println(max);
    }
}
