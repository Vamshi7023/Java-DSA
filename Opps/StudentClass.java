package Opps;

public class StudentClass {

    //Classes:: are blueprint  of ojects

    //Objects:: are real life entities


    /*Access modifiers  
     * Public : can be accessed in any files or packages
     * Private : can be accessed in the same calss
     * Default: Can be accessed in the same package
     * 
    */
    
    

    public static void main(String[] args) {
        // Student s = new Student();//Creeating the object for the class and Student entites are importing from the other file called Student.java

        // //Classes or java files can be imported from any files

        
        // s.name="vamshi";//Declaring the values for the object which created in the class
        // //s.rollno = 76; // Cannot be accessed because it is present in the another class file 
        // s.percentage = 95.4;

        // s.setrollno(76);

        // System.out.println(s.name+s.percentage);

        // System.out.println(s.getrollno());




        //Constructors

        // Student s = new Student("Vamshi", 23, 95.3);//Calling the constructor from the another file

        // System.out.println(s.name);
        // System.out.println(s.Rollno);
        // System.out.println(s.percentage);


        //Static Keyword
        Student s = new Student("Vamshi", 23, 95.3);
        System.out.println(s.numberofstudents);
        Student s1 = new Student("Vamshi", 23, 95.3);
        System.out.println(s1.numberofstudents);
        Student s2 = new Student("Vamshi", 23, 95.3);
        System.out.println(s2.numberofstudents);





    }
}
