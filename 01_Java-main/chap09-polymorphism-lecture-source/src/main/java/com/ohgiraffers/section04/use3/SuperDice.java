package com.ohgiraffers.section04.use3;

import java.util.Random;

public class SuperDice implements Dice {

    private int min;
    private int max;

    Random random1 = new Random();

    public SuperDice() {
        this.min = 1;
        this.max = 10;
    }

    @Override
    public int getNumber() {
        int num = (int) (Math.random() * max) + min;
        return num;
        // return (int) (Math.random() * (max -min + 1)) + min;

    }
}
