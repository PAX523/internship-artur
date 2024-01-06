package com.quadient.internship.artur.controller;

import com.quadient.internship.artur.model.GameState;
import com.quadient.internship.artur.view.ConsoleView;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

class ControllerTest
{
    private final static InputStream ORIGINAL_SYSTEM_IN = System.in;

    private Controller sut;

    private Boolean gameWon;

    @BeforeEach
    void beforeEach()
    {
        System.setIn(new ByteArrayInputStream("a\r\n".getBytes()));
        gameWon = null;
        sut = new Controller(new ConsoleView()
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

    @AfterAll
    static void afterAll()
    {
        System.setIn(ORIGINAL_SYSTEM_IN);
    }

    @Test
    void playAndWinGame()
    {
        System.setIn(new ByteArrayInputStream("XaYbcd\r\n".getBytes()));

        sut.initGame("abcABCD");
        sut.startGame();

        assertThat(gameWon).isTrue();
    }

    @Test
    void playAndLoseGame()
    {
        System.setIn(new ByteArrayInputStream("XaYbZLMNOPQRSTUVWn\r\n".getBytes()));

        sut.initGame("abcABCD");
        sut.startGame();

        assertThat(gameWon).isFalse();
    }

    @Test
    void isRestarted()
    {
        System.setIn(new ByteArrayInputStream("abcdeFGHj\r\n".getBytes()));
        assertThat(sut.isRestarted()).isTrue();

        System.setIn(new ByteArrayInputStream("abcdeFGHn\r\n".getBytes()));
        assertThat(sut.isRestarted()).isFalse();

        System.setIn(new ByteArrayInputStream("abcdeFGHJ\r\n".getBytes()));
        assertThat(sut.isRestarted()).isTrue();

        System.setIn(new ByteArrayInputStream("abcdeFGHN\r\n".getBytes()));
        assertThat(sut.isRestarted()).isFalse();
    }
}
