package com.quadient.internship.artur.view;

import com.quadient.internship.artur.model.GameState;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class ConsoleView implements View
{
    private static final List<Character> SPECIAL_CHARS = List.of('ä', 'Ä', 'ö', 'Ö', 'ü', 'Ü', 'ß');

    String padded(final String word)
    {
        final StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++)
        {
            result.append(word.charAt(i)).append(' ');
        }

        return result.toString().trim();
    }

    @Override
    public void refresh(final GameState state)
    {
        System.out.printf("%n%nVerkehrte Buchstaben: %s%n", state.getIncorrectGuesses().stream().map(String::valueOf).collect(Collectors.joining(", ")));
        System.out.printf("Wort: %s%n", padded(state.getGuessedWord()));
        System.out.printf("Erfolglose Rateversuche: %d/%d%n", state.getIncorrectGuesses().size(), GameState.MAX_INCORRECT_GUESSES);
        System.out.print("Welchen Buchstaben enthält das Wort? ");
    }

    @Override
    public char getGuessedLetter()
    {
        char letter;
        do
        {
            letter = readLetter();
        } while (!(letter >= 65 && letter <= 90) && !(letter >= 97 && letter <= 122) && !SPECIAL_CHARS.contains(letter));

        return letter;
    }

    private char readLetter()
    {
        try (final ByteArrayOutputStream baos = new ByteArrayOutputStream())
        {
            int letter = System.in.read();
            while (letter != -1 && letter != 10 && letter != 13)
            {
                baos.write((byte) (letter & 0xFF));
                letter = System.in.read();
            }

            final var result = baos.toString(StandardCharsets.UTF_8);
            return !result.isEmpty() ? result.charAt(0) : 0;
        }
        catch (final IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void displayGameLost(final GameState state)
    {
        System.out.printf("%nDu hast verloren!%n");
        System.out.printf("Deine erratenen Buchstaben: %s%n", padded(state.getGuessedWord()));
        System.out.printf("     Das tatsächliche Wort: %s%n%n", padded(state.getSecretWord()));
    }

    @Override
    public void displayGameWon(final GameState state)
    {
        System.out.printf("%nDu hast gewonnen! Das Wort lautet: %s%n", padded(state.getSecretWord()));
    }

    @Override
    public boolean askRestart()
    {
        char letter;
        do
        {
            System.out.print("Möchtest du noch einmal spielen (j/n)? ");
            letter = Character.toLowerCase(readLetter());

            switch (letter)
            {
                case 'j':
                    return true;
                case 'n':
                    return false;
            }
        } while (true);
    }
}
