package OOPM;

public class EnglishToMorse {
    private final char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public String translate(String input) {
        String strEM = "";
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < english.length; j++) {
                if (english[j] == chars[i]) {
                    strEM = strEM + morse[j] + " ";

                    break;
                }
            }
           //System.out.println(strEM);
        }
        return strEM;
    }
}