

import java.util.*;

public class Blog {
    private final List<Post> postagens = new ArrayList<>();

    public void adicionarPostagem(Post post) {
        this.postagens.add(post);
    }

    public TreeSet<String> obterTodosAutores() {
        TreeSet<String> autores = new TreeSet<String>();
        for (Post post : postagens) {
            String autor = post.getAutor();
            if (autor != null) {
                autores.add(autor);
            }
        }

        return autores;
    }

    public TreeMap<String, Integer> obterContagemPorCategoria() {
        Integer VALOR_INICIAL_CONTAGEM_CATEGORIA = 1;
        TreeMap<String, Integer> contagemPorCategoria = new TreeMap<String, Integer>();

        for (Post post : postagens) {
            String categoria = post.getCategoria();

            if (contagemPorCategoria.containsKey(categoria)) {
                Integer contagemAtual = contagemPorCategoria.get(categoria);
                contagemPorCategoria.put(categoria, ++contagemAtual);
            } else {
                contagemPorCategoria.put(categoria, VALOR_INICIAL_CONTAGEM_CATEGORIA);
            }
        }

        return contagemPorCategoria;
    }
}
