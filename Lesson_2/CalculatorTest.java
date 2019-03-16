import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "да";
        do {
            Calculator calculatorOne = new Calculator();
            calculatorOne.inputX();
            calculatorOne.inputSign();
            calculatorOne.inputY();
            calculatorOne.calculate();
            System.out.println(calculatorOne.getX() + " " + calculatorOne.getSign() + " " + calculatorOne.getY() + " = " + calculatorOne.getResult());

            Scanner scanAnswer = new Scanner(System.in);
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanAnswer.nextLine();
                switch (answer) {
                    case "да" : System.out.println("Продолжаем!");
                        break;
                    case "нет" : break;   
                }
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
        System.out.println("Жаль (До Встречи!)");
    }
}