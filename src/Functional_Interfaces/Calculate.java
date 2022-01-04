package Functional_Interfaces;

public class Calculate implements BinaryOperation{
    @Override
    public int apply(int first, int second) {
        return first + second;
    }
}
