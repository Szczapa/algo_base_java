package org.example.cours_variables;

import org.example.local.Translations;

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
            System.out.println(Translations.interactNotify("entier", "error"));
            scanner.nextLine();
            return;
        }
        System.out.println(Translations.Notify("Le nombre est: " + number, "info"));

        if (number % 3 == 0) {
            System.out.println(Translations.Notify("Le nombre est divisible par 3", "success"));
        } else {
            System.out.println(Translations.Notify("Le nombre n'est pas divisible par 3", "error"));
        }
    }

    public static void exercice5() {
        int number;
        double finalPrice;
        double basePrice = 0.5;
        double reduction = 0.1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(Translations.Notify("Entrer le nombre de photocopie:", "info"));
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Translations.interactNotify("entier", "error"));
            return;
        }
        if (number < 10) {
            finalPrice = number * basePrice;
            System.out.println(Translations.Notify("Le prix total est de: " + finalPrice + "€ avec un cout de 0.5€ par photocopie", "success"));
        } else if (number <= 20) {
            finalPrice = number * (basePrice - reduction);
            System.out.println(Translations.Notify("Le prix total est de: " + finalPrice + "€ avec un cout de 0.4€ par photocopie", "success"));
        } else {
            finalPrice = number * (basePrice - reduction * 2);
            System.out.println(Translations.Notify("Le prix total est de: " + finalPrice + "€ avec un cout de 0.3€ par photocopie", "success"));
        }
    }

    public static void exercice6() {

        double capital;
        double taux = 0.04;
        double gain;
        double annee;
        double difference;

        Scanner scanner = new Scanner(System.in);
        System.out.println(Translations.Notify("Entrer le capital:", "info"));
        try {
            capital = scanner.nextDouble();
            System.out.println(Translations.Notify("le capital de départ est de " + capital + "€", "info"));
        } catch (InputMismatchException e) {
            System.out.println(Translations.interactNotify("nombre", "error"));
            return;
        }
        scanner.nextLine();
        System.out.println(Translations.Notify("Entrer le nombre d'année:", "info"));
        try {
            annee = scanner.nextDouble();
            System.out.println(Translations.Notify("le nombre d'année est de " + annee, "info"));
        } catch (InputMismatchException e) {
            System.out.println(Translations.interactNotify("nombre", "error"));
            return;
        }
        gain = capital * Math.pow(1 + taux, annee);
        gain = Math.round(gain * 100.0) / 100.0;
        difference = gain - capital;
        difference = Math.round(difference * 100.0) / 100.0;
        System.out.println(Translations.Notify("le gain est de " + gain + "€ avec une différence de " + difference + "€", "success"));
    }

    public static void exercice7() {
        int age;
        Scanner scanner = new Scanner(System.in);
        try {
            age = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Translations.interactNotify("entier", "error"));
            return;
        }

        /*
        if (age >= 3 && age <= 6) {
            System.out.println(Translations.Notify("Catégorie: Baby", "success"));
        } else if (age >= 7 && age <= 8) {
            System.out.println(Translations.Notify("Catégorie: Poussin", "success"));
        } else if (age >= 9 && age <= 10) {
            System.out.println(Translations.Notify("Catégorie: Pupille", "success"));
        } else if (age >= 11 && age <= 12) {
            System.out.println(Translations.Notify("Catégorie: Minime", "success"));
        } else if (age >= 13) {
            System.out.println(Translations.Notify("Catégorie: Cadet", "success"));
        } else {
            System.out.println(Translations.Notify("Catégorie non reconnue", "error"));
        }
        */

        if (age < 3 || age > 18) {
            System.out.println(Translations.Notify("Catégorie non reconnue", "error"));
        } else {
            if (age <= 6) {
                System.out.println(Translations.Notify("Catégorie: Baby", "success"));
            } else if (age <= 8) {
                System.out.println(Translations.Notify("Catégorie: Poussin", "success"));
            } else if (age <= 10) {
                System.out.println(Translations.Notify("Catégorie: Pupille", "success"));
            } else if (age <= 12) {
                System.out.println(Translations.Notify("Catégorie: Minime", "success"));
            } else {
                System.out.println(Translations.Notify("Catégorie: Cadet", "success"));
            }
        }

    /*
        switch (age) {
            case 3, 4, 5, 6 -> System.out.println(Translations.Notify("Catégorie: Baby", "success"));
            case 7, 8 -> System.out.println(Translations.Notify("Catégorie: Poussin", "success"));
            case 9, 10 -> System.out.println(Translations.Notify("Catégorie: Pupille", "success"));
            case 11, 12 -> System.out.println(Translations.Notify("Catégorie: Minime", "success"));
            case 13, 14, 15, 16, 17 -> System.out.println(Translations.Notify("Catégorie: Cadet", "success"));
            default -> System.out.println(Translations.Notify("Catégorie non reconnue", "error"));
        }
    */
    }

    public static void exercice8() {
        int ab, bc, ac;

        // Recuperation des valeurs fourni par l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le longueur de AB : ");
        ab = scanner.nextInt();
        System.out.println("Veuillez saisir le longueur de BC : ");
        bc = scanner.nextInt();
        System.out.println("Veuillez saisir le longueur de AC : ");
        ac = scanner.nextInt();


        // Test sur les longueur
        if (ab == bc) {
            // le cote AB est égal à BC
            if (bc == ac) {
                System.out.println("Le triangle est équilatéral");
            } else {
                System.out.println("Le triangle est isocéle en B");
            }
        } else {
            // le cote AB n'est pas egal à BC
            if (bc == ac) {
                System.out.println("Le triangle est isocéle en C");
            } else {
                if (ab == ac) {
                    System.out.println("Le triangle est isocéle en A");
                } else {
                    System.out.println("Le triangle n'est pas isocéle");
                }
            }
        }

    }

    public static void exercice9() {
        double masse;
        double taille;
        Scanner scanner = new Scanner(System.in);
        System.out.println(Translations.Notify("Entrer la masse en Kg:", "info"));
        try {
            masse = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(Translations.interactNotify("erreur_saisie", "error"));
            return;
        }
        System.out.println(Translations.Notify("Entrer la taille en cm:", "info"));
        try {
            taille = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(Translations.interactNotify("erreur_saisie", "error"));
            return;
        }
        // taille 1 -> 145 to 169 cm && 43 to 65 Kg
        // taille 2 -> 160 to 178 cm && 48 to 71 kg
        // taille 3 -> 163 to 183 cm && 54 to 77 kg
        if (43 <= masse && masse <= 47) {
            if (145 <= taille && taille <= 169) {
                System.out.println(Translations.Notify("La personne est de taille 1", "success"));
            } else {
                System.out.println(Translations.Notify("La personne n'est pas dans les critères", "error"));
            }
        }
        if (48 <= masse && masse <= 53) {
            if (145 <= taille && taille <= 166) {
                System.out.println(Translations.Notify("La personne est de taille 1", "success"));
            } else if (169 <= taille && taille <= 178) {
                System.out.println(Translations.Notify("La personne est de taille 2", "success"));
            } else {
                System.out.println(Translations.Notify("La personne n'est pas dans les critères", "error"));
            }
        }
        if (54 <= masse && masse <= 59) {
            if (145 <= taille && taille <= 163) {
                System.out.println(Translations.Notify("La personne est de taille 1", "success"));
            } else if (166 <= taille && taille <= 175) {
                System.out.println(Translations.Notify("La personne est de taille 2", "success"));
            } else if (178 <= taille && taille <= 183) {
                System.out.println(Translations.Notify("La personne est de taille 3", "success"));
            } else {
                System.out.println(Translations.Notify("La personne n'est pas dans les critères", "error"));
            }
        } else if (60 <= masse && masse <= 65) {
            System.out.println("pas bon");
            if (145 <= taille && taille <= 160) {
                System.out.println(Translations.Notify("La personne est de taille 1", "success"));
            } else if (163 <= taille && taille <= 172) {
                System.out.println(Translations.Notify("La personne est de taille 2", "success"));
            } else if (175 <= taille && taille <= 183) {
                System.out.println(Translations.Notify("La personne est de taille 3", "success"));
            } else {
                System.out.println(Translations.Notify("La personne n'est pas dans les critères", "error"));
            }
        } else if (66 <= masse && masse <= 71) {
            if (taille <= 160 && taille <= 169) {
                System.out.println(Translations.Notify("La personne est de taille 2", "success"));
            } else if (taille <= 172 && taille <= 183) {
                System.out.println(Translations.Notify("La personne est de taille 3", "success"));
            } else {
                System.out.println(Translations.Notify("La personne n'est pas dans les critères", "error"));
            }
        } else if (72 <= masse && masse <= 77) {
            if (taille >= 163 && taille <= 183) {
                System.out.println(Translations.Notify("La personne est de taille 3", "success"));
            } else {
                System.out.println(Translations.Notify("La personne n'est pas dans les critères", "error"));
            }
        }
    }
}
