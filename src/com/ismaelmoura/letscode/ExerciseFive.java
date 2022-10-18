package com.ismaelmoura.letscode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerciseFive {
    public static void main(String[] args) {
        final String[] FRUITS_LIST_ON_SALE = {"BANANA", "ABACAXI", "MELANCIA", "LIMÃO", "UVA"};
        Scanner scanner = new Scanner(System.in);
        List<String> chosenFruitsOnSale = getFruitsOnSale(FRUITS_LIST_ON_SALE, scanner);

        System.out.println("You bought this fruits on sale: " + chosenFruitsOnSale.toString());
        System.out.println("Therefore, you will receive a " + (chosenFruitsOnSale.size() * 5) + "%" + " discount");
    }

    private static List<String> getFruitsOnSale(String[] FRUITS_LIST_ON_SALE, Scanner scanner) {
        List<String> chosenFruitsOnSale = new ArrayList<>();
        String chosenFruit;

        System.out.println("--- Welcome to Java Hortfruit! ---");
        System.out.println("Choose any fruits to your cart. (Leave empty to finish).");
        chosenFruit = scanner.nextLine();

        while (!chosenFruit.isEmpty()) {
            for (String fruit : FRUITS_LIST_ON_SALE) {
                if (fruit.equalsIgnoreCase(chosenFruit)) {
                    chosenFruitsOnSale.add(chosenFruit.toUpperCase());
                    break;
                }
            }
            chosenFruit = scanner.nextLine();
        }

        return chosenFruitsOnSale
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
