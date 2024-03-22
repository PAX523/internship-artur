package com.quadient.internship.artur.excercises;

import com.quadient.internship.artur.utils.InputUtils;

public class T06_Palindrome {
    public static void main(final String[] args) {

        System.out.println("Der PC findet heraus ob dein Wort ein Palindrom ist!!!: ");
        String x = InputUtils.readInput().toLowerCase();
        for (int y = 0, c = x.length() - 1; y <= x.length() - 1; y++, c--) {
            if (x.charAt(y) != x.charAt(c)) {
                System.out.println("Dein Wort ist kein Palindrom!");
                break;
            }
            if (y >= c) {
                System.out.println("Dein Wort ist ein Palindrom!");
                break;
            }
        }


        /* Ein Palindrom ist ein Wort, das sowohl vorwärts, als auch rückwärts gelesen, gleich gesprochen wird. Z. B.:

           Level
           Neffen
           Otto
           Rentner

           Das Programm soll ein Wort einlesen und herausfinden, ob es ein Palindrom ist, oder nicht. */
    }
}
