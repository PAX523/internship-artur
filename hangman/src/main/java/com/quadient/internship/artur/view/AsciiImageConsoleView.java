package com.quadient.internship.artur.view;

import com.quadient.internship.artur.model.GameState;

import java.util.stream.Collectors;

public class AsciiImageConsoleView extends ConsoleView
{
    public AsciiImageConsoleView()
    {
        if (GameState.MAX_INCORRECT_GUESSES != 6)
        {
            throw new IllegalArgumentException(String.format("""
                    The drawn ASCII image expects that the game only accepts exactly 6 incorrect guesses, but the game state accepts %d.
                    """, GameState.MAX_INCORRECT_GUESSES));
        }
    }

    @Override
    public void refresh(final GameState state)
    {
        final var gameFinished = state.isWordGuessed() || state.isMaxiumGuessesExceeded();
        if (!gameFinished)
        {
            System.out.printf("%n%nVerkehrte Buchstaben: %s%n", state.getIncorrectGuesses().stream().map(String::valueOf).collect(Collectors.joining(", ")));
            System.out.printf("Wort: %s%n", padded(state.getGuessedWord()));
        }

        printIncorrectGuesses(state);

        if (!gameFinished)
            System.out.print("Welchen Buchstaben enthält das Wort? ");
    }

    private static void printIncorrectGuesses(final GameState state)
    {
        switch (state.getIncorrectGuesses().size())
        {
            case 0:
                System.out.println("""
                            
                            
                            
                            
                            |
                           /|\\
                        """);
                break;
            case 1:
                System.out.println("""
                             
                            │
                            │
                            │
                            │
                           /|\\
                        """);
                break;
            case 2:
                System.out.println("""
                             _______
                            │/
                            │
                            │
                            │
                           /|\\
                        """);
                break;
            case 3:
                System.out.println("""
                             _______
                            │/      │
                            │
                            │
                            │
                           /|\\
                        """);
                break;
            case 4:
                System.out.println("""
                             _______
                            │/      │
                            │       O
                            │
                            │
                           /|\\
                        """);
                break;
            case 5:
                System.out.println("""
                             _______
                            │/      │
                            │       O
                            │       │
                            │
                           /|\\
                        """);
                break;
            case 6:
                System.out.println("""
                             _______
                            │/      │
                            │       O
                            │      /│\\
                            │
                           /|\\
                        """);
                break;
            default:
                System.out.println("""
                             _______
                            │/      │
                            │       O
                            │      /│\\
                            │      / \\
                           /|\\
                        """);
                break;
        }

        if (!state.isMaxiumGuessesExceeded())
            System.out.printf("Erfolglose Rateversuche: %d/%d%n", state.getIncorrectGuesses().size(), GameState.MAX_INCORRECT_GUESSES);
    }
}
