package org.example;

import java.util.Scanner;

public class Argument extends Number {
    Scanner in = new Scanner(System.in);

    ///////////////////////////////////////////////////РЧНОЙ ВООД ЧИСЛА/////////////////////////////////////////////////

    public void enterManually() {
        System.out.println("Введите число");
        setvalue(in.next());
    }

}
