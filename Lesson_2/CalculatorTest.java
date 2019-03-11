import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {

        boolean done = false;
        do {
            Calculator calculatorOne = new Calculator();

            calculatorOne.inputX();

            calculatorOne.inputSign();

            boolean enterCorrectAnswerYesOrNo = false;
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                Scanner scanAnswer = new Scanner(System.in);
                String answer = scanAnswer.nextLine();
                    if(answer.equals("да")) {
                        System.out.println("Продолжаем!");
                        done = false;
                        enterCorrectAnswerYesOrNo = true;
                    } else if (answer.equals("нет")) {
                        System.out.println("Жаль (До Встречи!)");
                        done = true;
                        enterCorrectAnswerYesOrNo = true;
                    }
            } while (!enterCorrectAnswerYesOrNo);
        } while (!done);
    }
}
