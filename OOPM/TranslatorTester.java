package OOPM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TranslatorTest {

    @Test
    void testEnglishToMorse() {
        EnglishToMorse emTranslator = new EnglishToMorse();

        String input = "xyz";
        String expectedOutput = "-..- -.-- --.. "; // Morse code for "xyz"
        String actualOutput = emTranslator.translate(input);

        assertEquals(expectedOutput, actualOutput, "Translation from English to Morse failed.");
    }


    @Test
    void testMorseToEnglish_SingleLetter() {
        MorseToEnglish meTranslator = new MorseToEnglish();

        String input = ".-"; // Morse code for "a"
        String expectedOutput = "a";
        String actualOutput = meTranslator.translate(input);

        assertEquals(expectedOutput, actualOutput, "Single letter translation failed.");
    }

    @Test
    void testMorseToEnglish_LongSentence() {
        MorseToEnglish meTranslator = new MorseToEnglish();

        String input = ".... . .-.. .-.. ---  .-- --- .-. .-.. -.."; // Morse for "hello world"
        String expectedOutput = "hello world";
        String actualOutput = meTranslator.translate(input);

        assertEquals(expectedOutput, actualOutput, "A full sentence in Morse should be translated correctly.");
    }

    @Test
    void testEnglishToMorse_EmptyString() {
        EnglishToMorse emTranslator = new EnglishToMorse();

        String input = "";
        String expectedOutput = ""; // Should return an empty string
        String actualOutput = emTranslator.translate(input);

        assertEquals(expectedOutput, actualOutput, "Empty string should return an empty translation.");
    }

    @Test
    void testMorseToEnglish_EmptyString() {
        MorseToEnglish meTranslator = new MorseToEnglish();

        String input = "";
        String expectedOutput = ""; // Should return an empty string
        String actualOutput = meTranslator.translate(input);

        assertEquals(expectedOutput, actualOutput, "Error! Empty Morse input should return an empty translation.");
    }

    @Test
    void testMorseToEnglish_specialSymbol() {
        EnglishToMorse emTranslator = new EnglishToMorse();

        String input = "?()";
        String expectedOutput = "?()"; // Should return an empty string
        String actualOutput = emTranslator.translate(input);

        assertEquals(expectedOutput, actualOutput, "Error! Translator does not function for special symbols.");
    }

    @Test
    void testMorseToEnglish_nonMorseElement() {
        MorseToEnglish meTranslator = new MorseToEnglish();

        String input = "-----";
        String expectedOutput = " "; // Should return an empty string
        String actualOutput = meTranslator.translate(input);

        assertEquals(expectedOutput, actualOutput, "Error! This combination of '-'' and '.' is not a morse code for any alphabet.");
    }
}
