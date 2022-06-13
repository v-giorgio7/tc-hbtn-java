

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    static List<Produto> obterLivrosDoPedido (Pedido pedido) {
        return pedido.getProdutos().stream()
                .filter(c -> c.getCategoria() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed()).toList().get(0);

//        return produtos.stream().max(Comparator.comparing(Produto::getPreco)).get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
        return produtos.stream()
                .filter(p -> p.getPreco() >= precoMinimo)
                .toList();
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream()
                .filter(pedido ->
                        pedido.getProdutos().stream()
                                .anyMatch(produto ->
                                        produto.getCategoria() == CategoriaProduto.ELETRONICO)
                ).toList();
    }
}
