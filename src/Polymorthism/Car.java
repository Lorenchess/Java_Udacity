package Polymorthism;

public class Car extends Vehicle{

    public Car() {
        // // Notice we are passing our arguments into our superclass (Vehicle) constructor
        super("Car start","Car stop","Car speed", "Car direction");
    }

    @Override
    public void speed() {
        System.out.println("My car is going fast!!!");
    }

    @Override
    public void direction() {
        System.out.println("The car going to the right...");
    }
}
