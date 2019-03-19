import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "да";
        do {
            Calculator calculatorOne = new Calculator();
            
            calculatorOne.inputX();
            System.out.print("Введите первое число: ");
            Scanner scanX = new Scanner(System.in);
            calculatorOne.setX(scanX.nextLong());
                while(calculatorOne.getX() <= 0) {
                    System.out.print("Калькулятор выполняет математические операции над целыми положительными числами. Пожалуйста введите положительное число: ");
                    calculatorOne.setX(scanX.nextLong());
                }

            calculatorOne.calculate();
            do {
                System.out.print("Введите знак математической операции: ");
                Scanner scanSign = new Scanner(System.in);
                calculatorOne.setSign(scanSign.nextLine());
    
                calculatorOne.inputY();
                System.out.print("Введите второе число: ");
                Scanner scanY = new Scanner(System.in);
                calculatorOne.setY(scanY.nextLong());
                while(calculatorOne.getY() <= 0) {
                    System.out.print("Калькулятор выполняет математические операции над целыми положительными числами. Пожалуйста введите положительное число: ");
                    calculatorOne.setY(scanY.nextLong());
                    }

                switch (calculatorOne.getSign()) {
                    case "+" : 
                        calculatorOne.setResult(calculatorOne.getX() + calculatorOne.getY());
                        break;
                    case "-" : 
                        calculatorOne.setResult(calculatorOne.getX() - calculatorOne.getY());
                        break;
                    case "*" : 
                        calculatorOne.setResult(calculatorOne.getX() * calculatorOne.getY());
                        break;
                    case "/" : 
                        calculatorOne.setResult(calculatorOne.getX() / calculatorOne.getY());
                        break; 
                    case "^" : 
                        calculatorOne.setResult(1);
                        for(long i = 1; i <= calculatorOne.getY(); i++) {
                            calculatorOne.setResult(calculatorOne.getResult() * calculatorOne.getX());
                        }
                        break;
                    case "%" : 
                        calculatorOne.setResult(calculatorOne.getX() % calculatorOne.getY());
                        break;
                    default : System.out.println("Введите одну из следующих математических операции: +, -, *, /, ^, % ");
                        break;
                }
            } while(!calculatorOne.getSign().equals("+") && !calculatorOne.getSign().equals("-") && !calculatorOne.getSign().equals("*") && !calculatorOne.getSign().equals("/") && !calculatorOne.getSign().equals("^") && !calculatorOne.getSign().equals("%"));

            System.out.println(calculatorOne.getX() + " " + calculatorOne.getSign() + " " + calculatorOne.getY() + " = " + calculatorOne.getResult());

            Scanner scanAnswer = new Scanner(System.in);
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanAnswer.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
        System.out.println("Жаль (До Встречи!)");
    }
}