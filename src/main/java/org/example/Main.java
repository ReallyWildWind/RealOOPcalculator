package org.example;

public class Main {
    public static void main(String[] args) {
        Argument arg1 = new Argument();
        Argument arg2 = new Argument();
        Result result = new Result();
        ProgrammerCalculator calculator = new ProgrammerCalculator();

        ///////////////////////////////////////////////////НАЧАЛО РАБОТЫ////////////////////////////////////////////////

        calculator.numberSystem();
        arg1.enterManually();
        arg1.setvalue(calculator.convvalue(calculator.getNumberSystem(), arg1.getvalue()));
        label:
        while (true) {
            calculator.chosenOperation();
            switch (calculator.getOperation()) {
                case "СТОП" -> {
                    break label;
                }
                case "" -> {
                    return;
                }
                default -> {
                    arg2.enterManually();
                    arg2.setvalue(calculator.convvalue(calculator.getNumberSystem(), arg2.getvalue()));
                    switch (calculator.getOperation()) {
                        case "+" -> {
                            result.setvalue(calculator.addition(arg1.getvalue(), arg2.getvalue()));
                        }
                        case "-" -> {
                            result.setvalue(calculator.subtraction(arg1.getvalue(), arg2.getvalue()));
                        }
                        case "*" -> {
                            result.setvalue(calculator.multiplication(arg1.getvalue(), arg2.getvalue()));
                        }
                        case "/" -> {
                            result.setvalue(calculator.division(arg1.getvalue(), arg2.getvalue()));
                        }
                        case "%" -> {
                            result.setvalue(calculator.progdivision(arg1.getvalue(), arg2.getvalue()));
                        }
                    }
                    arg1.setvalue(result.getvalue());
                }
            }
        }
    }
}