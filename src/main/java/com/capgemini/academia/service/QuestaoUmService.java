package com.capgemini.academia.service;

import java.util.Arrays;

public class QuestaoUmService {

    public int recuperarMediana(int[] numeros) {
        double valor = Math.round(Math.sqrt(numeros.length));
        validarMatriz(numeros);
        int j = 1;
        Arrays.sort(numeros);
        int resultado = numeros.length / 2;
        return numeros[resultado];
    }

    /**
     * Regra para validar se a quantidade de numeros do array é impar
     * @param numeros
     */
    private void validarMatriz(int[] numeros) {
        if (numeros.length % 2 == 0) {
            throw new IllegalArgumentException("A quantidade de numeros deve ser impar");
        }
    }

}
