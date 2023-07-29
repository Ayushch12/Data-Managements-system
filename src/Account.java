public class Account {   // Class Declaration:


    String name ;   // Instance Variables:
    int age;        // Instance Variables:
    public static void main (String[] args){      // Main Method:

        Account a = new Account ();    // Object Creation:

        a.setName("Pablo");

a.printDetails();


    }
public void setName(String name){
        this.name = name;

}

    public void printDetails() {

        System.out.println(name + ", " + age);



    }



}
// Getters:
//A getter method is used to retrieve the value of an instance variable from an object.
// It provides read-only access to the private fields of the class.


//Setters:
//A setter method is used to modify or update the value of an instance variable in an object.
// It provides write-only access to the private fields of the class.

