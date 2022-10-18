package com.ismaelmoura.letscode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FinalChallenge {
    public static void main(String[] args) {
        final List<String> AVAILABLE_FRUITS = Arrays.asList("ORANGE", "BANANA", "GRAPE", "LEMON");


        List<String> clientList = createClientList();
        List<String> purchasedFruits = checkAvailableFruits(AVAILABLE_FRUITS, clientList);
        int matchPercentage = calculateMatchPercentage(clientList, purchasedFruits);

        System.out.println("Client list: " + clientList);
        System.out.println("Purchased fruits: " + purchasedFruits);
        System.out.println(waiterTipMessage(matchPercentage));
    }

    public static List<String> createClientList() {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        String currentFruit;

        System.out.println("Which fruits you'll buy today? (Leave empty to finish)");
        currentFruit = scanner.nextLine();
        list.add(currentFruit.toUpperCase());

        while (!currentFruit.isEmpty()) {
            currentFruit = scanner.nextLine();
            list.add(currentFruit.toUpperCase());
        }

        return list
                .stream()
                .distinct()
                .filter(item -> item != null && !"".equals(item))
                .collect(Collectors.toList());
    }

    public static List<String> checkAvailableFruits(List<String> availableFruits, List<String> clientList) {
        return availableFruits
                .stream()
                .filter(clientList::contains)
                .collect(Collectors.toList());
    }

    public static int calculateMatchPercentage(List<String> clientList, List<String> purchasedFruits) {
        byte totalPercentage = 100;

        return (totalPercentage * purchasedFruits.size()) / clientList.size();
    }

    public static String waiterTipMessage(int correspondence) {
        if (correspondence >= 50 && correspondence < 75) {
            return correspondence + "% of correspondence, tip of R$ 3,00.";
        } else if (correspondence >= 75 && correspondence < 90) {
            return correspondence + "% of correspondence, tip of R$ 5,00.";
        } else if (correspondence >= 90) {
            return correspondence + "% of correspondence, tip of R$ 10,00.";
        } else {
            return correspondence + "% of correspondence, therefore, without tip.";
        }
    }
}
