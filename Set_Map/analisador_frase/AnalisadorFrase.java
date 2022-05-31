

import java.util.TreeMap;

public class AnalisadorFrase {

    private static final int BEGIN_VALUE = 1;

    static TreeMap<String, Integer> contagemPalavras(String frase) {
        return AnalisadorFrase.contagemArray(AnalisadorFrase.quebrarFrase(frase));
    }

    /**
     * - Retira caracteres especiais
     * - Transfoma a String em um Array de Strings (palavras)
     * @param frase (String)
     * @return String[] contendo as palavras
     */
    private static String[] quebrarFrase(String frase) {
        String[] palavras = frase.replace("?", "")
                .replace("!", "")
                .replace(".", "")
                .split(" ");

        return palavras;
    }

    /**
     * - Percorrer o array e preencher o Map com <palavra, quantidadeDeRepeticoes>
     * - Caso a palavra esteja repetida, atualizar valor com incremento
     * - Todas as palavras em Lowercase
     * @param palavras (array contendo Strings)
     * @return TreeMap contendo chave (palavra) e valor (quantidade de aparicoes da palavra)
     */
    private static TreeMap<String, Integer> contagemArray(String[] palavras) {
        TreeMap<String, Integer> letrasERepeticoes = new TreeMap<>();

        for (String palavra : palavras) {
            String palavraSemCase = palavra.toLowerCase();
            if (letrasERepeticoes.containsKey(palavraSemCase)) {
                int valorAtual = letrasERepeticoes.get(palavraSemCase);
                letrasERepeticoes.replace(palavraSemCase, ++valorAtual);
            } else {
                letrasERepeticoes.put(palavraSemCase, BEGIN_VALUE);
            }
        }

        return letrasERepeticoes;
    }
}
