package com.ZadachiJavaRush.Course_16;
/*
1. Разберись, что делает программа.
2. Реализуй логику метода printTikTak:
2.1. Через первые полсекунды должна выводиться в консоль фраза: Tik
2.2. Через вторые полсекунды должна выводиться в консоль фраза: Tak
 */

public class Solution_11 {
    public static volatile boolean isStopped = false;
    public void javaRush() throws Exception {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        clock.join();
        System.out.println("The clock has to be stopped");

        Thread.sleep(2000);
        System.out.println("Double-check");

    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTikTak() throws InterruptedException {
            //add your code here - добавь код тут
            do {
                System.out.println("Tik");
                Thread.sleep(500);
                System.out.println("Tak");
                Thread.sleep(500);
            }
            while (!isStopped);
        }
    }
}