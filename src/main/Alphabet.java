package main;

public class Alphabet {
    private String russianAlphabetToLowerCase = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private String russianAlphabetToUpperCase = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private String englishAlphabetToLowerCase = "abcdefghijklmnopqrstuvwxyz";
    private String englishAlphabetToUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String numbers = "0123456789";
    private String symbols = ".,”:-—!? ";
    private String strAlphabet = russianAlphabetToLowerCase + russianAlphabetToUpperCase + englishAlphabetToLowerCase + englishAlphabetToUpperCase + numbers + symbols;
    private char[] charArrayOfAlphabet = strAlphabet.toCharArray();

    public char[] getCharArrayOfAlphabet() {
        return charArrayOfAlphabet;
    }
}
