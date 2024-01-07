package com.quadient.internship.artur.view;

import com.quadient.internship.artur.TestBase;
import com.quadient.internship.artur.model.GameState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConsoleViewTest extends TestBase
{
    private ConsoleView sut;

    @BeforeEach
    void beforeEach()
    {
        setSystemIn(new String[]{"a"});
        sut = new ConsoleView();
    }

    @Test
    void padWord()
    {
        assertThat(sut.padded("")).isEqualTo("");
        assertThat(sut.padded("a")).isEqualTo("a");
        assertThat(sut.padded("aB")).isEqualTo("a B");
        assertThat(sut.padded("aBc")).isEqualTo("a B c");
    }

    @Test
    void refreshView()
    {
        sut.refresh(new GameState("word"));
    }

    @Test
    void getGuessedLetter()
    {
        setSystemIn(new String[]{"\u0000", "\u0005", "a"});
        assertThat(sut.getGuessedLetter()).isEqualTo('a');

        setSystemIn(new String[]{"0", "9", "z"});
        assertThat(sut.getGuessedLetter()).isEqualTo('z');

        setSystemIn(new String[]{"?", "!", "A"});
        assertThat(sut.getGuessedLetter()).isEqualTo('A');

        setSystemIn(new String[]{".", ",", "#", "Z"});
        assertThat(sut.getGuessedLetter()).isEqualTo('Z');

        setSystemIn(new String[]{";", ":", "ä"});
        assertThat(sut.getGuessedLetter()).isEqualTo('ä');

        setSystemIn(new String[]{";", ":", "Ä"});
        assertThat(sut.getGuessedLetter()).isEqualTo('Ä');

        setSystemIn(new String[]{";", ":", "ö"});
        assertThat(sut.getGuessedLetter()).isEqualTo('ö');

        setSystemIn(new String[]{";", ":", "Ö"});
        assertThat(sut.getGuessedLetter()).isEqualTo('Ö');

        setSystemIn(new String[]{";", ":", "ü"});
        assertThat(sut.getGuessedLetter()).isEqualTo('ü');

        setSystemIn(new String[]{";", ":", "Ü"});
        assertThat(sut.getGuessedLetter()).isEqualTo('Ü');

        setSystemIn(new String[]{";", ":", "ß"});
        assertThat(sut.getGuessedLetter()).isEqualTo('ß');
    }

    @Test
    void displayGameLost()
    {
        sut.displayGameLost(new GameState("word"));
    }

    @Test
    void displayGameWon()
    {
        sut.displayGameWon(new GameState("word"));
    }

    @Test
    void askRestart()
    {
        setSystemIn(new String[]{"a", "b", "j"});
        assertThat(sut.askRestart()).isTrue();

        setSystemIn(new String[]{"y", "z", "J"});
        assertThat(sut.askRestart()).isTrue();

        setSystemIn(new String[]{"0", "9", "n"});
        assertThat(sut.askRestart()).isFalse();

        setSystemIn(new String[]{",", ".", "N"});
        assertThat(sut.askRestart()).isFalse();
    }
}
