package com.startjava.lesson_2_3_4.game;

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

    public void startGame() {
        isWin = false;
        computerNumber = (int) (Math.random() * 101);
        do {
            inputUserNumber(user1);
            guessNumber(user1);
            inputUserNumber(user2);
            guessNumber(user2);
        } while (!isWin);
    }

    private void inputUserNumber(Player player) {
        System.out.println(player.getName() + ", введите число: ");
        player.setNumber(scan.nextInt());
    }

    private void guessNumber(Player player) {
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