package Functional_Interfaces;

public class Main {
    public static void main(String[] args) {
        Calculate operation = new Calculate();
        int add = operation.apply(2,3);
        System.out.println(add); //5

        /* Now we are creating a variable type the functional interface (not an object since we didn't use the "new")
        our variable holds a lambda expression, and we use the dot notation to call the functional method and pass the
         arguments.
         */

        BinaryOperation addNumbers = (a, b) -> a + b;
        int addAgain = addNumbers.apply(3,4);
        System.out.println(addAgain); //7
    }
}
