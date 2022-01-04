package Interfaces;

//As you can see we can implement more than one Interface but inheritance can do only one class...

public class Car implements Vehicle, Production{
    private String type;
    private int speed;
    private String color;

    public Car(String type, int speed, String color) {
        this.type = type;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String getType() {
        System.out.println("My car is type " + type );
        return type;
    }

    @Override
    public int getSpeed() {
        System.out.println("My " + type + " is going to " + speed);
        return speed;
    }

    @Override
    public String getColor() {
        System.out.println("My " + type + " is color " + color);
        return color;
    }

    @Override
    public void start() {
        System.out.println("My " + type + " started...");
    }

    @Override
    public void speed() {
        System.out.println("My " + type + " is going at " + speed + " m/h.");
    }

    @Override
    public void direction() {
        System.out.println("My " + type + " is going to Miami at " + speed + " m/h!!!");
    }

    @Override
    public void location(String location) {
        System.out.println("My " + type + " is located in " + location );
    }
}
