import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Калькулятор выполняет математические операции (+, -, *, /, ^, %) над целыми положительными числами.");
        Scanner scan = new Scanner(System.in);
        String answer = "да";
        
        while(answer.equals("да")) {
            Calculator calculatorOne = new Calculator();

            while(calculatorOne.getX() <= 0) {
                System.out.print("Введите первое число: ");
                calculatorOne.setX(scan.nextLong());
            }
            
            System.out.print("Введите знак математической операции: ");
            calculatorOne.setSign(scan.next());

            while(calculatorOne.getY() <= 0) {
                System.out.print("Введите второе число: ");
                calculatorOne.setY(scan.nextLong());
            }

            calculatorOne.calculate();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
        System.out.println("Жаль (До Встречи!)");
    }
}