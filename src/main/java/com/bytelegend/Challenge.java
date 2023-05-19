package com.bytelegend;

public class Challenge {
    public static int addAvg = 0;

    public static void main(String[] args) {
        addAverageOf(1, 3);
        System.out.println("addAverageOf(1,3): " + addAvg);
        addAverageOf(2, 6);
        System.out.println("addAverageOf(2,6): " + addAvg);
        addAverageOf(3, 5);
        System.out.println("addAverageOf(3,5): " + addAvg);
    }

    public static void addAverageOf(int a, int b) {
        int sum = a + b;
        addAvg += sum / 2;
    }
}
