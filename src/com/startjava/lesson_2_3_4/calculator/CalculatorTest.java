package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "да";
        String tempVariable;
        int space;
        System.out.println("Калькулятор выполняет математические операции (+, -, *, /, ^, %) над целыми положительными числами.");
        Scanner scan = new Scanner(System.in);

        do {
            Calculator calculatorOne = new Calculator();

            do {
                System.out.print("Введите математическое выражение, (например) 2 ^ 10 : ");
                tempVariable = scan.nextLine();
                space = 0;
                for (int i = 0; i < tempVariable.length(); i++) {
                    if (tempVariable.charAt(i) == ' ') {
                        space++;
                    }
                }
            } while (space != 2);
            calculatorOne.setMathExpression(tempVariable);

            calculatorOne.stringSplit();

            calculatorOne.calculate();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
        System.out.println("Жаль (До Встречи!)");
    }
}