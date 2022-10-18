package com.ismaelmoura.letscode;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        double celsiusTemperature;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a celsius temperature: ");
        celsiusTemperature = scanner.nextDouble();

        System.out.printf("\nThe equivalent of %.2f°C is %.2f°F", celsiusTemperature, celsiusToFahrenheit(celsiusTemperature));
    }

    public static double celsiusToFahrenheit(double number) {
        return (number * 9 / 5) + 32;
    }
}
