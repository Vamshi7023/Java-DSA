public class Array4 {

    // swaping the numbers without using a 3rd variable

    // static void (int a, int b) {
    //     System.out.println("Original values a: " + a);
    //     System.out.println("Original values b: " + b);

    //     a = a + b;
    //     b = a - b;
    //     a = a - b;

    //     System.out.println("Changed values a: " + a);
    //     System.out.println("Changed values b: " + b);
    // }

    // public static void main(String[] args) {
    //     int a = 9;
    //     int b = 3;

    //     (a, b);
    // }



    //Reversing an array consisting of integer values


    // static void printArray(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i]+ " ");
    //     }
    // }

    // static int [] reverseArray(int arr[] ){
    //     int n =arr.length;
    //     int ans []=new int[n];
    //     int j =0;
    //     for(int i=n-1;i>=0;i--){
    //         ans[j++]=arr[i];
    //     }
    //     return ans;
    // }

    // public static void main(String[] args) {
    //     int arr []={1,2,3,4,5};
    //     int ans[] = reverseArray(arr);
    //     printArray(ans);
    // }


    //swaping the variables in an array without using another array

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }

    static void array(int[] arr,int i,int j){
        while(i<j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
        
            i++;
            j--;
        }
    }
    static void reverseArray(int [] arr){
        int i=0;
        int j = arr.length-1;
        array(arr, i, j);
        
    }
    public static void main(String[] args) {

        int arr []={1,2,3,4,5,6};
        reverseArray(arr);
        printArray(arr);
        
    }


    //Rotate the given array a by k steps where k is non-negative.  Note K can be greater than n as well

    //if given arr = {1,2,3,4,5}
    //When k=1 ,arr={5,1,2,3,4}
    //When k=2 ,arr={5,4,1,2,3}
    //when k=3 ,arr={3,4,5,1,2}
    //When k=4 ,arr={2,3,4,5,1}
}
