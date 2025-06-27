package recuersion2;

public class class1 {
    // static int count=0;
    // public static void print(String name){
    // if (count==5) {
    // return;
    // }
    // System.out.println("Vamshi");
    // count++;
    // print(name);

    // }
    // public static void main(String[]args){
    // print("Vamshi");
    // }

    public static void oneton(int n) {
        if (n == 0) {
            return;
        }

        oneton(n - 1);
        System.out.print(n + " ");

    }

    public static void nto1(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        nto1(n - 1);
    }

    // parameteraized
    public static void sumofn(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sumofn(i - 1, sum + i);

    }

    // functional
    public static int sumofnf(int n) {
        if (n < 1) return 0;
        return n+= sumofnf(n - 1);
    }

    public static void main(String[] args) {
        oneton(5);
        System.out.println();
        nto1(5);
        System.out.println();
        int n = 5;
        sumofn(n, 0);
        int a = sumofnf(n);
        System.out.println(a);
    }
}