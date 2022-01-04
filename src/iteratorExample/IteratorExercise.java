package iteratorExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExercise {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ramon");
        names.add("Michael");
        names.add("Isandra");

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
