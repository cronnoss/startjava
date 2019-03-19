/*TODO: Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми положительными числами:
- выведите на экран результат работы калькулятора с помощью System.out.println()
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
import java.util.Scanner;

public class Calculator {

    // поля:
    private long x;
    private String sign;
    private long y; 
    private long result;

    // геттеры и сеттеры  для доступа к полям :
    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public String getSign() {
        return sign;
    } 

    public void setSign(String sign) {
        this.sign = sign;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }


    // методы:
    public void inputX() {
    }

    public void inputY() {
    }

    public void calculate() {
    }
}