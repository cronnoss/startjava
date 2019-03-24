import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "да";
        long tempVariable;
        System.out.println("Калькулятор выполняет математические операции (+, -, *, /, ^, %) над целыми положительными числами.");
        Scanner scan = new Scanner(System.in);
        
        do {
            Calculator calculatorOne = new Calculator();

            do {
                System.out.print("Введите первое число: ");
                tempVariable = scan.nextLong();
                if (tempVariable >= 0) {
                    calculatorOne.setX(tempVariable);    
                }
            } while (tempVariable < 0);
            
            System.out.print("Введите знак математической операции: ");
            calculatorOne.setSign(scan.next());

            do {
                System.out.print("Введите второе число: ");
                calculatorOne.setY(scan.nextLong());
            } while (calculatorOne.getY() < 0);

            calculatorOne.calculate();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
        System.out.println("Жаль (До Встречи!)");
    }
}