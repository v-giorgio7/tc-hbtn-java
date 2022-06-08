import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> predicate) {
        List<Produto> listaProdutos = new ArrayList<Produto>();

        produtos.forEach(p -> {
            if (predicate.test(p)) {
                listaProdutos.add(p);
            }
        });

        return listaProdutos;
    }

}


