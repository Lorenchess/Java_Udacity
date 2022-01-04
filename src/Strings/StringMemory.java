package Strings;

//Strings are immutable and multiple variables can point to a single String object, and if they value change the
// object is not destroyed.
//If we have a String message = "foo"; and later I change it to message = "bar"; The original String object is left
// unchanged( it still contains the string "foo") but a new String object is created that contains the new String "bar"

public class StringMemory {
    public static void main(String[] args) {
        String text = "Hello";
        String anotherText = "Hello";
        System.out.println(anotherText == text); //true, since they point to the same object reference

    }
}
