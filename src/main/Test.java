package main;

import java.util.Scanner;

public class Test {
    public static void getTest() {
        Scanner scanner = new Scanner(System.in);
        Alphabet alphabetClass = new Alphabet();
        char[] charOfAlphabet = alphabetClass.getCharArrayOfAlphabet();
//        String alphabet = "абвгдежзийклмнопрстуфхцчшщъыьэюя., ";
        char[] charsAlphabet = charOfAlphabet;
        String str = "привет, как дела.\n ты приехал.";
//        String str =   "щътмпьийфкфйопхкзйьвйщътпякхз";
        char[] strChars = str.toCharArray();
        char[] result = new char[strChars.length];

        int keyA = 10;
        int keyB = charsAlphabet.length - keyA;
        for (int i = 0; i < strChars.length; i++) {
            char strChar = strChars[i];
            for (int j = 0; j < charsAlphabet.length; j++) {
                char ch = charsAlphabet[j];
                if (strChar == ch) {
                    result[i] = charsAlphabet[(j + keyA) % charsAlphabet.length];
                }
            }
        }

        System.out.println(new String(result));
    }
}
