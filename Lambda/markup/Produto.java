

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkUp = 10;

    // lambdas
    public Supplier<Double> precoComMarkUp = () ->
            this.preco * (1 + (this.percentualMarkUp / 100));
    public Consumer<Double> atualizarMarkUp = valor -> this.percentualMarkUp = valor;

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPercentualMarkUp() {
        return percentualMarkUp;
    }
}
