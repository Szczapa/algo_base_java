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
        int number;
        for (int i = 1; i <= 10; i++) {
            number = 9 * i;
            System.out.println("9 * " + i + " = " + number);
        }
    }

    public static void exercice13() {
        int number = 0;
        int max = Integer.MIN_VALUE;
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

        /*
        for (int j = 0; j < number; j++) {
        System.out.print(j+" + ");
            sum += j;
        }
        System.out.println(number+" = "+(sum+number));
        */
    }

    public static void exercice15() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Table de multiplication de " + (i + 1));
            for (int j = 0; j < 10; j++) {
                System.out.println((i + 1) + " * " + (j + 1) + " = " + (i + 1) * (j + 1));
            }
        }

        System.out.println();
        System.out.println(Translations.Notify("Exercice 15BIS", "info"));

        int habitant = 96809;
        double accroissement = 0.89;
//        System.out.println(habitant * accroissement / 100);
        int i;
        for (i = 1; habitant < 120000; i++) {
            habitant += habitant * accroissement / 100;
            if (habitant > 120000) {
                System.out.println("année " + i + " : " + habitant);
                break;
            }
        }
        System.out.println(Translations.Notify("Le nombre d'année pour atteindre 120000 habitants est de " + i, "success"));
    }

    public static void exercice16() {
        double maxNote = 0;
        double minNote = 0;
        double moyenne = 0;
        int nombreNote = 20;
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nombreNote; i++) {
            System.out.println(Translations.Notify("Entrer une note", "info"));
            try {
                double note = scanner.nextDouble();
                if (note < 0) {
                    System.out.println(Translations.Notify("La note ne peut pas être négative", "error"));
                    i--;
                    continue;
                }
                if (i == 0) {
                    maxNote = note;
                    minNote = note;
                }
                if (maxNote < note) {
                    maxNote = note;
                }
                if (minNote > note) {
                    minNote = note;
                }
                moyenne += note;
            } catch (InputMismatchException e) {
                System.out.println(Translations.Notify("Erreur de saisie", "error"));
                scanner.next();
                i--;
            }
        }
        moyenne = moyenne / nombreNote;
        do {
            System.out.println(Translations.Notify("Selectionnez ce que vous voulez afficher", "info"));
            System.out.println(Translations.Notify("1. Note la plus haute", "choice"));
            System.out.println(Translations.Notify("2. Note la plus basse", "choice"));
            System.out.println(Translations.Notify("3. Moyenne des notes", "choice"));
            System.out.println(Translations.Notify("0. Quitter", "error"));

            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 ->
                            System.out.println(Translations.Notify("La note la plus haute est: " + maxNote, "success"));
                    case 2 ->
                            System.out.println(Translations.Notify("La note la plus basse est: " + minNote, "success"));
                    case 3 ->
                            System.out.println(Translations.Notify("La moyenne des notes est: " + moyenne, "success"));
                    case 0 -> System.out.println(Translations.Notify("Au revoir", "info"));
                    default -> System.out.println(Translations.Notify("Erreur de saisie", "error"));
                }
            } catch (InputMismatchException e) {
                System.out.println(Translations.Notify("Erreur de saisie", "error"));
                scanner.next();
            }
        } while (choice != 0);
    }

    public static void exercice17() {
        double note;
        double maxNote = 0; // Double.MIN_VALUE
        double minNote = 0; // Double.MAX_VALUE
        double moyenne = 0;
        int nombreNote = 0;
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println(Translations.Notify("Entrer une note", "info"));
            try {
                note = scanner.nextDouble();
                if (note < 0) {
                    System.out.println(Translations.Notify("La note ne peut pas être négative", "error"));
                    continue;
                }
                if (note == 0) {
                    break;
                }
                /*
                    maxNote = Math.max(maxNote, note);
                    minNote = Math.min(minNote, note);
                 */
                if (nombreNote == 0) {
                    maxNote = note;
                    minNote = note;
                }

                if (maxNote < note) {
                    maxNote = note;
                }
                if (minNote > note) {
                    minNote = note;
                }
                nombreNote++;
                moyenne += note;
            } catch (InputMismatchException e) {
                System.out.println(Translations.Notify("Erreur de saisie nombre uniquement", "error"));
                scanner.next();
            }
        } while (true);

        if (nombreNote != 0) {
            moyenne = moyenne / nombreNote;
        }
        System.out.println("Veuillez entrer un nombre :");

        do {
            System.out.println(Translations.Notify("Selectionnez ce que vous voulez afficher", "info"));
            System.out.println(Translations.Notify("1. Note la plus haute", "choice"));
            System.out.println(Translations.Notify("2. Note la plus basse", "choice"));
            System.out.println(Translations.Notify("3. Moyenne des notes", "choice"));
            System.out.println(Translations.Notify("0. Quitter", "error"));
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 ->
                            System.out.println(Translations.Notify("La note la plus haute est: " + maxNote, "success"));
                    case 2 ->
                            System.out.println(Translations.Notify("La note la plus basse est: " + minNote, "success"));
                    case 3 ->
                            System.out.println(Translations.Notify("La moyenne des notes est: " + moyenne, "success"));
                    case 0 -> System.out.println(Translations.Notify("Au revoir", "info"));
                    default -> System.out.println(Translations.Notify("Erreur de saisie", "error"));
                }
            } catch (InputMismatchException e) {
                System.out.println(Translations.Notify("Erreur de saisie nombre uniquement", "error"));
                scanner.next();
            }
        } while (choice != 0);

        System.out.println();
        System.out.println(Translations.Notify("Exercice 17BIS", "info"));
        System.out.println("Veuillez entrer un nombre :");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void exercice18() {
        int number1 = 0;
        int number2 = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println(Translations.Notify("Entrer nombre " + (i + 1) + " :", "info"));
            try {
                if (i == 0) {
                    number1 = scanner.nextInt();
                } else {
                    number2 = scanner.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println(Translations.interactNotify("entier", "error"));
                scanner.next();
                i--;
            }
        }
        String max = max_Value(number1, number2);
        System.out.println(Translations.Notify(max, "success"));
    }

    public static String max_Value(int nombre1, int nombre2) {

//        return (nombre1 < nombre2) ? "Le plus grand nombre est " + nombre2 : "Le plus grand nombre est " + nombre1;

        if (nombre1 < nombre2) {
            return "Le plus grand nombre est: " + nombre2;
        } else if (nombre1 > nombre2) {
            return "Le plus grand nombre est: " + nombre1;
        }
        return "Les deux nombres sont égaux";
    }
}


