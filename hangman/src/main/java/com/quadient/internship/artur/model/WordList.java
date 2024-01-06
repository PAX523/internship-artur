package com.quadient.internship.artur.model;

import java.util.Random;

public class WordList
{
    private final String[] words = new String[]{
            "Geburtstag",
            "Entwickler",
            "Krokodil",
            "Geheimnis",
            "Überraschung",
            "Abenteuer",
            "Bibliothek",
            "Sonnenschein",
            "Phänomen",
            "Elefant",
            "Gewitter",
            "Universum",
            "Harmonie",
            "Gitarre",
            "Paradies",
            "Praktikant",
            "Kirschbaum",
            "Zirkulation",
            "Hauptquartier",
            "Kommunikation"
    };

    public String getRandomWord()
    {
        final var randomizer = new Random();
        final var index = randomizer.nextInt(0, words.length);

        return words[index];
    }
}
