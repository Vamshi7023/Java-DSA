import java.util.*;

public class random1 {
    public static void main(String[] args) {
        int a[] = { 2, 1, 2, 1, 1, 6 };
        int sum=0;
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(h.containsKey(a[i])){
                if (h.get(a[i])>=a[i]) {
                    sum+=h.get(a[i]);
                }
            }
            h.put(a[i],h.getOrDefault(a[i],0)+1);
        }
        System.out.println(sum);
    }
}
