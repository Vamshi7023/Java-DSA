package Opps;

public class Student{//Creating the storage (or) memory space for the student
    String name ;

    private int rollno; // if we arite private to any varible it cannot be used outside of this class file
    //If u intialise it in the same file it will not show any error because it is in the same file
    int Rollno;
    double percentage;
    static int numberofstudents;//Static creates a single memory spaces for diffrent obects when ever diffrent objects call the numerofstudents it will be incremented in the common memory spaace


    //To access the private variable rollNo we need to use getter and setter

    public int getrollno(){
        return rollno;
    }

    public void setrollno(int RollNo){
        rollno = RollNo;
    }

    //Roll no is called in the StudentCass.java file


    //Constructors with arguments

    public Student(String naam,int RollNumber,Double Percentage){
        name = naam;
        Rollno = RollNumber;
        percentage = Percentage;
        numberofstudents++;
    }//Constructor is called in StudentClass.java file check there


}
