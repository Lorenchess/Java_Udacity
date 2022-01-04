package com.chess4math;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
         int[] arr = {4,3,2,1,0};

         int[] numbers = new int[4];
         numbers[0] = 10;
         numbers[1] = 20;
         numbers[2] = 30;
         numbers[3] = 40;

        System.out.println(Arrays.toString(numbers));

         print(arr);

         for (int i = 0; i<5; i++){
             System.out.println(i);
         }
        System.out.println("================");
        int[] numbers1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int number: numbers1) {
            System.out.println(number);
        }

        System.out.println("================");

        int i = 0;
        while(i < numbers1.length) {
            System.out.println(numbers1[i]);
            i++;
        }

        System.out.println("================");

        int iterator = 0;
        do {
            System.out.println(numbers1[iterator]);
            iterator++;
        } while(iterator < numbers.length);


    }
    public static void print(int[]arr){
        System.out.println("Ignition sequence start!");
        for (int i = 0; i< arr.length ; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Liftoff!");
    }
}
