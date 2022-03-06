package com.capgemini.academia.service;

public class QuestaoTresService {

    public String encriptarTexto(String texto) {
        validarTexto(texto);
        String textoSemEspaco = texto.replaceAll("\\s+", "");
        int qtdCaracteres = textoSemEspaco.length();
        double raiz = Math.sqrt(qtdCaracteres);
        int ceil = (int) Math.ceil(raiz);
        StringBuilder textoCriptografado = new StringBuilder();

        //valida a quantidade de linhas e colunas [Se certifique de que linhas x colunas >= T]
        if (ceil * ceil >= qtdCaracteres) {
            Character[][] matriz = new Character[ceil][ceil];
            preencherMatriz(textoSemEspaco, qtdCaracteres, ceil, matriz);
            for (int i = 0; i < ceil; i++) {
                for (int j = 0; j < ceil; j++) {
                    if (matriz[j][i] != null) {
                        textoCriptografado.append(matriz[j][i]);
                    }
                }
                textoCriptografado.append(" ");
            }
        } else {
            throw new IllegalArgumentException("A quantidade de linhas * colunas deve" +
                    " ser menor ou igual ao tamanho do texto");
        }
        return textoCriptografado.toString();
    }

    private void validarTexto(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("O texto não pode ser nulo");
        }
    }

    private void preencherMatriz(String textoSemEspaco, double qtdCaracteres, int ceil, Character[][] matriz) {
        int contador = 0;
        for (int i = 0; i < ceil; i++) {
            for (int j = 0; j < ceil; j++) {
                if (contador < qtdCaracteres) {
                    matriz[i][j] = textoSemEspaco.charAt(contador++);
                }
            }
        }
    }

}
