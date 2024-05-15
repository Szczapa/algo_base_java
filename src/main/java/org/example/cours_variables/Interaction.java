package org.example.cours_variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interaction {
    public static void courInteraction() {
        System.out.println("Hello World");
        System.out.println("tout le monde");
        System.out.println();
        System.out.println("###############");
        System.out.print("Hello World");
        System.out.print("tout le monde");
        System.out.println();
        System.out.println("###############");

        int age = 25;
        double poids = 75.5;
        String nom = "John Doe";

        System.out.printf("Nom : %s, Age : %d, Poids : %f Kg", nom, age, poids);

        // /n pour un retour à la ligne
        System.out.printf("\nNom : %s, Age : %d, Poids : %f Kg", nom, age, poids);

        // /t pour une tabulation
        System.out.printf("\nNom : %s, \tAge : %d, \tPoids : %f Kg", nom, age, poids);

        // \b pour un retour en arrière
        System.out.printf("\nNom : %s, \bAge : %d, \bPoids : %f Kg", nom, age, poids);
    }

    public static void exercice4() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre:");
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Veuillez entrer un nombre entier.");
            scanner.nextLine();
            return;
        }
        System.out.println("vous avez entré le nombre: " + number);

        if (number % 3 == 0) {
            System.out.println("Le nombre est divisible par 3");
        } else {
            System.out.println("Le nombre n'est pas divisible par 3");
        }
        scanner.close();
    }

    public static void exercice5() {
        int number;
        double finalPrice;
        double basePrice = 0.5;
        double reduction = 0.1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nombre de photocopie:");
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Veuillez entrer un nombre entier.");
            return;
        }
        if (number < 10) {
            finalPrice = number * basePrice;
            System.out.println("Le prix total est de: " + finalPrice);
        } else if (number <= 20) {
            finalPrice = number * (basePrice - reduction);
            System.out.println("Le prix total est de: " + finalPrice + "€ avec un cout de 0.4€ par photocopie");
        } else {
            finalPrice = number * (basePrice - reduction * 2);
            System.out.println("Le prix total est de: " + finalPrice + "€ avec un cout de 0.3€ par photocopie");
        }
        scanner.close();

    }

    public static void exercice6() {
        double capital;
        double taux = 0.04;
        double gain;
        double annee;
        double difference;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le capital:");
        try {
            capital = scanner.nextDouble();
            System.out.println("le capital de départ est de " + capital + "€");
        } catch (InputMismatchException e) {
            System.out.println("Veuillez entrer un nombre.");
            return;
        }
        scanner.nextLine();
        System.out.println("Entrer le nombre d'année:");
        try {
            annee = scanner.nextDouble();
            System.out.println("le nombre d'année est de " + annee);
        } catch (InputMismatchException e) {
            System.out.println("Veuillez entrer un nombre.");
            return;
        }
        gain = capital * Math.pow(1 + taux, annee);
        gain = Math.round(gain * 100.0) / 100.0;
        difference = gain - capital;
        difference = Math.round(difference * 100.0) / 100.0;
        System.out.println("le gain est de " + gain + "€ avec une différence de " + difference + "€");
    }
}
