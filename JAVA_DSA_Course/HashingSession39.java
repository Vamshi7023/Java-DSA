package JAVA_DSA_Course;

public class HashingSession39 {
    public static boolean matching(int a[],int i){
        int lhs =0;
        int rhs =0;
        int total_sum =0 ;
        for (int j = 0; j < a.length; j++) {
            total_sum+=a[j];
        }
        for (int j = 0; j < i+1; j++) {
            lhs +=a[j];

            rhs = total_sum-lhs;//calculating the total sum and then removien the lhs part will automaticaly give the rhs part sum
            if (lhs==rhs) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {5,0,0,5,0,0};
        int n = a.length;
        boolean z = false;
        for (int i = 1; i < n-1; i++) {
            z = matching(a,i);
            if (z==true) {

                break;
            }
        }
        System.out.println(z);
    }
}
