package Queue;

import java.util.LinkedList;
import java.util.Queue;

//In the collections framework the Queue is an interface and cannot be directly used to instantiate a class. In the
// example below, we are creating a Queue of strings. Notice that we are using the concrete class LinkedList to instantiate our Queue.

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("Hello");
        myQueue.add("there");

        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.poll());
            //Hello
            //there
        }

    }
}
