package com.quadient.internship.artur;

public class Main {
    public static void main(final String[] args) {
        GuessingGame ablauf = new GuessingGame();
        ablauf.generiereZufallszahl();
        for (int t = 10; t >= 0; t--) {
            System.out.println("Errate die Zahl zwischen 1 und 100!");
            int eingabe = ablauf.benutzereingabe();
            ablauf.ueberpruefeBenutzereingabe(eingabe);

            /* Objekt verwendet werden
             * 10 Versuche*/
        }
    }
}
