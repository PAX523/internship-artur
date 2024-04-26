package com.quadient.internship.artur.threads;

public class ThreadsMain {
    public static void main(final String[] args) {
        Runnable ps1 = new ProgrammStrang1();
        ProgrammStrang2 ps2 = new ProgrammStrang2();
        Thread thread1 = new Thread(ps1);
        Thread thread2 = new Thread(ps2);

        thread1.setDaemon(false);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();
    }
}

