package MapExercise;

import java.util.*;

public class MapTester {
    public static void main(String[] args) {
        Map<String, Person> mapOfPeople = new HashMap<>();
        //List<Person> people = new ArrayList<>();

//        people.add(new Person("Ramon", "ramon@gmail.com"));
//        people.add(new Person("Isa", "isa@hotmail.com"));
//        people.add(new Person("Michael", "mike@yahoo.com"));

        Person ramon = new Person("Ramon","ramon@gmail.com");
        Person isa = new Person("Isa","isa@hotmail.com");
        Person mike = new Person("Michael","mike@gmail.com");

//        people.add(ramon);
//        people.add(isa);
//        people.add(mike);

        mapOfPeople.put(ramon.getEmail(),ramon);
        mapOfPeople.put(mike.getEmail(), mike);
        mapOfPeople.put(isa.getEmail(), isa);


        //Can we add the list people to the Map iterating...??
//        for( Person person: people ) {
//            System.out.println(mapOfPeople.put(person.getEmail(), person)); //null
//            System.out.println(person);
//        }

        for (String email: mapOfPeople.keySet()) {
            System.out.println(email);
            //ramon@gmail.com
            //mike@gmail.com
            //isa@hotmail.com
        }
        for (Person people : mapOfPeople.values()) {
            System.out.println(people);
            //Person{name='Ramon', email='ramon@gmail.com'}
            //Person{name='Michael', email='mike@gmail.com'}
            //Person{name='Isa', email='isa@hotmail.com'}
        }

    }
}
