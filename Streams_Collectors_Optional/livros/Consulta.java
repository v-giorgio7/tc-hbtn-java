

import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    static List<Produto> obterLivrosDoPedido (Pedido pedido) {
        return pedido.getProdutos().stream()
                .filter(c -> c.getCategoria() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());
    }
}
