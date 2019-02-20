public class GuessNumber{
    public static void main(String[] args) {
        /*TODO:Напишите игру Угадай число:
        - компьютер "загадывает" целое число от 0 до 100, которое вам необходимо угадать
        - после каждой неудачной попытки выводите подсказки: System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер")
        - если число угадано — System.out.println("Вы угадали!")
        - игра продолжается до тех пор, пока число не будет угадано
        */
        int x = 17;// Это число "загадал" компьютер
        int InputFigure = 21;
        int chislo = InputFigure;
        if(chislo > 0){
            if(chislo <= 100){
                if(chislo < x){
                    for(chislo = InputFigure; chislo < x; chislo++){
                        System.out.println("Введенное вами число " + chislo + " меньше того, что загадал компьютер");
                    }
                }
                if(chislo > x){
                    for(chislo = InputFigure; chislo > x; chislo--){
                        System.out.println("Введенное вами число " + chislo + " больше того, что загадал компьютер");
                    }
                }
                if(chislo == x){
                    System.out.println("Вы угадали! Введенное вами число: " + chislo + " совпадает с числом, которое загадал компьютер");
                }
            }else{
                System.out.println("Игра 'Угадай число' загадывает числа в диапазоне от 0 до 100. Пожалуйста введите число в этом диапазоне.");
            }
        }else{
            System.out.println("Игра 'Угадай число' загадывает числа в диапазоне от 0 до 100. Пожалуйста введите число в этом диапазоне.");
        }
    }  
}
