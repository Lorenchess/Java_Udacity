package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        mySet.add("Hello");
        mySet.add("Hello");
        mySet.add("Hello World");

        for (String str : mySet) {
            System.out.println(str);
            //Hello World
            //Hello
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(20);
        numbers.add(25);
        numbers.add(230);
        numbers.add(230);
        numbers.add(20);

        //since ArrayList is a class/concrete implementation of the List interface that implements the Collection
        // interface,
        // as well the HashSet implementation of the Set interface, so we can add to the constructor the
        // ArrayList numbers but as is converted in a HashSet it does not pass duplicated values.

        Set<Integer> myNumbersSet = new HashSet<>(numbers);

        for (Integer number: myNumbersSet) {
            System.out.print(number + " "); //2 20 230 25
        }

    }



}
