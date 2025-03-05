package cz.cvut.fel.pjv.impl;

import cz.cvut.fel.pjv.Lab01;
import java.util.Locale;
import java.util.Scanner;

public class Lab01Impl implements Lab01 {
    @Override
    public void homework() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Set locale to US for correct parsing of decimal numbers

        while (true) {
            System.out.println("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Chybna volba!");
                continue;
            }
            int operation = scanner.nextInt();

            if (operation < 1 || operation > 4) {
                System.out.println("Chybna volba!");
                continue;
            }

            String firstOperandLabel = "";
            String secondOperandLabel = "";
            String operator = "";

            switch (operation) {
                case 1:
                    firstOperandLabel = "Zadej scitanec: ";
                    secondOperandLabel = "Zadej scitanec: ";
                    operator = " + ";
                    break;
                case 2:
                    firstOperandLabel = "Zadej mensenec: ";
                    secondOperandLabel = "Zadej mensitel: ";
                    operator = " - ";
                    break;
                case 3:
                    firstOperandLabel = "Zadej cinitel: ";
                    secondOperandLabel = "Zadej cinitel: ";
                    operator = " * ";
                    break;
                case 4:
                    firstOperandLabel = "Zadej delenec: ";
                    secondOperandLabel = "Zadej delitel: ";
                    operator = " / ";
                    break;
            }

            System.out.print(firstOperandLabel);
            if (!scanner.hasNextDouble()) {
                scanner.next();
                System.out.println("Chybny vstup!");
                continue;
            }
            double operand1 = scanner.nextDouble();

            System.out.print(secondOperandLabel);
            if (!scanner.hasNextDouble()) {
                scanner.next();
                System.out.println("Chybny vstup!");
                continue;
            }
            double operand2 = scanner.nextDouble();

            if (operation == 4 && operand2 == 0) {
                System.out.println("Pokus o deleni nulou!");
                continue;
            }

            System.out.print("Zadej pocet desetinnych mist: ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Chyba - musi byt zadane kladne cislo!");
                continue;
            }
            int decimalPlaces = scanner.nextInt();

            if (decimalPlaces < 0) {
                System.out.println("Chyba - musi byt zadane kladne cislo!");
                continue;
            }

            double result = 0;
            switch (operation) {
                case 1: result = operand1 + operand2; break;
                case 2: result = operand1 - operand2; break;
                case 3: result = operand1 * operand2; break;
                case 4: result = operand1 / operand2; break;
            }

            String format = "%." + decimalPlaces + "f";
            System.out.printf((format + operator + format + " = " + format + "\n"), operand1, operand2, result);
        }
    }
}
