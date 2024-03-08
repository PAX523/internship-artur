package com.quadient.internship.artur;

import com.quadient.internship.artur.utils.InputUtils;

public class Main {
    private static String name;
    
    public static void main(String[] args) {
        System.out.println("Wie lautet euer Name? ");
        name = InputUtils.readInput();
        if (name.equalsIgnoreCase("Artur")) {
            spezialName();
        } else {
            normalerName();
        }
    }

    private static void spezialName() {
        System.out.println("Willkommen König Artur!");
        dunklerWald();
    }

    private static void normalerName() {
        System.out.println("Willkommen Reisender!");
        dunklerWald();
    }

    private static void dunklerWald() {
        System.out.println("""
                Ihr seid in einem dunklen Wald.
                Wollt ihr nach links(L) oder
                rechts(R) gehen?
                """);
        String richtung = InputUtils.readInput();
        while (!richtung.equalsIgnoreCase("L") && !richtung.equalsIgnoreCase("R")) {
            richtungKeineAhnung();
            richtung = InputUtils.readInput();
        }
        if (richtung.equalsIgnoreCase("L")) {
            richtungL();
        } else {
            richtungR();
        }


    }

    private static void richtungL() {
        System.out.println("""
                Ihr geht nach Links und
                 fallt hin da ihr über eine
                 Wurzel gefallen seid.
                """);
    }

    private static void richtungR() {
        System.out.println("""
                Ihr trefft auf einen bösen Troll!
                DER DICH FRESSEN WILL!
                """);
        if (name.equalsIgnoreCase("Artur")){
            besiegt();
        }else{
            System.out.println("Du läufst davon!");
        }
        
    }

    private static void richtungKeineAhnung() {
        System.out.println("""
                Bitte Wähle Links(L)
                oder Rechts(R)!
                """);

    }
private static void besiegt() {
        String richtung = InputUtils.readInput();
        System.out.println("""
                Du besiegst den Troll mit
                DEINEM SCHWERT!
                
                
                Du läufst weiter...
                """);
        System.out.println("""
                Du triffst auf einen freundlichen Elf
                er schenkt dir einen magischen Rubin...
                und ein Schild...
                """);
    if (richtung.equalsIgnoreCase("L")) {
        richtungL();
    } else if () {
        
    }
    {
        richtungR();
    }
}
}

