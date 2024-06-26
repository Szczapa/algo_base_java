package org.example.local;

import java.util.HashMap;
import java.util.Map;

public class Translations {
    public static Map<String, String> error;
    public static Map<String, String> info;
    public static Map<String, String> success;
    public static Map<String, String> choice;

    public static final String greenTextCode = "\033[32m";
    public static final String redTextCode = "\033[31m";
    public static final String yellowTextCode = "\033[33m";
    public static final String blueTextCode = "\033[34m";
    public static final String resetTextCode = "\033[0m";

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
        choice.put("exercice_5", "5. Calcul prix Photocopie");
        choice.put("exercice_6", "6. Calcul d'interet bancaire");
        choice.put("exercice_7", "7. Classement age");
        choice.put("exercice_8", "8. Triangle");
        choice.put("exercice_9", "9. Taille vetement");
        choice.put("exercice_10", "10. Boucle 1 et 3");
        choice.put("exercice_11", "11. Nombre année");
        choice.put("exercice_12", "12. Table de multiplication");
        choice.put("exercice_13", "13. Plus grand nombre");
        choice.put("exercice_14", "14. Addition de nombre entier");
        choice.put("exercice_15", "15. Multiplication des tables de 1 à 10 & 15 Bis");
        choice.put("exercice_16", "16. calcul de note");
        choice.put("exercice_17", "17. Saisie de note infini (ou presque) & 17 Bis");
        choice.put("exercice_18", "18. Valeur la plus grande");
        choice.put("exercice_19", "19. Avant dernière note");
        choice.put("exercice_20", "20. Saisie de note");
        choice.put("exercice_21", "21. Tableau multi-dimensionnel");
    }

    public static String interactNotify(String textName, String textType) {
        String text = switch (textType) {
            case "error" -> redTextCode + error.get(textName) +resetTextCode;
            case "info" -> yellowTextCode + info.get(textName) +resetTextCode;
            case "success" -> greenTextCode + success.get(textName) +resetTextCode;
            case "choice" -> blueTextCode + choice.get(textName) +resetTextCode;
            default -> redTextCode + "Erreur internes";
        };
        return text;
    }

    public static String Notify(String textContent, String textType) {
        String text = null;
        switch (textType) {
            case "error" -> text = redTextCode + textContent +resetTextCode;
            case "info" -> text = yellowTextCode + textContent +resetTextCode;
            case "success" -> text = greenTextCode + textContent +resetTextCode;
            case "choice" -> text = blueTextCode + textContent +resetTextCode;
        }
        return text;
    }
}
