package com.quadient.internship.artur.excercises;

import com.quadient.internship.artur.utils.InputUtils;
import com.quadient.internship.artur.utils.NumberUtils;

public class T05_GuessNumber {
    public static void main(final String[] args) {
        int x = 0;
        int y = NumberUtils.random(1, 101);
        boolean notfound = true;
        while (notfound) {
            for (int t = 10; t >= 0; t--) {
                System.out.println("Schätze die Zahl zwischen 1 und 100: ");
                x = InputUtils.readIntegerInput();

                if (x > y) {
                    System.out.println("Zu Groß!");
                } else if (x < y) {
                    System.out.println("Zu Klein!");
                } else {
                    notfound = !notfound;
                    break;
                }
            }
        }
        System.out.println("Du hast die Zahl " + y + " heraus gefunden.");

    }
}

