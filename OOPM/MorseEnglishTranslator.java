package OOPM;

import java.util.Scanner;

public class MorseEnglishTranslator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean EM = false;

        System.out.println("Translator: Morse Code - English");
        System.out.println("Do you want EM or ME?");
        String choice = scanner.nextLine().toUpperCase();

        if (choice.equals("EM")) {
            System.out.println("Please Enter Your English text: ");
            String userInputEM = scanner.nextLine().toLowerCase();
            EnglishToMorse emTranslator = new EnglishToMorse();
            String result = emTranslator.translate(userInputEM);
            System.out.println(result);

        } else if (choice.equals("ME")) {
            System.out.println("Please Enter Your Morse code: ");
            String userInputME = scanner.nextLine();
            MorseToEnglish meTranslator = new MorseToEnglish();
            String result = meTranslator.translate(userInputME);
            System.out.println(result);
        } else {
            System.out.println("Invalid option. Please enter 'EM' or 'ME'.");
        }
    }
}

