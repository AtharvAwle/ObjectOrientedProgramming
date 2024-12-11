package Encapulation;

public class Code {
    public static void main(String[] args) {

    }
}


class encapulatingEg{
    //wraping data and method in one single unit(class)

    //data(properties)
    int roll;
    String name;
    private String password;

    //methods (functions)
     void changeRoll(int newroll){
         roll = newroll;
    }
}
