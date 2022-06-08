import java.util.List;
import java.util.ArrayList;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro) {
        List<Produto> listaProdutos = new ArrayList<Produto>();

        produtos.forEach(p -> {
            if (criterioFiltro.testar(p)) {
                listaProdutos.add(p);
            }
        });

        return listaProdutos;
    }

}
