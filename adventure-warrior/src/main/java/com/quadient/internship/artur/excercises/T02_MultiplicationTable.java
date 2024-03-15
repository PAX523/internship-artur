package com.quadient.internship.artur.excercises;


import com.quadient.internship.artur.utils.InputUtils;

public class T02_MultiplicationTable {
    public static void main(final String[] args) {
        System.out.println("Nenne mir eine Zahl ich gehe dan ihre Reihe durch:");
        int eingabe = InputUtils.readIntegerInput();
        int multiplikator = 1;
        while (multiplikator <= 10) {
            System.out.println(eingabe + " x " + multiplikator + " = " + (eingabe * multiplikator));
            multiplikator++;
        }

        /* Eine Zahl von der Konsole einlesen und die Multiplikationstabelle bis 10 für diese Zahl ausgeben. Dafür ist eine
        geeignete Schleife zu verwenden, z. B.:

        Eingabe: 5
        Ausgabe: 5 x 1 = 5
                 5 x 2 = 10
                 5 x 3 = 15
                 5 x 4 = 20
                 5 x 5 = 25
                 5 x 6 = 30
                 5 x 7 = 35
                 5 x 8 = 40
                 5 x 9 = 45
                 5 x 10 = 50 */
    }
}
