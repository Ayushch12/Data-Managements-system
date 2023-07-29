import java.util.LinkedList;
import java.util.Queue;

public class QueuesNStuff {

    public static void main (String[] args){

        Queue q = new LinkedList<String>();

        q.add("A");
        q.add("B");
        q.add("C");

        System.out.println(q.poll());


    }
}
