import java.util.*;

public class Array2 {

    // Takeing the input of an array and cloning

    // static void printArray(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i] + " ");
    //     }
    // }
    // Takeing the input of an array

    // public static void main(String[] args) {

        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter the size");
        // int n = s.nextInt();

        // int arr[] = new int[n];
        // System.out.println("Enter the ele");

        // for(int i=0;i<n;i++){
        //     arr[i]=s.nextInt();
        // }


    //     int arr2[] = arr.clone();
    //     System.out.println("arr2");


    //     printArray(arr2);


    //     printArray(arr);

    //     System.out.println("Changeing the array values");
    //     arr2[0]=0;
    //     arr2[1]=3;

    //     System.out.println("arr");
    //     printArray(arr);
    //     System.out.println("arr2");
    //     printArray(arr2);

    // }

    // int [] arr2= arr;




    //counting the number of occurence of ele in an array

    // static int count(int arr1[],int x){
    //     int count =0;
    //     for(int i=0;i<arr1.length;i++){
    //         if(arr1[i]==x){
    //             count++;
    //         }
    //     }
    //     return count;

    // }
    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Enter the size");
    //     int n = s.nextInt();

    //     int arr[] = new int[n];
    //     System.out.println("Enter the ele");

    //     for(int i=0;i<n;i++){
    //         arr[i]=s.nextInt();
    //     }

    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i]+" ");
    //     }

    //     System.out.println("Enter the ele to be searched");
    //     int x =s.nextInt();
    //     System.out.println();
    //     System.out.println("Count is "+count(arr,x));
    // }


    //find the last occurrence of an ele x in a given array

    static int occurence(int arr1[],int x){
        int index =-1;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==x){
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the ele");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Enter the ele which sould be occured");
        int x =s.nextInt();

        System.out.println(occurence(arr, x));
    }

    

    //count the number of element which are strictly greater than value x

    // static int strictlygreater(int arr[],int x){
    //     int count=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>x){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    // public static void main(String[] args) {
        
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Enter the size");
    //     int n = s.nextInt();

    //     int arr[] = new int[n];
    //     System.out.println("Enter the ele");

    //     for(int i=0;i<n;i++){
    //         arr[i]=s.nextInt();
    //     }

    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i]+" ");
    //     }

    //     System.out.println();
    //     System.out.println("Enter the ele which sould be greater");
    //     int x =s.nextInt();

    //     System.out.println(strictlygreater(arr, x));
    //}

    


    //Checking the array weather it is sorted or not

    // static boolean sorted(int arr[]){
        
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i-1]>arr[i]){
    //             //System.out.println("Not sorted ");
    //             return false;
    //         }
            
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Enter the size");
    //     int n = s.nextInt();

    //     int arr[] = new int[n];
    //     System.out.println("Enter the ele");

    //     for(int i=0;i<n;i++){
    //         arr[i]=s.nextInt();
    //     }

    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i]+" ");
    //     }

    //     // System.out.println();
    //     // System.out.println("Enter the ele which sould be greater");
    //     // int x =s.nextInt();

    //     System.out.println(sorted(arr));
    // }
}
