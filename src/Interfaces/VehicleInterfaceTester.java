package Interfaces;

public class VehicleInterfaceTester {
    public static void main(String[] args) {
        Car myLambo = new Car("Lamborghini", 150, "red");

        myLambo.getType(); //My car is type Lamborghini
        myLambo.getSpeed();//My Lamborghini is going to 150.
        myLambo.getColor();//My Lamborghini is color red

        myLambo.start(); //My Lamborghini started...
        myLambo.speed(); //My Lamborghini is going at 150 m/h.
        myLambo.direction(); //My Lamborghini is going to Miami at 150 m/h!!!
        myLambo.location("Miami"); //My Lamborghini is located in Miami
    }
}
