package classesAndObjects;

public class oops {
    public static void main(String[] args) {
        //creating the objects of our class jo humne create kia hai
        Student s1 = new Student();
        //accessing the properties of our class Student
        s1.firstName = "Atharv";
        s1.lastName = "Awle";
        s1.rollno = 1085;
        s1.address = "jsdjefbsdcscichcihic";

        //accessing the methods of our class Student

        s1.changeFname("Ayush");
        s1.changeLname("Awle");
        s1.changeRoll(123);
        s1.newAddress("dbcajdkau");

//        System.out.println(s1.firstName);
//        System.out.println(s1.lastName);
//        System.out.println(s1.rollno);
//        System.out.println(s1.address);

    }
}

//making a class named pen and init we have all the properties of a pen and also the methods/function
//to change the properties.
class Pen{
    //properties
    String color;
    int tipSize;

    //functions to change the properties
    void changeColor(String newColor){
        color = newColor;
    }

    void changeTipSize(int newTipSize){
        tipSize = newTipSize;
    }
}


//making a class students where we have basic info(properties) about the student and the functions to change that
//students info

class Student{

    //properties(info) of a student
    String firstName;
    String lastName;
    int rollno;
    String address;

    //methods to change the properties of the student

    void changeFname(String newFname){
        firstName=newFname;
    }
    void changeLname(String newLname){
        lastName=newLname;
    }

    void changeRoll(int newRoll){
        rollno = newRoll;
    }

    void newAddress(String newAdd){
        address = newAdd;
    }


}
