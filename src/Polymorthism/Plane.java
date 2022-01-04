package Polymorthism;

//As you see Polymorphism allows us to have one class with multiple types: a Plane cn be type Plane and type Vehicle...

public class Plane extends Vehicle{
    public Plane() {
        // Notice we are passing our arguments into our superclass (Vehicle) constructor
        super("Plane start","Plane stop","Plane speed", "Plane direction");
    }

    public void altitude () {
        System.out.println("how high are we?");
    }

    @Override
    public void direction() {
        System.out.println("The plane is going up!!!");
    }
}
