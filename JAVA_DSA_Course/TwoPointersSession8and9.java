package JAVA_DSA_Course;

public class TwoPointersSession8and9 {
    public static void main(String[] args) {
        String a = "Vamshi";
        String b = "asm";
        int count=0;
        int i=0,j=0;
        while (i<a.length()&&j<b.length()) {
            if(a.charAt(i)==b.charAt(j)){
                i++;
                j++;
                count++;
            }
            else{
                i++;
            }
        }
        if(count==b.length()){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
    //session 9 with numbers in same way 
    //Arr1 = {1,2,5,8,8,6,5,4,3};
    //Arr2 = {5,5}
    //Output: True/Yes
}
