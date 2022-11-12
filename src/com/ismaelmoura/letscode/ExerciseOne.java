package com.ismaelmoura.letscode;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, multiplicationTableLimiter = 10;

        System.out.print("What multiplication table are you want to do? ");
        number = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= multiplicationTableLimiter; i++) {
            System.out.printf("%d X %d = %d \n", number, i, (number * i));
        }
    }
}