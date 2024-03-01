package com.quadient.internship.artur.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class InputUtils {
    public static String readInput() {
        try (final var baos = new ByteArrayOutputStream()) {
            var letter = System.in.read();
            while (letter != -1 && letter != '\r' && letter != '\n') {
                baos.write((byte) (letter & 0xFF));
                letter = System.in.read();
            }

            return baos.toString(StandardCharsets.UTF_8);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }
}
