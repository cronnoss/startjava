//TODO: Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми положительными числами:
/*- выведите на экран результат работы калькулятора с помощью System.out.println()
Модифицируйте программу Калькулятор, используя для хранения значений математического выражения массивы:
- воспользуйтесь методами класса Math, какие только сможете найти, заменив ими ваши реализации, связанные с вычислениями
- для разбиения математического выражения на составляющие и сохранения их в массив, используйте метод String.split();
Формат ввода математического выражения для программы Калькулятор (пример):
- Введите математическое выражение: 2 ^ 10
Для преобразования аргументов математического выражения из типа String в int используйте метод Integer.parseInt
*/
package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    // поля:
    private long x;
    private String sign;
    private long y;
    private String mathExpression;

    // сеттеры  для доступа к полям :
    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    // методы:
    public void stringSplit() {
        String[] parts = mathExpression.split(" ");
        x = Integer.parseInt(parts[0]);
        sign = parts[1];
        y = Integer.parseInt(parts[2]);
    }

    public void calculate() {
        switch (sign) {
            case "+":
                System.out.println(Math.addExact(x, y));
                break;
            case "-":
                System.out.println(Math.subtractExact(x, y));
                break;
            case "*":
                System.out.println(Math.multiplyExact(x, y));
                break;
            case "/":
                System.out.println((double) x / y);
                break;
            case "^":
                System.out.println(Math.pow(x, y));
                break;
            case "%":
                System.out.println(Math.floorMod(x, y));
                break;
            default:
                System.out.println("Некорректное математическое выражение! ");
                break;
        }
    }
}