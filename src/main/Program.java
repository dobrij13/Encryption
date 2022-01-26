package main;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Program start
        System.out.println("Что ты хочешь сделать, выбери номер\n" +
                "1. Закодировать файл\n" +
                "2. Расшифровать файл\n" +
                "3. Криптоанализ файла перебором\n" +
                "4. Криптоанализ файла на основе статистических данных\n" +
                "Для выхода из программы напиши \"exit\" или \"выход\"");


        // Choose the  program
        Scanner scanner = new Scanner(System.in);
        String numberOfTask = scanner.nextLine();
        while (true) {
            if (numberOfTask.equals("1")) {
                Encryption.getFile();
                break;
            } else if (numberOfTask.equals("2")) {
                Decryption.writeText();
                break;
            } else if (numberOfTask.equals("3")) {
                CryptanalysisBruteForce.writeText();
                break;
            } else if (numberOfTask.equals("4")) {
                CryptanalysisStatisticalData.writeText();
                break;
            } else if (numberOfTask.equals("5")) {
                Test.getTest();
                break;
            } else if (numberOfTask.equalsIgnoreCase("exit") || numberOfTask.equalsIgnoreCase("выход")) {
                break;
            } else {
                break;
            }
        }
        System.out.println("Задача выполнена");
    }
}
