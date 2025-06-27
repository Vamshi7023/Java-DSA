package JAVA_DSA_Course;

public class HasingSession23 {
    public static void main(String[] args) {
        int arr[] = {5,8,10};
        int k = 3;
        int arr2[] = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            int a=arr[i]+k;
            int b = arr[i]-k;
            for (int j = b; j < a; j++) {
                arr2[j]+=1;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]>max) {
                max = arr2[i];
            }
        }
        System.out.println(max);
    }   
}
