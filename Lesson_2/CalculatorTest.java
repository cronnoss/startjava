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

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                Scanner scanAnswer = new Scanner(System.in);
                answer = scanAnswer.nextLine();
                switch (answer) {
                    case "да" : answer = "да";
                        System.out.println("Продолжаем!");
                        break;
                    case "нет" : answer = "нет";
                        System.out.println("Жаль (До Встречи!)");
                        break;
                    default : 
                        break;   
                }
            } while (answer != "да" & answer != "нет");
        } while (answer == "да");
    }
}