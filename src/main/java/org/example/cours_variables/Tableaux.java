package org.example.cours_variables;

import org.example.local.Translations;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tableaux {
    public static void exercice19() {
        int[] note = {12, 15, 13, 10, 5, 19, 8, 7, 11, 9};
        System.out.println(Translations.Notify("L'avant dernière notes est" + note[8], "info"));
    }

    public static void exercice20() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> noteArray = new ArrayList<>();
        int note;
        int i = 1;
        while (i <= 15) {
            System.out.println(Translations.Notify("Entrer la note " + i + ": ", "info"));
            try {
                note = scanner.nextInt();
                noteArray.add(note);
                i++;
            } catch (InputMismatchException e) {
                System.out.println(Translations.Notify("Veuillez entrer un nombre valide", "error"));
                scanner.next();
            }
        }
        arrayPrint(noteArray);
    }

    private static void arrayPrint(ArrayList<Integer> noteArray) {
        System.out.println(Translations.Notify("Voici les notes que vous avez entré: ", "info"));
        for (int j = 0; j < noteArray.size(); j++) {
            if (j == noteArray.size() - 1) {
                System.out.println(Translations.Notify(String.valueOf(noteArray.get(j)), "success"));
            } else {
                System.out.print(Translations.Notify(noteArray.get(j) + ", ", "success"));
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
            System.out.print(Translations.Notify("Les notes de l'élève " + (i + 1) + " sont: ", "info"));
            for (int j = 0; j < notes[i].length; j++) {
                if (j == notes[i].length - 1) {
                    System.out.println(Translations.Notify(String.valueOf(notes[i][j]), "success"));
                } else {
                    System.out.print(Translations.Notify(notes[i][j] + ", ", "success"));
                }
            }
        }
    }
}


