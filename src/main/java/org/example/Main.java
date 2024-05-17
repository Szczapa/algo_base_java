package org.example;

import org.example.cours_variables.Boucle;
import org.example.cours_variables.Interaction;
import org.example.cours_variables.Variables;
import org.example.cours_variables.Tableaux;
import org.example.local.Translations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        char letter;
        Scanner scanner = new Scanner(System.in);

        System.out.println(Translations.interactNotify("menu", "info"));
        try {
            letter = scanner.next().charAt(0);
        } catch (InputMismatchException e) {
            System.out.println("Veuillez entrer une lettre uniquement : c pour cour ou e pour exercice");
            return;
        }

        if (letter == 'c') {
            System.out.println(Translations.interactNotify("cours", "info"));
            System.out.println(Translations.interactNotify("cours_1", "choice"));
            System.out.println(Translations.interactNotify("cours_2", "choice"));
            System.out.println(Translations.interactNotify("cours_selection", "info"));
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(Translations.interactNotify("entier", "error"));
                return;
            }

            switch (number) {
                case 1 -> Variables.courVariable();
                case 2 -> Interaction.courInteraction();
                default -> System.out.println(Translations.Notify("cours " + number + " non trouvé.", "error"));
            }
        } else if (letter == 'e') {
            System.out.println(Translations.interactNotify("exercice_selection", "info"));
            System.out.println(Translations.interactNotify("exercice_1", "choice"));
            System.out.println(Translations.interactNotify("exercice_2", "choice"));
            System.out.println(Translations.interactNotify("exercice_3", "choice"));
            System.out.println(Translations.interactNotify("exercice_4", "choice"));
            System.out.println(Translations.interactNotify("exercice_5", "choice"));
            System.out.println(Translations.interactNotify("exercice_6", "choice"));
            System.out.println(Translations.interactNotify("exercice_7", "choice"));
            System.out.println(Translations.interactNotify("exercice_8", "choice"));
            System.out.println(Translations.interactNotify("exercice_9", "choice"));
            System.out.println(Translations.interactNotify("exercice_10", "choice"));
            System.out.println(Translations.interactNotify("exercice_11", "choice"));
            System.out.println(Translations.interactNotify("exercice_12", "choice"));
            System.out.println(Translations.interactNotify("exercice_13", "choice"));
            System.out.println(Translations.interactNotify("exercice_14", "choice"));
            System.out.println(Translations.interactNotify("exercice_15", "choice"));
            System.out.println(Translations.interactNotify("exercice_16", "choice"));
            System.out.println(Translations.interactNotify("exercice_17", "choice"));
            System.out.println(Translations.interactNotify("exercice_18", "choice"));
            System.out.println(Translations.interactNotify("exercice_19", "choice"));
            System.out.println(Translations.interactNotify("exercice_20", "choice"));
            System.out.println(Translations.interactNotify("exercice_21", "choice"));
            System.out.println(Translations.interactNotify("exercice_selection", "info"));
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(Translations.interactNotify("entier", "error"));
                return;
            }
            switch (number) {
                case 1 -> Variables.exercice1();
                case 2 -> Variables.exercice2();
                case 3 -> Variables.exercice3();
                case 4 -> Interaction.exercice4();
                case 5 -> Interaction.exercice5();
                case 6 -> Interaction.exercice6();
                case 7 -> Interaction.exercice7();
                case 8 -> Interaction.exercice8();
                case 9 -> Interaction.exercice9();
                case 10 -> Boucle.exercice10();
                case 11 -> Boucle.exercice11();
                case 12 -> Boucle.exercice12();
                case 13 -> Boucle.exercice13();
                case 14 -> Boucle.exercice14();
                case 15 -> Boucle.exercice15();
                case 16 -> Boucle.exercice16();
                case 17 -> Boucle.exercice17();
                case 18 -> Boucle.exercice18();
                case 19 -> Tableaux.exercice19();
                case 20 -> Tableaux.exercice20();
                case 21 -> Tableaux.exercice21();
                default -> System.out.println(Translations.Notify("exercice " + number + " non trouvé.", "error"));
            }
        } else {
            System.out.println(Translations.Notify("lettre " + letter + " non reconnue.", "error"));
        }
    }
}