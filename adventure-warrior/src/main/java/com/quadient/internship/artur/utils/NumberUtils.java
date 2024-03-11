package com.quadient.internship.artur.utils;

public class NumberUtils {
    public static int random(final int start, final int end) {
        return (int) (Math.random() * (end - start) + start);
    }
}
