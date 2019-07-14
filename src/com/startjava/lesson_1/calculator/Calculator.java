/*TODO: Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми положительными числами:
- для проверки знака математической операции воспользуйтесь оператором if else
- выведите на экран результат работы калькулятора с помощью System.out.println()
*/
package com.startjava.lesson_1.calculator;

public class Calculator {

    public static void main(String[] args) {
        long x = 2;
        long y = 4;
        String operation = "+";
        long result = 0;
        if(x > 0 && y > 0) {
            if(operation == "+") {
                result = x + y;
            } else if (operation == "-") {
                result = x - y;
            } else if (operation == "*") {
                result = x * y;
            } else if (operation == "/") {
                result = x / y;
            } else if (operation == "^") {
                result = 1;
                for(int i = 1; i <= y; i++){
                    result *= x; //Возведение в степень
                }
            } else if (operation == "%") {
                result = x % y;
            }
            System.out.println(x + " " + operation + " " + y + " = " + result);        
        } else {
            System.out.println("Калькулятор выполняет математические операции над целыми положительными числами. Пожалуйста введите положительное число.");
        }
    }
}