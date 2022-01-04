package Encapsulation;

public class CalculatorTester {
    public static void main(String[] args) {
        ImplementCalculator calculate = new ImplementCalculator();

        calculate.sum(2,4); //6
        calculate.substract(4,2); //2
        calculate.substract(2,4); //2
        calculate.multiply(5,2); //10
        calculate.divition(9,3); //3
        calculate.squaredNumber(5); //The value of 5 squared is 25

        //As you can see Encapsulation is the process of keeping data and behavior in one capsule (object) so one
        // class(CalculatorTester) cannot access to those privates attributes from the other class
        // (ImplementCalculator), the CalculatorTester only can access to the public methods and is up to the class itself(
        // ImplementCalculator) how to handle/manipulate the internal data

    }
}
