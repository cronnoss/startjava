import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answer = "да";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Игра " + "'Угадай число'. " + "Два игрока по очереди угадывают число, загаданное компьютером.");
            boolean win = false;

            GuessNumber game = new GuessNumber(0);
            game.computerNumber();

            Player user1 = new Player("");
            System.out.print("Введите имя первого игрока: ");
            user1.setName(scan.next());
            
            Player user2 = new Player("");
            System.out.print("Введите имя второго игрока: ");
            user2.setName(scan.next());

            do {
                System.out.println("Введите число: ");
                game.setNumber(scan.nextInt());
                game.number();
                game.setNumber(scan.nextInt());
                game.number();
                if(game.isWin()) {
                    win = true;
                }
            } while (!win);

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
        System.out.println("Жаль (До Встречи!)");
    }
}