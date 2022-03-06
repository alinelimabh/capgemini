package com.capgemini.academia.service;

public class QuestaoDoisService {

    /**
     * Calcula a quantidade de elementos que tem diferença igual ao valor informado no segundo parametro
     * @param elementos que deverá calcular a diferença4
     * @param diferenca entre o elemento e o próximo
     * @return a quantidade de elementos que tem exatamente a diferença passada como parâmetro, entre ele
     * e o elemento posterior
     */
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
