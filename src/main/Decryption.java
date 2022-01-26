package main;

import java.io.*;
import java.util.Scanner;

public class Decryption {
    public static void writeText(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой файл расшифровываем, укажи полный путь к файлу:");
        String pathToFile = scanner.nextLine();
        System.out.println("В какой файл сохраняем расшифрованую информацию, укажи полный путь к файлу:");
        String pathToNewFile = scanner.nextLine();
        System.out.println("Укажите ключ");
        int key = scanner.nextInt();

        Alphabet alphabetClass = new Alphabet();
        char[] charOfAlphabet = alphabetClass.getCharArrayOfAlphabet();
        int decKey = charOfAlphabet.length - key;
        try (FileReader in = new FileReader(pathToFile);
             BufferedReader reader = new BufferedReader(in);
             FileWriter out = new FileWriter(pathToNewFile);
             BufferedWriter writer = new BufferedWriter(out);
             PrintWriter p_out = new PrintWriter(writer)) {
            while (reader.ready()) {
                String line = reader.readLine();
                char[] strChars = line.toCharArray();
                char[] result = new char[strChars.length];

                for (int i = 0; i < strChars.length; i++) {
                    char strChar = strChars[i];
                    for (int j = 0; j < charOfAlphabet.length; j++) {
                        char ch = charOfAlphabet[j];
                        if (strChar == ch) {
                            result[i] = charOfAlphabet[(j + decKey) % charOfAlphabet.length];
                        }
                    }
                }
                p_out.println(new String(result));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
