package QueueExample;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Set<String> customerId = new HashSet<>();
        customerId.add("12345");
        customerId.add("49336");
        customerId.add("12345");
        customerId.add("97493");
        Queue<String> queuedCustomer = new PriorityQueue<>(customerId);

        while (!queuedCustomer.isEmpty()) {
            System.out.println("Customer with id: " + queuedCustomer.poll() + " is getting help.");
            //Customer with id: 12345 is getting help.
            //Customer with id: 49336 is getting help.
            //Customer with id: 97493 is getting help.
        }
    }
}
