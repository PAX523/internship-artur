package com.quadient.internship.artur.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WordListTest
{
    private final WordList sut = new WordList();

    @Test
    void getRandomWord()
    {
        final var word = sut.getRandomWord();
        assertThat(word).isNotBlank();
    }
}
