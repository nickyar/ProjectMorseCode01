//package OOPM;
//
//public class TranslatorMorse01 {
//
//    public static void main(String[] args) {
//
//
//        boolean EM = false;
//        //Scanner keyboard = new Scanner(System.in);
//
//        System.out.println(" Translator: Morse Code-English");
//        System.out.println(" Do you want EM or ME ? ");
//
//        //
//
//        // Convert English to Morse
//        if (EM) {
//            String userInputEM = "xyz".toLowerCase();
//
//            char[] chars = userInputEM.toCharArray();
//
//            //English to Morse
//            String strEM = "";
//            for (int i = 0; i < chars.length; i++) {
//                for (int j = 0; j < english.length; j++) {
//
//                    if (english[j] == chars[i]) {
//                        strEM = strEM + morse[j] + " ";
//                        System.out.println(strEM);
//                        break;
//                    }
//                }
//            }
//
//        } else if (!EM) {
//            // Convert Morse to English
////            String userInputME = scanner.nextLine();
//
//            String userInputME = "-.-- --.. . . ..-.";
//            String[] morseLetter = userInputME.split(" ");
//            //String[] chars = morseLetter;
//
////            String strME = "";
//            // Using StringBuilder for efficient string concatenation
//            StringBuilder strME = new StringBuilder();
//
//            for (int i = 0; i < morseLetter.length; i++) {
//                for (int j = 0; j < morse.length; j++) {
//
//                    if (morse[j].equals(morseLetter[i])) {
//                        //strME = strME + english[j] + " ";
//                        strME=strME.append(english[j]);
//                        break;
//                    }
//                }
//            }
//            System.out.println(strME.toString());
//        }
//    }
//}