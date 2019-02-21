/*TODO:Напишите игру Угадай число:
- компьютер "загадывает" целое число от 0 до 100, которое вам необходимо угадать
- после каждой неудачной попытки выводите подсказки: System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер")
- если число угадано — System.out.println("Вы угадали!")
- игра продолжается до тех пор, пока число не будет угадано
*/
public class GuessNumber {
    public static void main(String[] args) {

        int computerNumber = 23;
        int userNumber = 17;
        if(userNumber >= 0 && userNumber <= 100) {
            while(userNumber <= computerNumber || userNumber >= computerNumber) {
                if(userNumber < computerNumber) {
                    System.out.println("Введенное вами число " + userNumber + " меньше того, что загадал компьютер");
                    userNumber += 1;
                } else if(userNumber > computerNumber) {
                    System.out.println("Введенное вами число " + userNumber + " больше того, что загадал компьютер");
                    userNumber -= 1;
                } else {
                    System.out.println("Вы угадали! Введенное вами число: " + userNumber + " совпадает с числом, которое загадал компьютер");
                    break;
                }
            }
        } else {
            System.out.println("Игра 'Угадай число' загадывает числа в диапазоне от 0 до 100. Пожалуйста введите число в этом диапазоне.");
        }
    }  
}