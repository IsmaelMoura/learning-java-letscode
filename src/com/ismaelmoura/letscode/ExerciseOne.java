package com.ismaelmoura.letscode;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        int number, multiplicationTableLimiter = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What multiplication table are you want to do? ");
        number = scanner.nextInt();

        for (int i = 1; i <= multiplicationTableLimiter; i++) {
            System.out.printf("%d X %d = %d \n", number, i, (number * i));
        }
    }
}