package ObjectCreation;


import java.util.ArrayList;
import java.util.List;

public class AnimalTester {
    public static void main(String[] args) {
        Dog duke = new Dog("Duke", 4,"male");
        Cat mussi = new Cat("Mussi", 2,"female");

//        duke.makeSound();
//        mussi.makeSound();

        //The possibility of creating myAnimals type Animal list is because Polymorphism, since a Dog is a Animal and
        // a Car is a Aminal as well. We can loop over and call the same method they inherit from Animal makeSound()
        // and the compiler knows which type is calling the method ...

        List<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(new Dog("Cahchito",2,"male"));
        myAnimals.add(new Cat("Mussi",4,"female"));

        for (Animal animal : myAnimals) {
            animal.makeSound();
            //Cahchito barks...
            //Mussi says miaou...
        }
    }

}

