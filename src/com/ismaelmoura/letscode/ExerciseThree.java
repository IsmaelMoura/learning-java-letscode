package com.ismaelmoura.letscode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerciseThree {
    public static void main(String[] args) {
        List<String> shoppingCart = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a fruit to your shopping cart: ");
            shoppingCart.add(scanner.next().toUpperCase());
        }

        shoppingCart = shoppingCart
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("\nYour shopping cart has: ");
        System.out.print(shoppingCart);
    }
}
