package Polymorthism;

//Makes sense to have Vehicle superclass abstract since we are not going to instantiate Vehicle, we just need the
// Vehicle class to group common functionality between the subclasses of Vehicle...

public abstract class Vehicle {
    protected String start;
    protected String stop;
    protected String speed;
    protected String direction;

    public Vehicle(String start, String stop, String speed, String direction) {
        this.start = start;
        this.stop = stop;
        this.speed = speed;
        this.direction = direction;
    }

    public void start(){
        System.out.println(start);
    }
    public void stop(){
        System.out.println(stop);
    }
    public void speed(){
        System.out.println(speed);
    }
    //The abstract class has abstract methods that do not have implementation. Those methods have to be implemented
    // by the subclasses.
    public abstract void direction();

}
