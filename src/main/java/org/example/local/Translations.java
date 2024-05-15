package org.example.local;

import java.util.HashMap;
import java.util.Map;

public class Translations {
    public static Map<String, String> error;
    public static Map<String, String> info;
    public static Map<String, String> success;
    public static Map<String, String> choice;

    public static String greenTextCode = "\033[32m";
    public static String redTextCode = "\033[31m";
    public static String yellowTextCode = "\033[33m";
    public static String blueTextCode = "\033[34m";

    static {
        success = new HashMap<>();

        error = new HashMap<>();
        error.put("entier", "Erreur de saisie, nombre entier uniquement.");
        error.put("nombre", "Erreur de saisie, nombre uniquement.");
        error.put("erreur_saisie", "Erreur de saisie.");
        error.put("erreur_lettre", "Lettre non reconnue.");
        error.put("cours_not_found", "Cours non trouvé.");
        error.put("exercice_not_found", "Exercice non trouvé.");


        info = new HashMap<>();
        info.put("info_nombre", "Veuillez entrer un nombre.");
        info.put("menu", "entrer la lettre pour du cours ou de l'exercice (c/e)");
        info.put("cours", "Sommaire des cours:");
        info.put("cours_selection", "Entrer le numéro du cours:");
        info.put("exercise", "Sommaire des exercices:");
        info.put("exercice_selection", "Entrer le numéro d'exercice:");

        choice = new HashMap<>();
        choice.put("cours_1", "1. Variables");
        choice.put("cours_2", "2. Interaction");
        choice.put("exercice_1", "1. Variables basiques");
        choice.put("exercice_2", "2. Variables non échangées");
        choice.put("exercice_3", "3. Variables inversées");
        choice.put("exercice_4", "4. Divisible par 3");
        choice.put("exercice_5", "5. calcul prix Photocopie");
        choice.put("exercice_6", "6. calcul d'interet bancaire");
        choice.put("exercice_7", "7. classement age");
        choice.put("exercice_8", "8. Triangle");
        choice.put("exercice_9", "9. Taille vetement");
        choice.put("exercice_10", "10. Boucle 1 et 3");
        choice.put("exercice_11", "10. Nombre année");

    }

    public static String interactNotify(String textName, String textType) {
        String text = switch (textType) {
            case "error" -> redTextCode + error.get(textName);
            case "info" -> yellowTextCode + info.get(textName);
            case "success" -> greenTextCode + success.get(textName);
            case "choice" -> blueTextCode + choice.get(textName);
            default -> redTextCode + "Erreur internes";
        };
        return text;
    }

    public static String Notify(String textContent, String textType) {
        String text = null;
        switch (textType) {
            case "error" -> text = redTextCode + textContent;
            case "info" -> text = yellowTextCode + textContent;
            case "success" -> text = greenTextCode + textContent;
            case "choice" -> text = blueTextCode + textContent;
        }
        return text;
    }
}
