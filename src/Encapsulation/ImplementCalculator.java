package Encapsulation;

public class ImplementCalculator extends Calculator{
    private int result;
    private int value;
    @Override
    void sum(int num1, int num2) {
        result = num1 + num2;
        System.out.println(result);
    }

    @Override
    void substract(int num1, int num2) {
        if(num1 < num2) {
         result = num2 - num1;
        } else {
            result = num1 - num2;
        }
        System.out.println(result);
    }

    @Override
    void multiply(int num1, int num2) {
       result = num1 * num2;
        System.out.println(result);
    }

    @Override
    void divition(int num1, int num2) {
        if(num1 < num2) {
            result = num2 / num1;
        } else {
            result = num1 / num2;
        }
        System.out.println(result);
    }

    public void squaredNumber (int value) { //interface
       int total =  calculateSquare(value);
        System.out.println("The value of " + value + " squared is " + total);
    }

    private int calculateSquare (int value) { //implementation hidden
       return value * value;
    }
}
