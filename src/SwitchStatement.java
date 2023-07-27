public class SwitchStatement {

    public static void main(String[] args ){

      String dog = "pomeranian";

      switch (dog){
          case "pomeranian":
              System.out.println("small dog");
              break;
          case "great dane":
              System.out.println("large dog");
              break;

          default :
              System.out.println("try a different");

      }

    }

}
//SWITCH STATEMENT : In Java, the switch statement is a control flow statement that allows
// you to test the value of a variable or an expression against a list of possible constant values.
// It provides a concise way to handle multiple conditional branches based on the value of a single
// variable or expression.