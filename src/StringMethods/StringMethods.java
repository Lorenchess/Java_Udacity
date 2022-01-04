package StringMethods;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
       String text = "Hello";

        System.out.println(text.charAt(2)); //l //Looking at the string at a very specific character...
//        String lowerCase = text.toLowerCase();
//        System.out.println(lowerCase);

        System.out.println(text.equalsIgnoreCase("hello")); //true

        System.out.println(text.contains("el")); //true

        String commaSeparatedString = "This, is, a, comma, separated, list";

        //The string split() method breaks a given string around matches of the given regular expression. After splitting against the given regular expression, this method returns a char array.

        String[] stringArray = commaSeparatedString.split(",");
        //System.out.println(Arrays.toString(stringArray));
        for (String arr: stringArray) {
            System.out.print(arr + "\n"); //This is a comma separated list //as you see it removes the commas
        }

        //Substring, creates a shallow copy of the string with removed elements from (from index, to index(not included)
        String greet = "Hello, world";
        System.out.println(greet.substring(0,5)); //Hello //notice that the last 5 (,) is not included
        System.out.println(greet); //Hello, world //as you see it does not mutate the original string

        //Replace Method
        String word = "Hello";
        System.out.println(word.replace("l", "2")); //He22o

        //Replace characters in string
        String myStr = "cammelcase";
        System.out.println(replaceCharInString('C', myStr,6)); //cammelCase

        System.out.println(replaceChar('C', myStr,6)); //cammelCase


    }
    //Replace characters in string
    public static String replaceCharInString (char ch, String str, int index) {
        return str.substring(0, index) + ch + str.substring(index + 1);
    }

    //Using the StringBuilder
    public static String replaceChar (char ch, String str, int index) {
        StringBuilder myString = new StringBuilder(str); //Constructs a string builder initialized to the contents of the specified string.
        myString.setCharAt(index, ch); //The character at the specified index is set to ch.
        return myString.toString();
    }

}
