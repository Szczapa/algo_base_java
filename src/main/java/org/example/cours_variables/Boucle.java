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
                System.out.println(Translations.interactNotify("entier", "error"));
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
            System.out.println(Translations.interactNotify(("nombre"), "error"));
            return;
        }
        while (capital * 2 > capitalFinal) {
            annee++;
            capitalFinal = capital * Math.pow(1 + taux, annee);
        }
        capitalFinal = Math.round(capitalFinal * 100.0) / 100.0;
        System.out.println(Translations.Notify("Le capital sera doublé en " + annee + " années.", "success"));
    }

    public static void exercice12() {
        int number = 0;

        // print la table de multiplication de 9 en utilisant uniquement des boucles imbriqué
        for (int i = 1; i <= 10; i++) {
            number = 9 * i;
            System.out.println("9 * " + i + " = " + number);
        }
    }

    public static void exercice13() {
        // Ecrire un algorithme qui demande successivement 6 nombres à l’uKlisateur, et qui lui dit ensuite quel
        //était le plus grand parmi ces 6 nombres.
        int number = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println(Translations.Notify("Entrer un nombre entier", "info"));
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(Translations.interactNotify("entier", "error"));
                scanner.next();
                i--;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println(Translations.Notify("Le plus grand nombre est: " + max, "success"));
    }

    public static void exercice14() {
        int number = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(Translations.Notify("Entrer un nombre entier", "info"));
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(Translations.interactNotify("entier", "error"));
            scanner.next();
        }
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void exercice15() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Table de multiplication de " + (i + 1));
            for (int j = 0; j < 10; j++) {
                System.out.println((i + 1) + " * " + (j + 1) + " = " + (i + 1) * (j + 1));
            }
        }

        System.out.println();
        System.out.println("Exercice 15 BIS: ");
        int habitant = 96809;
        double accroissement = 0.89;
        System.out.println(habitant * accroissement/100);
        int i;
        for (i = 1; habitant < 120000; i++ ){
            habitant += habitant * accroissement/100;
            if (habitant > 120000){
                System.out.println("année " + i + " : " + habitant);
                break;
            }
        }
        System.out.println("il faut " + i + " ans pour atteindre 120000 habitants");
    }

    public static void exercice16(){
        
    }
}

