import java.util.ArrayList;
import java.util.Collections;

public class Array14 {


    //BASICS OF ARRAYLIST 
    
    

    // public static void main(String[] args) {
    //     //Wrapper Classes

    //     // OLD METHOD Integer i = new Integer(0);

    //     Integer in = Integer.valueOf(5);
    //     System.out.println(in);
    //     Float F = Float.valueOf(5);
    //     System.out.println(F);


    //     //Creating the ArrayList

    //     ArrayList <Integer> l1 = new ArrayList<>();

    //     ArrayList <Boolean> l2 = new ArrayList<>();

    //     //Add an element in the arraylist

    //     l1.add(5);
    //     l1.add(7);
    //     l1.add(8);
    //     l1.add(3);

    //     System.out.println(l1);

    //     //get element at index i

    //     System.out.println(l1.get(0));

    //     //print with for loop
    //     for(int i = 0;i<l1.size();i++){
    //         System.out.println(l1.get(i));
    //     }

    //     //printing the array list directly

    //     System.out.println(l1);


    //     //adding element at some index i

    //     l1.add(0, 100);

    //     System.out.println(l1);

    //     //modifying element at index i
    //     l1.set(0, 10000);
    //     System.out.println(l1);

    //     //removing the element at index i
    //     l1.remove(1);
    //     System.out.println(l1);

    //     //Removing the element by the value

    //     l1.remove(Integer.valueOf(3));
    //     System.out.println(l1);

    //     //Check if an element exists
    //     boolean ans =l1.contains(Integer.valueOf(100));
    //     System.out.println(ans);

    //     //If u dosent specify class you can put anything inside l

    //     ArrayList l = new ArrayList<>();

    //     l.add("asdasd");
    //     l.add(123);
    //     l.add(2.123);

    //     System.out.println(l);
    // }




    // PROBLEMS OF ARRAY LIST


    //Problem to reverse the given ArrayList and print it

    // static void array( ArrayList<Integer> l ){
    //     int n = l.size();
    //     for(int i=n-1;i>=0;i--){
    //         System.out.println(l.get(i));
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayList<Integer> l = new ArrayList<>();
        // l.add(10);
        // l.add(2);
        // l.add(5);
        // l.add(9);
    //     array(l);
    //     System.out.println("AFTER SORTING");
    //     Collections.sort(l);
    //     System.out.println(l);
    //     System.out.println("Sorting in reverse order");
    //     Collections.sort(l,Collections.reverseOrder());
    //     System.out.println(l);
    // }



    //Using two pointer approach reverse the ArrayList

    static void reverse(ArrayList<Integer> l){
        int i = 0 , j= l.size()-1;

        while (i<j) {
            /*
             * int temp = int a;
             * int b = a;
             * int b = temp;
            */

            Integer temp = Integer.valueOf(l.get(i));
            l.set(i, l.get(j));
            l.set(j, temp);

            i++;
            j--;
            
        }
    }
    public static void main(String[] args) {
        ArrayList <Integer> l = new ArrayList<>();

        l.add(12);
        l.add(10);
        l.add(2);
        l.add(5);
        l.add(9);

        System.out.println(l);
        reverse(l);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l );
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
    }


    
}
