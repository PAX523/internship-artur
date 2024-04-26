package com.quadient.internship.artur.monster;

public class Main {
    public static void main(String[] args) {

        Drachen drachen = new Drachen();
        drachen.kaempfen();
        System.out.println(drachen.kraft + " " + drachen.punktzahl);
        drachen.schlafen();
        drachen.gerauscheMachen();
        MAMA mama = new MAMA();
        mama.kaempfen();
        System.out.println(mama.kraft + " " + mama.punktzahl);
        mama.schlafen();
        mama.gerauscheMachen();

    }
}
