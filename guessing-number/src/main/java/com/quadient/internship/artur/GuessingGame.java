package com.quadient.internship.artur;

import com.quadient.internship.artur.utils.InputUtils;
import com.quadient.internship.artur.utils.NumberUtils;

public class GuessingGame {
    public int zufallsZahl;

    public int versuche;

    public void generiereZufallszahl() {
        zufallsZahl = NumberUtils.random(1, 101);
    }

    public void benutzereingabe() {
        int x = InputUtils.readIntegerInput();
        ueberpruefeBenutzereingabe(x);
    }

    public void ueberpruefeBenutzereingabe(final int eingabe) {
        /*Überprüfen ob Zahl >||< ist und ggf. Tipps geben*/
        if (eingabe < zufallsZahl) {
            System.out.println("Deine Zahl ist zu klein!");
        } else if (eingabe > zufallsZahl) {
            System.out.println("Deine Zahl ist zu groß!");
        } else {
            System.out.println("Du hasst die Zahl " + zufallsZahl + " heraus gefunden!");
            vorbei();
        }

    }

    public void vorbei() {
        System.exit(0);
    }

}