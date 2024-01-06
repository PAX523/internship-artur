package com.quadient.internship.artur.view;

import com.quadient.internship.artur.model.GameState;

public interface View
{
    void refresh(GameState state);

    char getGuessedLetter();

    void displayGameLost(GameState state);

    void displayGameWon(GameState state);

    boolean askRestart();
}
