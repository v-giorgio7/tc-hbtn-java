

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
    public static ArrayList<Produto> filtrar(List<Produto> produtos,
                                        Predicate<Produto> predicateProduto) {
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        produtos.forEach(p -> {
            if (predicateProduto.test(p)) {
                listaProdutos.add(p);
            }
        });

        return listaProdutos;
    }
}
