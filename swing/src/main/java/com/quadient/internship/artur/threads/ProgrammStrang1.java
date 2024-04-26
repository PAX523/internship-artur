package com.quadient.internship.artur.threads;

public class ProgrammStrang1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            System.out.println("Strang1: " + i);
        }
        System.out.println("Strang2:v ");
    }
}
