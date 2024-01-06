package com.quadient.internship.artur.controller;

import com.quadient.internship.artur.model.GameState;
import com.quadient.internship.artur.view.View;

public class Controller
{
    private GameState state;

    private final View view;

    public Controller(final View view)
    {
        this.view = view;
    }

    public void initGame(final String word)
    {
        state = new GameState(word);
    }

    public void startGame()
    {
        while (!state.isWordGuessed() && !state.isMaxiumGuessesExceeded())
        {
            view.refresh(state);

            final var letter = view.getGuessedLetter();
            if (state.isLetterContained(letter))
                state.revealLetter(letter);
            else state.addIncorrectGuessedLetter(letter);
        }

        if (state.isWordGuessed())
            view.displayGameWon(state);
        else if (state.isMaxiumGuessesExceeded())
            view.displayGameLost(state);
    }

    public boolean isRestarted()
    {
        return view.askRestart();
    }
}
