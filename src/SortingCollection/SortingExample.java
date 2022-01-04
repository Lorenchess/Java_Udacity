package SortingCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ramon");
        names.add("Isandra");
        names.add("Michael");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(200);
        numbers.add(30);
        numbers.add(25);
        numbers.add(10);

        Collections.sort(numbers);

        Collections.sort(names);

        for (String name: names) {
            System.out.print(name + " "); //Isandra Michael Ramon
        }

        for (Integer number: numbers) {
            System.out.print(number + " "); //10 25 30 200
        }
    }
}
