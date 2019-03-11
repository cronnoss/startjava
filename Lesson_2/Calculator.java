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
    private long x = 0;
    private String sign = "";
    private long y = 0; 
    private long result = 0;

    // методы:
    public void inputX() {
        System.out.print("Введите первое число: ");
        Scanner scanX = new Scanner(System.in);
        x = scanX.nextLong();
            if(x <= 0) {
                System.out.print("Калькулятор выполняет математические операции над целыми положительными числами. Пожалуйста введите положительное число: ");
                x = scanX.nextLong();
            }
        }

    public void inputSign() {
        while(sign == "") {
            System.out.print("Введите знак математической операции: ");
            Scanner scanOperation = new Scanner(System.in);
            String operation = scanOperation.nextLine();

            switch (operation) {
                case "+" :  sign = "+";
                            inputY();
                            result = x + y;
                            showResult();
                            break;
                case "-" :  sign = "-";
                            inputY();
                            result = x - y;
                            showResult();
                            break;
                case "*":   sign = "*";
                            inputY();
                            result = x * y;
                            showResult();
                            break;
                case "/":   sign = "/";
                            inputY();
                            result = x / y;
                            showResult();
                            break; 
                case "^":   sign = "^";
                            result = 1;
                            inputY();
                            for(int i = 1; i <= y; i++){
                                result *= x; //Возведение в степень
                            }
                            showResult();
                            break;
                case "%":   sign = "%";
                            inputY();
                            result = x % y;
                            showResult();
                            break;
                default:    System.out.println("Введите одну из следующих математических операции: +, -, *, /, ^, % ");
                            break; 
            }
        }
    }

    public void inputY() {
    System.out.print("Введите второе число: ");
    Scanner scanY = new Scanner(System.in);
    y = scanY.nextLong();
    if(y <= 0) {
        System.out.print("Калькулятор выполняет математические операции над целыми положительными числами. Пожалуйста введите положительное число: ");
        y = scanY.nextLong();
        }
    }

    public void showResult() {
        System.out.println(x + " " + sign + " " + y + " = " + result);
    } 
}
