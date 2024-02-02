package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class ProgrammerCalculator implements Operations {
    Scanner in = new Scanner(System.in);

    ///////////////////////////////////////////////////ДАННЫЕ О ВЫБРАННОЙ СИСТЕМЕ СЧИСЛЕНИЯ И ОПЕРАЦИИ//////////////////

    private String NumberSystem;
    private String Operation;

    ///////////////////////////////////////////////////ПРИНТ СИСТЕМЫ СЧИСЛЕНИЯ И ВЫБОР ОПЕРАЦИИ/////////////////////////

    public void numberSystem() {
        print("Выберите систему счисления");
        print("HEX   DEC   OCT   BIN");
        setNumberSystem(in.next());

    }
    public void chosenOperation() {
        print("Выберите операцию: '+', '-', '*', '/', '%', 'СТОП'");
        setOperation(in.next().toUpperCase());
    }

    ///////////////////////////////////////////////////РЕАЛИЗАЦИЯ МЕТОДОВ///////////////////////////////////////////////

    @Override
    public String addition(String a, String b) {
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }

    @Override
    public String subtraction(String a, String b) {
        return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
    }

    @Override
    public String multiplication(String a, String b) {
        return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
    }

    @Override
    public String division(String a, String b) {
        return String.valueOf(Integer.parseInt(a) / Integer.parseInt(b));
    }

    @Override
    public String progdivision(String a, String b) {
        return String.valueOf(Integer.parseInt(a) % Integer.parseInt(b));
    }

    ///////////////////////////////////////////////////ПРЕОБРАЗОВАНИЕ ЧИСЛА В ТИП INT, ЧТОБЫ СЧИТАТЬ////////////////////

    public String convvalue(@NotNull String System, String arg) {
        switch (System) {
            case "HEX" -> {
                return String.valueOf(Integer.parseInt(arg, 16));
            }
            case "OCT" -> {
                return String.valueOf(Integer.parseInt(arg, 8));
            }
            case "BIN" -> {
                return String.valueOf(Integer.parseInt(arg, 2));
            }
            case "DEC" -> {
                return String.valueOf(Integer.parseInt(arg, 10));
            }
        }
        return String.valueOf(0);
    }

    ///////////////////////////////////////////////////ГЕТТЕРЫ И СЕТТЕРЫ////////////////////////////////////////////////

    public String getNumberSystem() {
        return NumberSystem;
    }

    public void setNumberSystem(String numberSystem) {
        numberSystem = numberSystem.toUpperCase();
        if (numberSystem.equals("HEX") || numberSystem.equals("DEC") || numberSystem.equals("OCT") || numberSystem.equals("BIN"))
            this.NumberSystem = numberSystem;
        else {
            print("Ошибка, выбрана несуществующая система счисления, проверьте корректность ввода");
            setNumberSystem(in.next());
        }
    }

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String operation) {
        if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/") || operation.equals("%") || operation.equals("СТОП"))
            this.Operation = operation;
        else {
            print("Ошибка, выбрана несуществующая операция, проверьте корректность ввода");
            setOperation(in.next());
        }
    }

    ///////////////////////////////////////////////////ПРОСТОЙ ПРИНТ////////////////////////////////////////////////////

    public static void print(String str) {
        System.out.println(str);
    }
}

