package com.ismaelmoura.letscode;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final List<String> FRUITS_ON_SALE_TODAY = Arrays.asList("LARANJA", "BANANA", "UVA", "LIMÃO");
        String chosenFruit;

        System.out.print("Which fruit you will bought? ");
        chosenFruit = scanner.next();

        for (String fruit : FRUITS_ON_SALE_TODAY) {
            if (fruit.equalsIgnoreCase(chosenFruit)) {
                System.out.println("Good choice! This fruit is on sale today");
            } else {
                System.out.println("This fruit is not on sale");
            }
            break;
        }
    }
}
