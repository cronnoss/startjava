public class GuessNumber {
    
    int computerNumber;
    int number;

    public GuessNumber(int computerNumber) {
        this.computerNumber = computerNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void computerNumber() {
        computerNumber = (int) (Math.random() * 101);
    }

    public void number() {
        if(number < computerNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else if (number > computerNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        }
    }

    public boolean isWin() {
        if(number == computerNumber) {
            System.out.println("Вы угадали!");
            return true;
        } else {
            return false;
        }
    }
}