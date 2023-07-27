public class SwitchStatement {

    public static void main(String[] args ){

        int day = 0;

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
               break;
            case 3:
                System.out.println("Tuesday");

            default:
                System.out.println("Not a valid day number");

        }

    }

}
//SWITCH STATEMENT : In Java, the switch statement is a control flow statement that allows
// you to test the value of a variable or an expression against a list of possible constant values.
// It provides a concise way to handle multiple conditional branches based on the value of a single
// variable or expression.