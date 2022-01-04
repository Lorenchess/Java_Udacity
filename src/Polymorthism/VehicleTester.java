package Polymorthism;

public class VehicleTester {
    public static void main(String[] args) {
        // We can create an array of vehicles
        Vehicle[] vehicles = new Vehicle[3];

        //// Add a Car, Plane and Boat objects to the array
        vehicles[0] = new Boat();
        vehicles[1] = new Car();
        vehicles[2] = new Plane();

        polymorphism(vehicles); //Even though we are calling the method type Vehicle it calls the three types...
        //The results for calling vehicles[i].start();
        //Boat start
        //Car start
        //Plane start
        //The results for calling vehicles[i].speed();
        //Boat speed
        //My car is going fast!!! overwrite method
        //Plane speed
        ////The results for calling vehicles[i].direction();
        //The boat is going to the left
        //The car going to the right...
        //The plane is going up!!!

        coupling();
        //Car start
        //Plane start
        //Boat start

    }
    //Method that allow us to use Polymorphism by looping over the array type Vehicle (Superclass) so as you can see
    // polymorphism allow u to have a class with two types, a Car can be type Vehicle and type Car, can take multiple
    // types/forms.
    public static void polymorphism (Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].start();
            vehicles[i].speed();
            vehicles[i].direction();
        }
    }

    //Method without polymorphism
    public static void coupling () {
        Car car = new Car();
        Boat boat = new Boat();
        Plane plane = new Plane();

        car.start(); //Car start
        plane.start(); //Plane start
        boat.start(); //Boat start
    }
}
