

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

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream()
                .map(produto -> {
                    if (produto.getCategoria() == CategoriaProduto.ELETRONICO) {
                        produto.setPreco(produto.getPreco() * 0.85);
                    }
                    return produto;
                }).toList();

//        return produtos.stream()
//                .peek(produto -> {
//                    if (produto.getCategoria() == CategoriaProduto.ELETRONICO) {
//                        produto.setPreco(produto.getPreco() * 0.85);
//                    }
//                }).toList();
    }
}
