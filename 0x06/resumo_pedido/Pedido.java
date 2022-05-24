public class Pedido {
    private int percentualDesconto;
    private double somaTotal;
    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        this.somaTotal = 0.0;
        for (ItemPedido item : itens) {
            this.somaTotal += (item.getQuantidade() * item.getProduto().obterPrecoLiquido());
        }

        return this.somaTotal * (1.0 - (this.percentualDesconto / 100.0));
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido pedido : this.itens) {

            System.out.println("Tipo: " + pedido.getProduto().getClass().getSimpleName() +
                    "  Titulo: " + pedido.getProduto().getTitulo() +
                    "  Preco: " + this.convertDouble(pedido.getProduto().obterPrecoLiquido()) +
                    "  Quant: " + pedido.getQuantidade() +
                    "  Total: " + this.convertDouble(pedido.getQuantidade() * pedido.getProduto().obterPrecoLiquido()));
        }
        System.out.println("----------------------------");
        this.calcularTotal();
        if (this.percentualDesconto == 0) {
            System.out.println("DESCONTO: 0,00");
        } else {
            System.out.println("DESCONTO: " + this.convertDouble(this.somaTotal * (this.percentualDesconto / 100.0)));
        }
        System.out.println("TOTAL PRODUTOS: " + this.convertDouble(this.somaTotal));
        System.out.println("----------------------------");
        System.out.println("TOTAL PEDIDO: " + this.convertDouble(this.calcularTotal()));
        System.out.println("----------------------------");
    }

    private String convertDouble(Double valor) {
        String valorStr = String.format("%.2f", valor);
        return valorStr.replace('.', ',');
    }
}
