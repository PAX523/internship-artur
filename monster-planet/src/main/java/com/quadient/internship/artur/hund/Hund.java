package com.quadient.internship.artur.hund;

public class Hund extends Tier {

    //Eigenschaften(Variablen)


    private String geschlecht;
    private String fellfarbe;
    private String augenfarbe;
    private int groese;
    private int gewicht;
    private static String besitzer;

    //Eigenschaften(Methoden)

    public void setGeschlecht(String geschlechtEingabe) {
        geschlecht = geschlechtEingabe;
    }

    public void setFellfarbe(String fellfarbEingabe) {
        fellfarbe = fellfarbEingabe;
    }

    public void setAugenfarbe(String augenfarbEingabe) {
        augenfarbe = augenfarbEingabe;
    }

    public void setGroese(int groeseEingabe) {
        groese = groeseEingabe;
    }

    public void setGewicht(int gewichtsEingabe) {
        gewicht = gewichtsEingabe;
    }

    public void setBesitzer(String besitzer) {
        Hund.besitzer = besitzer;
    }

    //Aktionen

    public void sitzen() {
        System.out.println("Jawohl " + besitzer);
    }

    public void hinlegen() {

    }

    public void schwanzWedeln() {

    }

    public void bellen() {
        System.out.println("Wuff Wuff " + name);
    }

    public static void schlafen() {

    }

}
