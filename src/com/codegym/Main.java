package com.codegym;

public class Main {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long sum = 0;
        stopWatch.start();
        for (int i = 0; i < 999999999; i++) {
            for (int j = 0; j < 999999999; j++) {
                sum += i + j;
            }

        }
        stopWatch.stop();
        System.out.println("Thời gian chạy của chương trình là " + stopWatch.getElapsedTime() + " ms");
    }
}
