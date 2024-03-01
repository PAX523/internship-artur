package com.quadient.internship.artur;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void summeVonZahlen() {
        Calculator calc = new Calculator();

        int ergebnis = calc.sum(2, 6);

        Assertions.assertThat(ergebnis).isEqualTo(8);
    }
}
