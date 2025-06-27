package Opps;

// class Pen{
//     String colour;
//     String type;

//     public static void write(){
//         System.out.println("Write ing the answer");
//     }

//     public void printcolour(){
//         System.out.println(this.colour);//Tells the function which object has been called  or    The this keyword refers to the current object in a method or constructor.
//     }
// }

// public class OOPS {

//     public static void main(String[] args) {
//         Pen pen1 = new Pen();//Constructor

//         pen1.colour="Blue";
//         pen1.type="gel";

//         Pen pen2 = new Pen();
//         pen2.colour = "Black";
//         pen2.type = "Ball";

//         pen1.write();
//         pen1.printcolour();
//         pen2.printcolour();
//     }
    
// }










//Constructor without parameters or arguments

// class Pen{
//     String type;
//     String color;

//     public void main(){
//         System.out.println(this.color);
//     }
// }

// public class OOPS {
//     public static void main(String[] args) {
//         Pen p = new Pen();
//         p.color="blue";
//         p.type="gel";


//     }
// }





//Constructor with parameters or Arugumets

class Pen{
    String color;
    String type;
    public void printinfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }

    Pen(String color,String type){
        this.color = color;
        this.type = type;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen p = new Pen("Blue" , "Gel");

        p.printinfo();


    }
}