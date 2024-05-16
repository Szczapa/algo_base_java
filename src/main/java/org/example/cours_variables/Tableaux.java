package org.example.cours_variables;
import org.example.local.Translations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tableaux {
    public static void exercice19(){
        int[] note = {12, 15, 13, 10, 5, 19, 8, 7, 11, 9};
        System.out.println("La neuvième note  est: " + note[8]);
    }

    public static void exercice20(){
        Scanner scanner = new Scanner(System.in);
        int[] note = {};
        System.out.println("Entrer le nombre de note à saisir: ");
        int nombreNote = scanner.nextInt();

    }
}
