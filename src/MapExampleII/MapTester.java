package MapExampleII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Ramon", "ramon@gmail.com"));
        peopleList.add(new Person("Mike", "mike@yahoo.com"));
        peopleList.add(new Person("Isa", "isa@hotmail.com"));

        //Map<String, Person> peopleMap = new HashMap<>(peopleList); //do not work due Map does not implement the
        // Collection interface
    }
}
