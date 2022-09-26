package org.example.controllers;
import java.util.Scanner;

public class Combos {
    static Scanner read = new Scanner(System.in);
    public static void showMenu() {
        System.out.println("Menu\n"
                + "Select an option\n"
                + "1. Upload combos\n"
                + "2. Total report of supplies\n"
                + "3. End program\n" );

        int option;
        do {
            option = read.nextInt();
        } while (option > 3 || option < 1);

        switch (option) {
            case 1: {
                uploadCombos();
                break;
            }
            case 2: {
                showCombos();
                break;
            }
            case 3: {
                break;
            }
        }
    }

    public static void uploadCombos() {

        System.out.println("Enter the total number of combos");
        int totalCombos = read.nextInt();

        for (int i = 0; i < totalCombos; i++) {

            System.out.println(
                    "Select a combo:\n"
                    + "1. Combo 1: simple burger.\n"
                    + "2. Combo 2: simple cheese burger.\n"
                    + "3. Combo 3: double burger with cheese and bacon.\n"
                    + "4. Combo 4: triple burger with cheese, bacon and egg.\n"
            );

            int selectedCombo = read.nextInt();

            switch (selectedCombo) {
                case 1: {
                    Supplies.totalBurgers += 1;
                    break;
                }
                case 2: {
                    Supplies.totalBurgers += 1;
                    Supplies.totalCheese += 0.15;
                    break;
                }
                case 3: {
                    Supplies.totalBurgers += 2;
                    Supplies.totalCheese += 0.3;
                    Supplies.totalBacon += 0.025;
                    break;
                }
                case 4: {
                    Supplies.totalBurgers += 3;
                    Supplies.totalCheese += 0.45;
                    Supplies.totalBacon += 0.025;
                    Supplies.totalEggs += 1;
                    break;
                }
            }

            System.out.println(
                    "Select bread:\n"
                    + "1. White bread.\n"
                    + "2. Bran bread.\n"
            );

            int selectedBread = read.nextInt();

            switch (selectedBread) {
                case 1: {
                    Supplies.totalWhiteBread += 1;
                    break;
                }
                case 2: {
                    Supplies.totalBranBread += 1;
                    break;
                }
                default: {
                    System.out.println("Select a valid option.");
                }
            }

            System.out.println(
                    "Do you want to add fries?\n"
                    + "1. Yes\n"
                    + "2. No\n"
            );

            int selectedFries = read.nextInt();

            switch (selectedFries) {
                case 1: {
                    Supplies.totalPotatoes += 0.2;
                }
                case 2: {
                    break;
                }
                default: {
                    System.out.println("Select a valid option.");
                }
            }
        }
        showMenu();
    }

    public static void showCombos() {
        System.out.println(
                "The quantity of goods consumed is:\n"
                 + Supplies.totalBurgers + " burgers.\n"
                 + Supplies.totalWhiteBread + " white bread.\n"
                 + Supplies.totalBranBread + " bran bread.\n"
                 + Supplies.totalPotatoes + " kgs fries.\n"
                 + Supplies.totalCheese + " kgs cheese.\n"
                 + Supplies.totalBacon + " kgs bacon.\n"
                 + Supplies.totalEggs + " eggs.\n"
        );

    }

    public static void main(String[] args) {
        showMenu();
    }

}
