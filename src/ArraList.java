import java.util.ArrayList ;
public class ArraList {


    public  static void main (String[] args ){

        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        System.out.println(fruits[2]);


        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");

        System.out.println(fruitList);

    }
}

//`ArrayList` is a class in Java that is part of the `java.util` package,
// used to create dynamic arrays that can grow or shrink in size as needed.
// It provides a convenient way to store and manipulate collections of elements,
// allowing easy addition, removal, and access of elements based on their index.