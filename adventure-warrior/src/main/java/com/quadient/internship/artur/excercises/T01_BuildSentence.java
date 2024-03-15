package com.quadient.internship.artur.excercises;

public class T01_BuildSentence {
    public static void main(final String[] args) {

        final String[] words = {"Hallo", "Artur,", "das", "ist", "großartig!"};

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        // Soll als Satz ausgegeben werden: "Hallo Artur, das ist großartig!"
    }
}
