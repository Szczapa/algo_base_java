package org.example.cours_variables;

import org.example.local.Translations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Boucle {

    public static void exercice10() {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(Translations.Notify("Entrer un nombre entre 1 et 3", "info"));
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(Translations.resultNotify("entier", "error"));
                scanner.next();
            }
        } while (number < 1 || number > 3);
        System.out.println(Translations.Notify("Nombre valide: " + number, "success"));
    }

    public static void exercice11() {
        double capital;
        int annee = 0;
        double capitalFinal = 0;
        double taux = 0.04;
        Scanner scanner = new Scanner(System.in);
        System.out.println(Translations.Notify("Entrer le capital:", "info"));
        try {
            capital = scanner.nextDouble();
            System.out.println(Translations.Notify("le capital de départ est de " + capital + "€", "info"));
        } catch (InputMismatchException e) {
            System.out.println(Translations.resultNotify(("nombre"), "error"));
            return;
        }
        while (capital * 2 > capitalFinal) {
            annee++;
            capitalFinal = capital * Math.pow(1 + taux, annee);
        }
        capitalFinal = Math.round(capitalFinal * 100.0) / 100.0;
        System.out.println(Translations.Notify("Le capital sera doublé en " + annee + " années.", "success"));
    }
}
