package com.quadient.internship.artur;

import com.quadient.internship.artur.utils.InputUtils;
import com.quadient.internship.artur.utils.NumberUtils;

public class GuessingGame {
    private int zufallsZahl;

    private int versuche = 10;

    private void vorbei2() {
        if (versuche <= 0) {
            System.out.println("Du hast in 10 versuchen es nicht geschafft die Zahl " + zufallsZahl + (" herauszufinden!"));
            vorbei();
        }

    }

    public void generiereZufallszahl() {
        zufallsZahl = NumberUtils.random(1, 101);
    }

    public int benutzereingabe() {
        int x = InputUtils.readIntegerInput();
        versuche--;
        return x;
    }

    public void ueberpruefeBenutzereingabe(final int eingabe) {
        if (eingabe < zufallsZahl) {
            System.out.println("Deine Zahl ist zu klein!");
            vorbei2();
        } else if (eingabe > zufallsZahl) {
            System.out.println("Deine Zahl ist zu groß!");
            vorbei2();
        } else {
            System.out.println("Du hasst die Zahl " + zufallsZahl + " heraus gefunden!");
            vorbei();
        }
    }

    private void vorbei() {
        System.exit(0);
    }

}