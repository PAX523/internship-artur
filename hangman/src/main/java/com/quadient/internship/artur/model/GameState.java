package com.quadient.internship.artur.model;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class GameState
{
    public static final int MAX_INCORRECT_GUESSES = 6;

    private static final char UNREVEALED_WORD_CHAR = '_';

    private final String secretWord;

    private final char[] guessedWord;

    private final Set<Character> incorrectGuesses;

    public GameState(final String word)
    {
        secretWord = word;

        guessedWord = new char[secretWord.length()];
        Arrays.fill(guessedWord, UNREVEALED_WORD_CHAR);

        incorrectGuesses = new TreeSet<>();
    }

    public String getSecretWord()
    {
        return secretWord;
    }

    public String getGuessedWord()
    {
        return String.valueOf(guessedWord);
    }

    public Set<Character> getIncorrectGuesses()
    {
        return incorrectGuesses;
    }

    public boolean isLetterContained(final char letter)
    {
        for (int i = 0; i < secretWord.length(); i++)
        {
            if (Character.toLowerCase(secretWord.charAt(i)) == Character.toLowerCase(letter))
                return true;
        }

        return false;
    }

    public void revealLetter(final char letter)
    {
        for (int i = 0; i < secretWord.length(); i++)
        {
            if (Character.toLowerCase(secretWord.charAt(i)) == Character.toLowerCase(letter))
                guessedWord[i] = secretWord.charAt(i);
        }
    }

    public boolean isWordGuessed()
    {
        for (final char c : guessedWord)
        {
            if (c == UNREVEALED_WORD_CHAR)
                return false;
        }

        return true;
    }

    public void addIncorrectGuessedLetter(final char letter)
    {
        incorrectGuesses.add(letter);
    }

    public boolean isMaxiumGuessesExceeded()
    {
        return incorrectGuesses.size() > MAX_INCORRECT_GUESSES;
    }
}
