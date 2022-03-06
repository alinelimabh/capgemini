# Academia Capgemini
### DESAFIO DE PROGRAMAÇÃO 02 - ACADEMIA CAPGEMINI

### Tecnologias Utilizadas
* Java 11
* Maven
* JUnit
* intellij idea

### Instruções de como rodar a aplicação
Execute o método main da classe ```com.capgemini.academia.AcademiaCapgemini```

### Documentação

Testes unitários incluídos no resouce ```test```
* com.capgemini.academia.service.QuestaoUmServiceTest
* com.capgemini.academia.service.QuestaoDoisServiceTest
* com.capgemini.academia.service.QuestaoTresServiceTest

### Questão 01
Recebe um array como parâmetro, primeior valida se possui uma quantidade impar de elementos,
se não tiver levanta uma exceção ```IllegalArgumentException```, caso contrário, ordena o
array, calcula o elemento mediano, dividindo a quantidade de elementos do array por 2, 
retorna o lemento desta posição
```java
public class QuestaoUmService {

    public int recuperarMediana(int[] numeros) {
        validarMatriz(numeros);
        Arrays.sort(numeros);
        int meio = numeros.length / 2;
        return numeros[meio];
    }

    private void validarMatriz(int[] numeros) {
        if (numeros.length % 2 == 0) {
            throw new IllegalArgumentException("A quantidade de numeros deve ser impar");
        }
    }

}
```

### Questão 02
Pega cada elemento do primeiro ```for``` e depois compara com todos os elementos
do segundo ```for``` se for igual ao valor da diferença passada como parâmetro, 
incrementa o contador
```java
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
```

### Questão 03
Primeiramente valida se o texto passado como parâmetro não é nulo, caso seja, retorna uma exceção
```IllegalArgumentException```, caso o texto esteja preenvhido, remove os espaços em branco,
recupera a quantidade de caracteres, calcula a raiz quadrada e arredonda o resultado para cima,
caso seja necessário, cria um objeto ```StringBuilder``` para armazenar o texto criptografado
valida a regra de que ```Se certifique de que linhas x colunas >= T (tamanho do texto)```, caso esta
regra não esteja válida sobe uma exceção ```IllegalArgumentException```, caso contrário cria uma 
matriz para realocar os caracteres, e preeche com os caracteres, sem os espaços em branco, depois
percorre novamente todos os elementos da matriz incluindo no atribudo ```textoCriptografado```, verificando
antes se o caractere não é nulo, pois podem sobrar espaços nulos na ultima linha da matriz
a cada iteração do segundo ```for``` inclui um espaço em branco, ao final retorna o texto criptografado

```java
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
```