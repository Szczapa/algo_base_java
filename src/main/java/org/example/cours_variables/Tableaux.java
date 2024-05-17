package org.example.cours_variables;

import org.example.local.Translations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tableaux {
   public static void exercice19() {
    int[] note = {12, 15, 13, 10, 5, 19, 8, 7, 11, 9};
    String message = "L'avant dernière notes est " + note[8];
    String[] colors = {
        "\u001B[31m", // Red
        "\u001B[33m", // Yellow
        "\u001B[32m", // Green
        "\u001B[34m", // Blue
        "\u001B[35m", // Purple
        "\u001B[36m", // Cyan
    };

    StringBuilder rainbowMessage = new StringBuilder();
    for (int i = 0; i < message.length(); i++) {
        String color = colors[i % colors.length];
        rainbowMessage.append(color).append(message.charAt(i));
    }
    // Reset color
    rainbowMessage.append("\u001B[0m");

    System.out.println(rainbowMessage.toString());
}

    public static void exercice20() {
        Scanner scanner = new Scanner(System.in);
        int noteQuantity;
        do {
                System.out.println(Translations.Notify("Combien de notes voulez-vous entrer? ", "info"));
            try {
                noteQuantity = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(Translations.Notify("Veuillez entrer un nombre valide", "error"));
                scanner.next();
            }
        } while (true);
        arrayPrint(arrayAdd(noteQuantity));
    }

    public static int[] arrayAdd(int noteQuantity) {
        Scanner scanner = new Scanner(System.in);
        int[] noteArray = new int[noteQuantity];
        for (int j = 0; j < noteArray.length; j++) {
            System.out.println(Translations.Notify("Entrer la note " + (j + 1) + ": ", "info"));
            try {
                int note = scanner.nextInt();
                noteArray[j] = note;
            } catch (InputMismatchException e) {
                System.out.println(Translations.Notify("Veuillez entrer un nombre valide", "error"));
                j--;
                scanner.next();
            }
        }
        return noteArray;
    }

    private static void arrayPrint(int[] noteArray) {
        System.out.println(Translations.Notify("Voici les notes que vous avez entré: ", "info"));
        for (int j = 0; j < noteArray.length; j++) {
            if (j == noteArray.length - 1) {
                System.out.println(Translations.Notify(String.valueOf(noteArray[j]), "success"));

            } else {
                System.out.print(Translations.Notify(noteArray[j] + ", ", "success"));
            }
        }
    }

    public static void exercice21() {
        Scanner scanner = new Scanner(System.in);
        double[][] notes = new double[15][3];
        double sendNote;
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                System.out.println(Translations.Notify("Entrer la note " + (j + 1) + " de l'élève " + (i + 1) + ": ", "info"));
                do {
                    try {
                        sendNote = scanner.nextDouble();
                        notes[i][j] = sendNote;
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println(Translations.Notify("Veuillez entrer un nombre valide", "error"));
                        j--;
                        scanner.next();
                    }
                } while (true);
            }
        }
        arrayPrint(notes);
    }

    private static void arrayPrint(double[][] notes) {
        for (int i = 0; i < notes.length; i++) {
            System.out.print(Translations.Notify("Les notes de l'élève " + Translations.Notify( String.valueOf (i + 1),"info") + " sont: ", "choice"));
            for (int j = 0; j < notes[i].length; j++) {
                if (j == notes[i].length - 1) {
                    System.out.println(Translations.Notify(String.valueOf(notes[i][j]), "success"));
                } else {
                    System.out.print(Translations.Notify(notes[i][j] + Translations.Notify(",","choice") , "success"));
                }
            }
        }
    }

    /*
        public static void exercice20() {
        arrayPrint(arrayAdd(selectArrayLenght()));
    }

    public static int selectArrayLenght(){
        Scanner scanner = new Scanner(System.in);
        int noteQuantity;
        do {
            System.out.println(Translations.Notify("Combien de notes voulez-vous entrer? ", "info"));
            try {
                noteQuantity = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(Translations.Notify("Veuillez entrer un nombre valide", "error"));
                scanner.next();
            }
        } while (true);
        return noteQuantity;
    }

    public static int[] arrayAdd(int noteQuantity) {
        Scanner scanner = new Scanner(System.in);
        int[] noteArray = new int[noteQuantity];
        for (int j = 0; j < noteArray.length; j++) {
            System.out.println(Translations.Notify("Entrer la note " + (j + 1) + ": ", "info"));
            try {
                int note = scanner.nextInt();
                noteArray[j] = note;
            } catch (InputMismatchException e) {
                System.out.println(Translations.Notify("Veuillez entrer un nombre valide", "error"));
                j--;
                scanner.next();
            }
        }
        return noteArray;
    }

    private static void arrayPrint(int[] noteArray) {
        System.out.println(Translations.Notify("Voici les notes que vous avez entré: ", "info"));
        for (int j = 0; j < noteArray.length; j++) {
            if (j == noteArray.length - 1) {
                System.out.println(Translations.Notify(String.valueOf(noteArray[j]), "success"));

            } else {
                System.out.print(Translations.Notify(noteArray[j] + ", ", "success"));
            }
        }
    }
     */
}


