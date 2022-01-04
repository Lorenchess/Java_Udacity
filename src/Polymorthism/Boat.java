package Polymorthism;

public class Boat extends Vehicle{
    public Boat() {
        // // Notice we are passing our arguments into our superclass (Vehicle) constructor
       super("Boat start","Boat stop","Boat speed", "Boat direction");
    }

    public void depthFinder () {
        System.out.println("How deep is this water?");
    }

    @Override
    public void direction() {
        System.out.println("The boat is going to the left");
    }
}
