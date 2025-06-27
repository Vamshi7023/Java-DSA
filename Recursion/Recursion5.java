package Recursion;

public class Recursion5 {
    //Finding the Gretest Common divisor (GCD) using recursion Worst case approach
    static int IGCD(int x,int y){//Iterative approach
        while (x%y!=0) {
            int rem = x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    static int gcd(int x,int y){//Euclids Algorithm aapproach
        if(y==0){
            return x;
        }
        return gcd(y, x%y);
    }
    public static void main(String[] args) {
        System.out.println(IGCD(15, 24));
        System.out.println(gcd(15, 24));
    }
}
/////////////////////////////////////WATCH COMPLETE VIDEO IT HAS BEEN SKIPED//////////////////////////////////////////
