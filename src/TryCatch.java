import java.util.Scanner;

public class TryCatch {

    public static void main (String [] args){

       Scanner scan = new Scanner(System.in);
       System.out.println("What is your fav number?");

      try{
          int[] a = {4} ;
          System.out.println(a[1]);

      } catch (NullPointerException e){
          System.out.println("Your array is null");

      } catch (Exception e){
          System.out.println("Your array is null");
      }


    }
}

 //In Java, try and catch are used for exception handling, allowing you to handle errors and exceptional
// situations in your code gracefully. When certain exceptional situations occur during program
// execution, Java generates an exception object. If these exceptions are not handled properly,
// they can lead to program termination and unexpected behavior.
//

//The try block is used to enclose the code that might raise an exception.
// It is followed by one or more catch blocks, which catch and handle specific types of
// exceptions that may occur within the try block.