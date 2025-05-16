package br.com.fatorial.util;

public class Validador {

    public static void validarNumeroNaoNegativo(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número deve ser não-negativo.");
        }
    }
}
