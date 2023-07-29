import java.util.LinkedList;
import java.util.Queue;

public class QueuesNStuff {

    public static void main (String[] args){

        Queue <String> bbqLine = new LinkedList<String>() ;

        bbqLine.add("Jackson");
        bbqLine.add("Tyreek");
        bbqLine.add("Susan");

bbqLine.poll();

        System.out.println(bbqLine);
    }
}
