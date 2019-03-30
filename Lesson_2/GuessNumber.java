import java.util.Scanner;

public class GuessNumber {
    
    private int computerNumber;
    private Player user1;
    private Player user2;
    private boolean isWin;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player user1, Player user2) {
		this.user1 = user1;
		this.user2 = user2;
	}

    public void gameProcess() {
        isWin = false;
        computerNumber = (int) (Math.random() * 101);
		do {
			inputUserNumber(user1);
			guessingNumber(user1);
			inputUserNumber(user2);
			guessingNumber(user2);
		} while (!isWin);
    }

    public void inputUserNumber(Player player) {
            System.out.println(player.getName() + ", введите число: ");
            player.setNumber(scan.nextInt());

    }

    public void guessingNumber(Player player) {
        if(player.getNumber() == computerNumber) {
            System.out.println(player.getName() + ", вы угадали!");
            isWin = true;
        } else if (player.getNumber() < computerNumber) {
            System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер");
        } else if (player.getNumber() > computerNumber) {
            System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер");
        }
    }
}