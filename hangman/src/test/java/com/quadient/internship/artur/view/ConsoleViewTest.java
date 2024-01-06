package com.quadient.internship.artur.view;

import com.quadient.internship.artur.model.GameState;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

class ConsoleViewTest
{
    private final static InputStream ORIGINAL_SYSTEM_IN = System.in;

    private ConsoleView sut;

    @BeforeEach
    void beforeEach()
    {
        System.setIn(new ByteArrayInputStream("a\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        sut = new ConsoleView();
    }

    @AfterAll
    static void afterAll()
    {
        System.setIn(ORIGINAL_SYSTEM_IN);
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
        System.setIn(new ByteArrayInputStream("\u0000\u0005a\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.getGuessedLetter()).isEqualTo('a');

        System.setIn(new ByteArrayInputStream("09z\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.getGuessedLetter()).isEqualTo('z');

        System.setIn(new ByteArrayInputStream("?!A\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.getGuessedLetter()).isEqualTo('A');

        System.setIn(new ByteArrayInputStream(".,#Z\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.getGuessedLetter()).isEqualTo('Z');

        System.setIn(new ByteArrayInputStream(";:ä\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.getGuessedLetter()).isEqualTo('ä');

        System.setIn(new ByteArrayInputStream(";:Ä\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.getGuessedLetter()).isEqualTo('Ä');

        System.setIn(new ByteArrayInputStream(";:ö\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.getGuessedLetter()).isEqualTo('ö');

        System.setIn(new ByteArrayInputStream(";:Ö\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.getGuessedLetter()).isEqualTo('Ö');

        System.setIn(new ByteArrayInputStream(";:ü\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.getGuessedLetter()).isEqualTo('ü');

        System.setIn(new ByteArrayInputStream(";:Ü\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.getGuessedLetter()).isEqualTo('Ü');

        System.setIn(new ByteArrayInputStream(";:ß\r\n".getBytes(StandardCharsets.ISO_8859_1)));
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
        System.setIn(new ByteArrayInputStream("abj\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.askRestart()).isTrue();

        System.setIn(new ByteArrayInputStream("yzJ\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.askRestart()).isTrue();

        System.setIn(new ByteArrayInputStream("09n\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.askRestart()).isFalse();

        System.setIn(new ByteArrayInputStream(",.N\r\n".getBytes(StandardCharsets.ISO_8859_1)));
        assertThat(sut.askRestart()).isFalse();
    }
}
