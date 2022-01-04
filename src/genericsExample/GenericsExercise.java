package genericsExample;

import java.util.ArrayList;

public class GenericsExercise {
    public static void main(String[] args) {
        Double doubleNumber = 1.5;
        String name = "Sally";
        Integer intNumber = 1;
        Character letter = 'a';

        ArrayList<Object> variables = new ArrayList<>();
        variables.add(doubleNumber);
        variables.add(name);
        variables.add(intNumber);
        variables.add(intNumber);
        variables.add(letter);

        for (Object variable: variables) {
            displayClassName(variable);
        }
    }
    public static <T> void displayClassName (T variable) {
        System.out.println(variable.getClass().getName());
    }
}
