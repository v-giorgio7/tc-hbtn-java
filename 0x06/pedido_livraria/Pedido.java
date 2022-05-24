public class Pedido {
    private int percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double somaTotal = 0;
        for (ItemPedido item : itens) {
            somaTotal += (item.getQuantidade() * item.getProduto().obterPrecoLiquido());
        }

        return somaTotal * (1 - (this.percentualDesconto / 100.0));
    }
}
