package OOPM;

public class MorseToEnglish {
    private final char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public String translate(String input) {
        String[] morseLetter = input.split(" ");
        StringBuilder strME = new StringBuilder();

        for (int i = 0; i < morseLetter.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (morse[j].equals(morseLetter[i])) {
                     strME.append(english[j]);
                    break;
                }
            }
        }
        return strME.toString();
    }
}