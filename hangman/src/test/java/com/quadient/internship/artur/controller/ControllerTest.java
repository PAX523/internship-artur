package com.quadient.internship.artur.controller;

import com.quadient.internship.artur.TestBase;
import com.quadient.internship.artur.model.GameState;
import com.quadient.internship.artur.view.AsciiImageConsoleView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ControllerTest extends TestBase
{
    private Controller sut;

    private Boolean gameWon;

    @BeforeEach
    void beforeEach()
    {
        setSystemIn(new String[]{"a"});
        gameWon = null;
        sut = new Controller(new AsciiImageConsoleView()
        {
            @Override
            public void displayGameLost(final GameState state)
            {
                super.displayGameLost(state);
                gameWon = false;
            }

            @Override
            public void displayGameWon(final GameState state)
            {
                super.displayGameWon(state);
                gameWon = true;
            }
        });
    }

    @Test
    void playAndWinGame()
    {
        setSystemIn(new String[]{"X", "a", "Y", "b", "c", "d"});

        sut.initGame("abcABCD");
        sut.startGame();

        assertThat(gameWon).isTrue();
    }

    @Test
    void playAndLoseGame()
    {
        setSystemIn(new String[]{"X", "a", "Y", "b", "Z", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "n"});

        sut.initGame("abcABCD");
        sut.startGame();

        assertThat(gameWon).isFalse();
    }

    @Test
    void isRestarted()
    {
        setSystemIn(new String[]{"a", "b", "c", "d", "e", "F", "G", "H", "j"});
        assertThat(sut.isRestarted()).isTrue();

        setSystemIn(new String[]{"a", "b", "c", "d", "e", "F", "G", "H", "n"});
        assertThat(sut.isRestarted()).isFalse();

        setSystemIn(new String[]{"a", "b", "c", "d", "e", "F", "G", "H", "J"});
        assertThat(sut.isRestarted()).isTrue();

        setSystemIn(new String[]{"a", "b", "c", "d", "e", "F", "G", "H", "N"});
        assertThat(sut.isRestarted()).isFalse();
    }
}
