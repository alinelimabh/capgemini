package com.capgemini.academia.service;

import java.util.Arrays;

public class QuestaoUmService {

    /**
     * A mediana de uma lista de números é basicamente
     * o elemento que se encontra no meio da lista após a
     * ordenação. Dada uma lista de números com um número
     * ímpar de elementos, desenvolva um algoritmo que
     * encontre a mediana.
     * @param numeros mumeros para recuperar mediana
     * @return a mediana de uma lista de numeros
     */
    public int recuperarMediana(int[] numeros) {
        validarMatriz(numeros);
        Arrays.sort(numeros);
        int meio = numeros.length / 2;
        return numeros[meio];
    }

    /**
     * Regra para validar se a quantidade de numeros do array é impar
     * @param numeros mumeros para validacao do tamanho do array
     */
    private void validarMatriz(int[] numeros) {
        if (numeros.length % 2 == 0) {
            throw new IllegalArgumentException("A quantidade de elementos deve ser impar");
        }
    }

}
