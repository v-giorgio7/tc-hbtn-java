

import java.util.Objects;

public class Post implements Comparable{
    private final Autor autor;
    private final String titulo;
    private final String corpo;
    private final Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return this.titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return autor.equals(post.autor) && titulo.equals(post.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, titulo);
    }

    @Override
    public int compareTo(Object o) {
        Post outroPost = (Post) o;
        return this.titulo.compareTo(outroPost.getTitulo());
    }
}
