//TODO: Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми положительными числами:
/* - выведите на экран результат работы калькулятора с помощью System.out.println()
Модифицируйте программу Калькулятор:
реализуйте дополнительный класс CalculatorTest
для проверки знака математической операции воспользуйтесь оператором switch
формат ввода математического выражения:
Введите первое число: 2
Введите знак математической операции: ^
Введите второе число: 10
Для ввода данных в Калькуляторе используйте клавиатуру (класс Scanner)
Для завершения или продолжения работы программ Калькулятор выводите сообщение: "Хотите продолжить? [да/нет]: "
Если пользователь ввел ни "да" ни "нет", а что-то другое — снова выведите сообщение: "Хотите продолжить? [да/нет]: "
*/
package com.startjava.lesson_2_3.calculator;

public class Calculator {

    // поля:
    private long x;
    private String sign;
    private long y; 
    private long result;

    // сеттеры  для доступа к полям :
    public void setX(long x) {
        this.x = x;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setY(long y) {
        this.y = y;
    }

    // методы:
    public void calculate() {
        switch (sign) {
            case "+" : 
                System.out.println(x + y);
                break;
            case "-" : 
                System.out.println(x - y);
                break;
            case "*" : 
                System.out.println(x * y);
                break;
            case "/" : 
                System.out.println((double)x / y);
                break; 
            case "^" : 
                result = 1;
                for(long i = 1; i <= y; i++) {
                    result *= x;
                }
                System.out.println(result);
                break;
            case "%" : 
                System.out.println(x % y);
                break;
            default : System.out.println("Некорректный знак математической операции! ");
                break;
        }
    }    
}