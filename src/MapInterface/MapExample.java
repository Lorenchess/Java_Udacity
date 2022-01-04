package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Person> mapOfPeople = new HashMap<>();

        Person mike = new Person("Michael", "michael@gmail.com");
        Person ramon = new Person("Ramon", "ramon@yahoo.com");
        Person isa = new Person("Isandra", "isa@example.com");

        mapOfPeople.put(mike.getEmail(), mike);
        mapOfPeople.put(ramon.getEmail(),ramon);
        mapOfPeople.put(isa.getEmail(),isa);

        retrieveEmail("michael@gmail.com",mapOfPeople); //Email found: michael@gmail.com
        retrieveEmail("lorenchess@gmail.com", mapOfPeople); //Email not found...
    }

    private static <K, V> void retrieveEmail (String email, Map<K, V> myMap) {
        for (K mailito : myMap.keySet()) {
            if( mailito == email) {
                System.out.println("Email found: " + mailito);
            } else {
                System.out.println("Email not found...");
            }
        }
    }
}
