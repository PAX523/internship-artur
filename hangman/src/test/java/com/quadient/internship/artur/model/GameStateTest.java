package com.quadient.internship.artur.model;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class GameStateTest
{
    @Test
    void createInitialState()
    {
        var sut = new GameState("aBc");
        assertThat(sut.getSecretWord()).isEqualTo("aBc");
        assertThat(sut.getGuessedWord()).isEqualTo("___");
        assertThat(sut.getIncorrectGuesses()).isEqualTo(Set.of());
        assertThat(sut.isWordGuessed()).isFalse();
        assertThat(sut.isMaxiumGuessesExceeded()).isFalse();

        sut = new GameState("");
        assertThat(sut.isWordGuessed()).isTrue();
        assertThat(sut.isMaxiumGuessesExceeded()).isFalse();
    }

    @Test
    void isLetterContained()
    {
        final var sut = new GameState("ABCdef");

        assertThat(sut.isLetterContained('a')).isTrue();
        assertThat(sut.isLetterContained('A')).isTrue();
        assertThat(sut.isLetterContained('f')).isTrue();
        assertThat(sut.isLetterContained('F')).isTrue();
        assertThat(sut.isLetterContained('X')).isFalse();
    }

    @Test
    void detectMaximumGuesses()
    {
        final var sut = new GameState("a");

        for (int i = 0; i <= GameState.MAX_INCORRECT_GUESSES + 1; i++, sut.addIncorrectGuessedLetter((char) (94 + i)))
        {
            if (i <= GameState.MAX_INCORRECT_GUESSES)
            {
                assertThat(sut.isMaxiumGuessesExceeded()).isFalse();
            } else
            {
                assertThat(sut.isMaxiumGuessesExceeded()).isTrue();
            }
        }
    }

    @Test
    void duplicatedIncorrectGuessesAreNotCounted()
    {
        final var sut = new GameState("abc");
        assertThat(sut.getIncorrectGuesses()).isEqualTo(Set.of());

        sut.addIncorrectGuessedLetter('d');
        assertThat(sut.getIncorrectGuesses()).isEqualTo(Set.of('d'));

        sut.addIncorrectGuessedLetter('e');
        assertThat(sut.getIncorrectGuesses()).isEqualTo(Set.of('d', 'e'));

        sut.addIncorrectGuessedLetter('d');
        assertThat(sut.getIncorrectGuesses()).isEqualTo(Set.of('d', 'e'));

        sut.addIncorrectGuessedLetter('f');
        assertThat(sut.getIncorrectGuesses()).isEqualTo(Set.of('d', 'e', 'f'));
    }

    @Test
    void revealLetter()
    {
        final var sut = new GameState("aBcDeF");
        assertThat(sut.getGuessedWord()).isEqualTo("______");
        assertThat(sut.isWordGuessed()).isFalse();

        sut.revealLetter('c');
        assertThat(sut.getGuessedWord()).isEqualTo("__c___");
        assertThat(sut.isWordGuessed()).isFalse();

        sut.revealLetter('f');
        assertThat(sut.getGuessedWord()).isEqualTo("__c__F");
        assertThat(sut.isWordGuessed()).isFalse();

        sut.revealLetter('a');
        assertThat(sut.getGuessedWord()).isEqualTo("a_c__F");
        assertThat(sut.isWordGuessed()).isFalse();

        sut.revealLetter('d');
        assertThat(sut.getGuessedWord()).isEqualTo("a_cD_F");
        assertThat(sut.isWordGuessed()).isFalse();

        sut.revealLetter('b');
        assertThat(sut.getGuessedWord()).isEqualTo("aBcD_F");
        assertThat(sut.isWordGuessed()).isFalse();

        sut.revealLetter('E');
        assertThat(sut.getGuessedWord()).isEqualTo("aBcDeF");
        assertThat(sut.isWordGuessed()).isTrue();
    }
}
