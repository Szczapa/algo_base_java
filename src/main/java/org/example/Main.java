package org.example;

import org.example.cours_variables.Interaction;
import org.example.cours_variables.Variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        char letter;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("entrer la lettre pour du cours ou de l'exercice (c/e)");
            try {
                letter = scanner.next().charAt(0);
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer une lettre uniquement : c pour cour ou e pour exercice");
                return;
            }

            if (letter == 'c') {
                do {


                    System.out.println("Sommaire des cours:");
                    System.out.println("1. Variables");
                    System.out.println("2. Interaction");
                    System.out.println("Entrer le numéro du cours:");
                    try {
                        number = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Veuillez entrer un nombre entier.");
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
                            System.out.println("cours" + number + "non trouvé.");
                            break;
                    }
                } while (true);
            } else if (letter == 'e') {
                do {
                    System.out.println("Sommaire des exercices:");
                    System.out.println("1. Variables basiques");
                    System.out.println("2. Variables non échangées");
                    System.out.println("3. Variables inversées");
                    System.out.println("4. Divisible par 3");
                    System.out.println("5. calcul prix Photocopie");
                    System.out.println("6. calcul d'interet bancaire");
                    System.out.println("Entrer le numéro d'exercice:");
                    try {
                        number = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Veuillez entrer un nombre entier.");
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
                        default:
                            System.out.println("Exercice" + number + "non trouvé.");
                            break;
                    }
                } while (true);
            } else {
                System.out.println("Lettre non reconnue.");
            }
        } while (true);
    }
}