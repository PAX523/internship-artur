package com.quadient.internship.artur;

import com.quadient.internship.artur.controller.Controller;
import com.quadient.internship.artur.model.WordList;
import com.quadient.internship.artur.view.ConsoleView;

public class Main {
    public static void main(final String[] args)
    {
        final var controller = new Controller(new ConsoleView());

        do
        {
            final var word = new WordList().getRandomWord();
            controller.initGame(word);
            controller.startGame();
        } while (controller.isRestarted());
    }
}
