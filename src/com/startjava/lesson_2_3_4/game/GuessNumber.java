package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private int computerNumber;
    private Player user1;
    private Player user2;
    private boolean isWin;
    private Scanner scan = new Scanner(System.in);
    private int attemptNumber;

    public GuessNumber(Player user1, Player user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    public void initStart() {
        isWin = false;
        computerNumber = (int) (Math.random() * 101);
        attemptNumber = 1;
    }

    public void startGame() {
        initStart();
        while (attemptNumber <= 10 && !isWin) {
            inputUserNumber(user1);
            compareNumbers(user1);
            inputUserNumber(user2);
            compareNumbers(user2);
            attemptNumber++;
        }
    }

    private void inputUserNumber(Player player) {
        int number;
        do {
            number = enterNumber(player);
        } while (!isValidNumber(player, number));
        player.setNumber(attemptNumber, number);
    }

    private int enterNumber(Player player) {
        System.out.print("\n" + player.getName() + ", it's your " + attemptNumber + " attempt, enter your number: ");
        return scan.nextInt();
    }

    private boolean isValidNumber(Player player, int number) {
        if (number < 0 || number > 100) {
            System.out.println(player.getName() + ", you entered incorrect number. It must be from 0 to 100");
            return false;
        }
        return true;
    }

    private void compareNumbers(Player player) {
        if (player.getNumber(attemptNumber) > computerNumber && attemptNumber != 10) {
            System.out.println("Entered number is more than hidden.");
        } else if (player.getNumber(attemptNumber) < computerNumber && attemptNumber != 10) {
            System.out.println("Entered number is less than hidden.");
        } else if (attemptNumber == 10 && player.getNumber(attemptNumber) != computerNumber) {
            System.out.println(player.getName() + " ended up trying.");
            printAllAttempts(player);
            zeroingArray(player);
        } else if (player.getNumber(attemptNumber) == computerNumber) {
            System.out.println("You win!! " + player.getName() + " guessed the number " + player.getNumber(attemptNumber) + " with " + attemptNumber + " attempt.\n");
            isWin = true;
            zeroingArray(player);
        }
    }

    private void printAllAttempts(Player player) {
        int[] numbers = player.getNums(attemptNumber);
        System.out.println("\n" + player.getName() + " entered these numbers: ");
        System.out.println(Arrays.toString(numbers));
    }

    private void zeroingArray(Player player) {
        player.zeroingArray(attemptNumber);
    }
}