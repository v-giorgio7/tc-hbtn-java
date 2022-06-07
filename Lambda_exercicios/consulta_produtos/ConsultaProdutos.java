

import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    public static ArrayList<Produto> filtrar(List<Produto> produtos,
                                             CriterioFiltro criterioFiltro) {
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        produtos.forEach(p -> {
            if (criterioFiltro.testar(p)) {
                listaProdutos.add(p);
            }
        });

        return listaProdutos;
    }
}
