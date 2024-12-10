package classesAndObjects;

public class AcessModifiers {

    /*
    Public -> can access within the class,within Package,outside the package (can access througn whole codebase)
    Private -> can only be acessed witning that Class (cannot access outiside that class)
    Default -> can be accessed witjing that class and package
    Protected -> cannot acesses outside that package
     */
    public static void main(String[] args) {
        BankingSystem customer = new BankingSystem();
        customer.name = "Atharv";
        customer.changePass("0987654321aa");
        //we cannot acess password directly as it is private
    }
}

class BankingSystem{
    public String name;
    private String password; //as password is confediential we can only access it withing this Bankingsystem class

    //if we have to change the password we will create a method and keep acess modifies acc to our need
    void changePass(String newPass){  //this is default and we can access it in package
        password = newPass;
    }

}
