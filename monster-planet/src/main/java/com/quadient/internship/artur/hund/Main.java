package com.quadient.internship.artur.hund;

public class Main {
    public static void main(String[] args) {
        Hund bobby = new Hund();
        Hund susi = new Hund();
        bobby.setName("Bobby");
        susi.setName("Susi");
        bobby.setGeschlecht("männlich");
        susi.setGeschlecht("weiblich");
        bobby.setFellfarbe("Schwarz");
        susi.setFellfarbe("Braun");
        bobby.setAugenfarbe("Braun");
        susi.setAugenfarbe("Braun");
        bobby.setGroese(56);
        susi.setGroese(30);
        bobby.setGewicht(30);
        susi.setGewicht(15);
        bobby.setBesitzer("Artur");
        susi.setBesitzer("Onkel");

        bobby.bellen();
        susi.bellen();
        bobby.sitzen();
        susi.sitzen();

        Hund.schlafen();
        Hund.schlafen();
        Hund.schlafen();
    }
}
