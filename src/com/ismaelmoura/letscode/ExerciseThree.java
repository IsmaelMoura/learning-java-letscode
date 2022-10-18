package com.ismaelmoura.letscode;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        String[] shoppingCart = new String[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < shoppingCart.length; i++) {
            System.out.print("Enter a fruit to your shopping cart: ");
            shoppingCart[i] = scanner.next();
        }

        System.out.println("\nYour shopping car has: ");
        System.out.print(Arrays.toString(shoppingCart));
    }
}
