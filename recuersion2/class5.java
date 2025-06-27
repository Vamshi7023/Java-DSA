package recuersion2;

public class class5 {
    public static int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        int a = fibonacci(n-1);
        int b = fibonacci(n-2);
        return a+b;
    }
    public static void main(String[] args) {
        int c = fibonacci(3);
        System.out.println(c);
    }
}
