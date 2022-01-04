package CollectionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        System.out.println("Type your name");
        names.add(scanner.nextLine());
        System.out.println("Type your Last name");
        names.add(scanner.nextLine());

        for (String name: names) {
            System.out.println(name);
        }


    }
}
