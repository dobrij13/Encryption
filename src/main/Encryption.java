package main;

import java.io.*;
import java.util.Scanner;

public class Encryption {
    public static void getFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой файл шифруем, укажи полный путь к файлу:");
        String pathToFile = scanner.nextLine();
        System.out.println("В какой файл сохраняем зашифрованную информацию, укажи полный путь к файлу:");
        String pathToNewFile = scanner.nextLine();
        System.out.println("Укажите ключ");
        int key = scanner.nextInt();
        Alphabet alphabetClass = new Alphabet();
        char[] charOfAlphabet = alphabetClass.getCharArrayOfAlphabet();

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
                            result[i] = charOfAlphabet[(j + key) % charOfAlphabet.length];
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