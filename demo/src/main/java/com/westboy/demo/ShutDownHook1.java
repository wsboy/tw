package com.westboy.demo;

public class ShutDownHook1 extends Thread {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new ShutDownHook1());
        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i);
            if (i == 4) {
                System.exit(0);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        System.out.println("hook shutdown!");
    }
}
