package com.quadient.internship.artur.excercises;

import com.quadient.internship.artur.utils.InputUtils;

public class T03_NumberPattern {
    public static void main(final String[] args) {
        System.out.println("Wie viele Zeilen soll ich schreiben?");
        int eingabe = InputUtils.readIntegerInput();
        int x = 1;
        for (int i = 1; i <= eingabe; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(x);
            }
            System.out.println();
            x++;
        }

    }
        /* Die Anzahl der gewünschten Zeilen von der Konsole einlesen und zeilenweise für jede Zeile N die Zeilennumer N Mal
        ausgeben, z. B.:

        Eingabe: 5
        Ausgabe: 1
                 22
                 333
                 4444
                 55555 */
}

