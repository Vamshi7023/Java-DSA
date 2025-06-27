package JAVA_DSA_Course;
public class HashingSession44 {
    public static int join(int i,int j){
        String a = Integer.toString(i);
        String b = Integer.toString(j);
        String c = a+b;
        int d = Integer.parseInt(c);
        return d;
    }
    public static void main(String[] args) {
        int a [] = {3,14,15};
        int sum =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                sum += join(a[i],a[j]);
            }
        }
        System.out.println(sum);
    }
}