package com.capgemini.academia.service;

public class QuestaoDoisService {

    public int calcularQuantidadePares(int[] elementos, int diferenca) {
        int quantidade = 0;
        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < elementos.length; j++) {
                if (elementos[i] - elementos[j] == diferenca) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

}
