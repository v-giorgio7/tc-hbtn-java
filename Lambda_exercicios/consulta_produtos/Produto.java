

public class Produto {
    private String nome;
    private double preco, peso;
    private int quantidadeEmEstoque;
    private TiposProduto tipo;

    public Produto(String nome, double preco, double peso, int quantidadeEmEstoque, TiposProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.tipo = tipo;
    }

//    @Override
//    public String toString() {
//        return String.format("%s %s %s %d %s",
//                this.nome,
//                String.format("%.6f", this.preco).replace(".", ","),
//                String.format("%.6f", this.peso).replace(".", ","),
//                this.quantidadeEmEstoque,
//                this.tipo
//                );
//    }

    @Override
    public String toString() {
        return String.format("%s %6f %6f %d %s",
                getNome(), getPreco(), getPeso(),
                getQuantidadeEmEstoque(), getTipo());
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public TiposProduto getTipo() {
        return tipo;
    }
}
