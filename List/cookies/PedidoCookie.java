

public class PedidoCookie {

    private String sabor;
    private int quantidadeCaixas;

    public PedidoCookie(String sabor, int qtd) {
        this.sabor = sabor;
        this.quantidadeCaixas = qtd;
    }

    public String getSabor() {
        return sabor;
    }

    public int getQuantidadeCaixas() {
        return quantidadeCaixas;
    }
}
