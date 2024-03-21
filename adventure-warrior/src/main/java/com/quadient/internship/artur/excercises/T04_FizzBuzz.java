package com.quadient.internship.artur.excercises;

import com.quadient.internship.artur.utils.InputUtils;

public class T04_FizzBuzz {
    public static void main(final String[] args) {
        System.out.println("Wähle die Maximal Zahl!: ");
        int x = InputUtils.readIntegerInput();
        for (int y = 1; y <= x; y++) {
            if (y % 3 == 0) {
                if (y % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (y % 5 == 0) {
                if (y % 3 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Buzz");
                }
            } else if (y % 3 != 0) {
                System.out.println(y);
            } else if (y % 5 != 0) {
                System.out.println(y);
            }


        }

        /* Ein Maximalzahl N von der Konsole einlesen und zeilenweise die Zahlen von 1 bis N ausgeben, es sei denn:

        - Die jeweilige Zahl ist durch 3 teilbar, dann soll "Fizz" stattdessen ausgeben werden
        - Die Zahl ist durch 5 teilbar, dann "Buzz"
        - Die Zahl ist durch 3 und 5 teilbar, dann "FizzBuzz"

        z. B.:

        Eingabe: 15
        Ausgabe: 1
                 2
                 Fizz
                 4
                 Buzz
                 Fizz
                 7
                 8
                 Fizz
                 Buzz
                 11
                 Fizz
                 13
                 14
                 FizzBuzz */
    }
}
