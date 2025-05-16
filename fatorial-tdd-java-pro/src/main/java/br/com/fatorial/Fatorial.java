package br.com.fatorial;

import br.com.fatorial.util.Validador;

public class Fatorial {

    public static int calcular(int numero) {
        Validador.validarNumeroNaoNegativo(numero);
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
