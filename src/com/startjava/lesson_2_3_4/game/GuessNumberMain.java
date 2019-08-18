package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberMain {

    public static void main(String[] args) {
        String answer;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Computer made up a number. Try to find it. \nThis game needs two players. \nYou have 10 attempts to guess the number in the game!");

            System.out.print("Enter first player name: ");
            Player user1 = new Player(scan.next());

            System.out.print("Enter second player name: ");
            Player user2 = new Player(scan.next());

            GuessNumber game = new GuessNumber(user1, user2);

            game.startGame();

            do {
                System.out.print("Do you want to continue? [y/n]: ");
                answer = scan.next();
            } while (!answer.equals("y") && !answer.equals("n"));
        } while (answer.equals("y"));
        System.out.println("Bye! See you!");
    }
}