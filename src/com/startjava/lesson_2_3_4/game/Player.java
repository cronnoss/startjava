package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] nums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber(int attemptNumber) {
        return nums[attemptNumber - 1];
    }

    public void setNumber(int attemptNumber, int number) {
        this.nums[attemptNumber - 1] = number;
    }

    public int[] getNums(int attemptNumber) {
        return Arrays.copyOf(nums, attemptNumber);
    }

    public void zeroingArray(int attemptNumber) {
        Arrays.fill(nums, 0, attemptNumber - 1, 0);
    }
}