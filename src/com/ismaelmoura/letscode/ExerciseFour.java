package com.ismaelmoura.letscode;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final List<String> FRUITS_ON_SALE_TODAY = Arrays.asList("ORANGE", "BANANA", "GRAPE", "LEMON");
        String chosenFruit;

        System.out.print("Which fruit you will bought? ");
        chosenFruit = scanner.next();

        if (FRUITS_ON_SALE_TODAY.contains(chosenFruit.toUpperCase())) {
            System.out.println("Good choice! This fruit is on sale today.");
        } else {
            System.out.println("This fruit is not on sale.");
        }
    }
}
