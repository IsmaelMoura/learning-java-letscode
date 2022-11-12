package com.ismaelmoura.letscode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingCart = new ArrayList<>();

        System.out.println("Insert five fruits into your shopping cart (one fruit per row): ");

        for (int i = 0; i < 5; i++) {
            shoppingCart.add(scanner.nextLine().trim().toUpperCase());
        }

        scanner.close();

        shoppingCart = shoppingCart
                .stream()
                .distinct()
                .filter(item -> item != null && !"".equals(item))
                .collect(Collectors.toList());

        System.out.println("\nYour shopping cart has: ");
        System.out.print(shoppingCart);
    }
}
