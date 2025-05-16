package br.com.fatorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FatorialTest {

    @Test
    public void testFatorialDeZero() {
        assertEquals(1, Fatorial.calcular(0));
    }

    @Test
    public void testFatorialDeUm() {
        assertEquals(1, Fatorial.calcular(1));
    }

    @Test
    public void testFatorialDeCinco() {
        assertEquals(120, Fatorial.calcular(5));
    }

    @Test
    public void testFatorialDeNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> Fatorial.calcular(-3));
    }
}
