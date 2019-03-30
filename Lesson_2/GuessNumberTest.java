import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answer = "да";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Введите имя первого игрока: ");
            Player user1 = new Player(scan.next());

            System.out.print("Введите имя второго игрока: ");
            Player user2 = new Player(scan.next());

            GuessNumber game = new GuessNumber(user1, user2);
            
            game.gameProcess();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
        System.out.println("Жаль (До Встречи!)");
    }
}