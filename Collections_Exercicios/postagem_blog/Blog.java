

import java.util.*;

public class Blog<T> {
    private final List<Post> postagens;

    public Blog() {
        postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        if (!postagens.contains(post)) {
            this.postagens.add(post);
        } else {
            throw new IllegalArgumentException("Postagem jah existente");
        }
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post post : postagens) {
            Autor autor = post.getAutor();
            if (autor != null) {
                autores.add(autor);
            }
        }

        return autores;
    }

    /**
     * Fazer a busca de posts de acordo com o param fornecido
     * @param param (Autor or Categorias)
     * @return Set<Post>
     */
    public Set<Post> obterPostsPorParam(Object param) {
        Set<Post> postsPorParam = new TreeSet<>();
        for (Post post : postagens) {
            if (param.getClass().getSimpleName().equals("Autor")) {
                if (post.getAutor().equals(param)) {
                    postsPorParam.add(post);
                }
            } else if (param.getClass().getSimpleName().equals("Categorias")) {
                if (post.getCategoria().equals(param)) {
                    postsPorParam.add(post);
                }
            }
        }

        return postsPorParam;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        return obterPostsPorParam(autor);
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        return obterPostsPorParam(categoria);
    }

    public TreeMap<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        TreeMap<Categorias, Set<Post>> postsPorCategorias = new TreeMap<>();

        for (Post post : postagens) {
            Categorias categoriaDoPostAtual = post.getCategoria();
            if (!postsPorCategorias.containsKey(categoriaDoPostAtual)) {
                postsPorCategorias.put(categoriaDoPostAtual, new TreeSet<Post>());
            }

            postsPorCategorias.get(categoriaDoPostAtual).add(post);
        }

        return postsPorCategorias;
    }

    public TreeMap<Autor, Set<Post>> obterTodosPostsPorAutor() {
        TreeMap<Autor, Set<Post>> postsPorAutor = new TreeMap<>();

        for (Post post : postagens) {
            Autor autorAtual = post.getAutor();
            if (!postsPorAutor.containsKey(autorAtual)) {
                postsPorAutor.put(autorAtual, new TreeSet<Post>());
            }

            postsPorAutor.get(autorAtual).add(post);
        }

        return postsPorAutor;
    }

    public TreeMap<Categorias, Integer> obterContagemPorCategoria() {
        Integer VALOR_INICIAL_CONTAGEM_CATEGORIA = 1;
        TreeMap<Categorias, Integer> contagemPorCategoria = new TreeMap<Categorias, Integer>();

        for (Post post : postagens) {
            Categorias categoria = post.getCategoria();

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
