package ScannerChalenge;

import java.util.Scanner;

public class SnacksTester {
    public static void main(String[] args) {
        boolean keepRunning = true;

        try (Scanner sc = new Scanner(System.in)) {
            while (keepRunning) {
                try {
                    System.out.println("Snacks for the breakroom?");
                    System.out.println("1.Fruit");
                    System.out.println("2.Chips");
                    System.out.println("3.Candy");
                    System.out.println("Please, enter your selection...");
                    int selection = Integer.parseInt(sc.nextLine());

                    if (selection == 1) {
                        System.out.println("We got some Fruit for you");
                        keepRunning = false;
                    } else if (selection == 2) {
                        System.out.println("We got some Chips for you");
                        keepRunning = false;
                    } else if (selection == 3) {
                        System.out.println("We got some Candy for you");
                        keepRunning = false;
                    } else {
                        System.out.println("Please, enter a number from 1 to 3");
                    }

                } catch (Exception ex) {
                    System.out.println("\nError - Invalid Input\n");
                }

            }

        }
    }
}
