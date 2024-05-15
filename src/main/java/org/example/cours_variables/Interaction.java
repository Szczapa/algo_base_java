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
            System.out.println(Translations.resultNotify("entier", "error"));
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
            System.out.println(Translations.resultNotify("entier", "error"));
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
            System.out.println(Translations.resultNotify("nombre", "error"));
            return;
        }
        scanner.nextLine();
        System.out.println(Translations.Notify("Entrer le nombre d'année:", "info"));
        try {
            annee = scanner.nextDouble();
            System.out.println(Translations.Notify("le nombre d'année est de " + annee, "info"));
        } catch (InputMismatchException e) {
            System.out.println(Translations.resultNotify("nombre", "error"));
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
            System.out.println(Translations.resultNotify("entier", "error"));
            return;
        }
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
        }
    }

    public static void exercice8() {
        double ab, ba;
        double bc, cb;
        double ac, ca;
        Scanner scanner = new Scanner(System.in);
        System.out.println(Translations.Notify("Entrer la longueur du côté AB:", "info"));
        try {
            ab = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(Translations.resultNotify("nombre", "error"));
            return;
        }
        System.out.println(Translations.Notify("Entrer la longueur du côté BC:", "info"));
        try {
            bc = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(Translations.resultNotify("nombre", "error"));
            return;
        }
        System.out.println(Translations.Notify("Entrer la longueur du côté CA:", "info"));
        try {
            ca = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(Translations.resultNotify("nombre", "error"));
            return;
        }
        ac = ca;
        ba = ab;
        cb = bc;

        if (ab == ac) {
            if (ab == bc) {
                System.out.println(Translations.Notify("Le triangle est équilatérale", "success"));
            } else {
                System.out.println(Translations.Notify("Isocèle en A mais pas équilatérale", "success"));
            }
        } else if (bc == ba) {
            if (bc == ca) {
                System.out.println(Translations.Notify("Le triangle est équilatérale", "success"));
            } else {
                System.out.println(Translations.Notify("Isocèle en B mais pas équilatérale", "success"));
            }
        } else if (cb == ca) {
            if (cb == ab) {
                System.out.println(Translations.Notify("Le triangle est équilatérale", "success"));
            } else {
                System.out.println(Translations.Notify("Isocèle en C mais pas équilatérale", "success"));
            }
        } else {
            System.out.println(Translations.Notify("Le triangle n'est pas équilatérale", "success"));
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
            System.out.println(Translations.resultNotify("erreur_saisie", "error"));
            return;
        }
        System.out.println(Translations.Notify("Entrer la taille en cm:", "info"));
        try {
            taille = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(Translations.resultNotify("erreur_saisie", "error"));
            return;
        }
        // taille 1 -> 145 to 169 cm && 43 to 65 Kg
        // taille 2 -> 160 to 178 cm && 48 to 71 kg
        // taille 3 -> 163 to 183 cm && 54 to 77 kg

        if ((taille >= 145 && taille <= 169) && (masse >= 43 && masse <= 65)) {
            System.out.println(Translations.Notify("Taille 1", "success"));
        } else if ((taille >= 160 && taille <= 178) && (masse >= 48 && masse <= 71)) {
            System.out.println(Translations.Notify("Taille 2", "success"));
        } else if ((taille >= 163 && taille <= 183) && (masse >= 54 && masse <= 77)) {
            System.out.println(Translations.Notify("Taille 3", "success"));
        } else {
            System.out.println(Translations.Notify("Taille non reconnue", "error"));
        }
    }
}
