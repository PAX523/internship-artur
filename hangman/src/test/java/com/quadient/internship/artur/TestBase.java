package com.quadient.internship.artur;

import org.junit.jupiter.api.AfterAll;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public abstract class TestBase
{
    private final static InputStream ORIGINAL_SYSTEM_IN = System.in;

    @AfterAll
    static void afterAll()
    {
        System.setIn(ORIGINAL_SYSTEM_IN);
    }

    protected void setSystemIn(final String[] inputs)
    {
        final var result = new StringBuilder();

        for (final var input : inputs)
        {
            result.append(input).append("\n");
        }

        System.setIn(new ByteArrayInputStream(result.toString().getBytes(StandardCharsets.UTF_8)));
    }
}
