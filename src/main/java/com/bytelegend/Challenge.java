package com.bytelegend;

public class Challenge {
    public static int sum = 1000;
    public static void main(String[] args) {
        addAverageOf(9, 11);
        System.out.println("addAverageOf(1,3): " + sum);
        addAverageOf(0, 0);
        System.out.println("addAverageOf(2,6): " + sum);
        addAverageOf(1, 3);
        System.out.println("addAverageOf(3,5): " + sum);
    }
    public static void addAverageOf(int a, int b) {
        int sumInside = a + b;
        int diffSum = sumInside / 2;
        sum = sum + diffSum;
    }
}
