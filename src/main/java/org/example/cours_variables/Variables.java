package org.example.cours_variables;

public class Variables {
    public static void courVariable() {
        // int entier sur 64 bits
        int age;
        System.out.println("int est un entier sur 64 bits");

        // long entier sur 64 bits
        long population;
        System.out.println("long est un entier sur 64 bits");

        // float nombre à virgule flottante sur 32 bits
        float temperature;
        System.out.println("float est un nombre à virgule flottante sur 32 bits");

        // double nombre à virgule flottante sur 64 bits
        double monnaie;
        System.out.println("double est un nombre à virgule flottante sur 64 bits");

        // boolean vrai ou faux
        boolean estVrai;
        System.out.println("boolean est vrai ou faux");

        // char caractère sur 16 bits
        char lettre;
        System.out.println("char est un caractère sur 16 bits");


        // chaine de caractères
        String nom;
        System.out.println("String est une chaine de caractères mais pas un type primitif");

    }

    public static void exercice1() {
        int a;
        int b;
        int c;
        a = 3;
        b = 7;
        a = b;
        b = a + 5;
        c = a + b;
        c = b - a;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }

    public static void exercice2() {
        int a;
        int b;
        a = 1;
        b = 2;
        a = b;
        b = a;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("les deux dernière lignes ne permettent pas d'échanger les valeurs de a et b.");
    }

    public static void exercice3() {
        int a;
        int b;
        int c; // variable temporaire
        a = 1;
        b = 2;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("pour échanger les valeurs de a et b, il faut utiliser une variable temporaire.");
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("les variables a et b ont bien été échangées.");
    }
}
