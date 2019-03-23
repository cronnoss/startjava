import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner scan = new Scanner(System.in);

        String answer = "да";
        
        while (answer.equals("да")) {
            System.out.print("Введите первое число: ");
            calculatorOne.setX(scan.nextLong());
                while(calculatorOne.getX() <= 0) {
                    System.out.print("Пожалуйста введите целое положительное число: ");
                    calculatorOne.setX(scan.nextLong());
                }
            
            System.out.print("Введите знак математической операции: ");
            calculatorOne.setSign(scan.next());

            System.out.print("Введите второе число: ");
            calculatorOne.setY(scan.nextLong());
            while(calculatorOne.getY() <= 0) {
                System.out.print("Пожалуйста введите целое положительное число: ");
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