package org.example;

import org.example.cours_variables.Boucle;
import org.example.cours_variables.Interaction;
import org.example.cours_variables.Variables;
import org.example.local.Translations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        char letter;
        Scanner scanner = new Scanner(System.in);

        System.out.println(Translations.resultNotify("menu", "info"));
        try {
            letter = scanner.next().charAt(0);
        } catch (InputMismatchException e) {
            System.out.println("Veuillez entrer une lettre uniquement : c pour cour ou e pour exercice");
            return;
        }

        if (letter == 'c') {
            System.out.println(Translations.resultNotify("cours", "info"));
            System.out.println(Translations.resultNotify("cours_1", "choice"));
            System.out.println(Translations.resultNotify("cours_2", "choice"));
            System.out.println(Translations.resultNotify("cours_selection", "info"));
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(Translations.resultNotify("entier", "error"));
                return;
            }

            switch (number) {
                case 1:
                    Variables.courVariable();
                    break;
                case 2:
                    Interaction.courInteraction();
                    break;
                default:
                    System.out.println(Translations.Notify("cours " + number + " non trouvé.", "error"));
                    break;
            }
        } else if (letter == 'e') {
            System.out.println(Translations.resultNotify("exercice_selection", "info"));
            System.out.println(Translations.resultNotify("exercice_1", "choice"));
            System.out.println(Translations.resultNotify("exercice_2", "choice"));
            System.out.println(Translations.resultNotify("exercice_3", "choice"));
            System.out.println(Translations.resultNotify("exercice_4", "choice"));
            System.out.println(Translations.resultNotify("exercice_5", "choice"));
            System.out.println(Translations.resultNotify("exercice_6", "choice"));
            System.out.println(Translations.resultNotify("exercice_7", "choice"));
            System.out.println(Translations.resultNotify("exercice_8", "choice"));
            System.out.println(Translations.resultNotify("exercice_9", "choice"));
            System.out.println(Translations.resultNotify("exercice_10", "choice"));
            System.out.println(Translations.resultNotify("exercice_11", "choice"));
            System.out.println(Translations.resultNotify("exercice_selection", "info"));
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(Translations.resultNotify("entier", "error"));
                return;
            }
            switch (number) {
                case 1:
                    Variables.exercice1();
                    break;
                case 2:
                    Variables.exercice2();
                    break;
                case 3:
                    Variables.exercice3();
                    break;
                case 4:
                    Interaction.exercice4();
                    break;
                case 5:
                    Interaction.exercice5();
                    break;
                case 6:
                    Interaction.exercice6();
                    break;
                case 7:
                    Interaction.exercice7();
                    break;
                case 8:
                    Interaction.exercice8();
                    break;
                case 9:
                    Interaction.exercice9();
                    break;
                case 10:
                    Boucle.exercice10();
                    break;
                case 11:
                    Boucle.exercice11();
                    break;
                default:
                    System.out.println(Translations.Notify("exercice " + number + " non trouvé.", "error"));
                    break;
            }
        } else {
            System.out.println(Translations.Notify("lettre " + letter + " non reconnue.", "error"));
        }
    }
}