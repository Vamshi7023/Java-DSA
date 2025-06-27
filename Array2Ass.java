import java.util.Scanner;

public class Array2Ass {

    static void q1(int arr[],int n){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<-1){
                int temp = arr[i];
                arr[i]=arr[index];
                arr[index]=temp;

                index++;
            }
        }

        for(int i=0;i<n;i++){
            System.out.println();
            System.out.println(arr[i]);
        }
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

        q1(arr,n);
    }
    
}

//Still need to do