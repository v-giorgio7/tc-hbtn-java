

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos,
                                        Predicate<Produto> predicate) {
//        List<Produto> listaProdutos = new ArrayList<Produto>();
//
//        produtos.forEach(p -> {
//            if (predicate.test(p)) {
//                listaProdutos.add(p);
//            }
//        });

//        for (Produto produto : produtos) {
//            if (predicate.test(produto)) {
//                listaProdutos.add(produto);
//            }
//        }

        return produtos.stream().filter(x -> predicate.test(x)).collect(Collectors.toList());
    }
}
