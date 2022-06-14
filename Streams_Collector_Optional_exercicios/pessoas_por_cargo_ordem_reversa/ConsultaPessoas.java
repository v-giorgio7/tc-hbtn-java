

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class ConsultaPessoas {

    static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa (
            List<Pessoa> pessoas) {

        return pessoas.stream().collect(Collectors.groupingBy(
                Pessoa::getCargo,
                () -> new TreeMap<>(Comparator.reverseOrder()),
                toCollection(() -> new TreeSet<>(comparing(Pessoa::getNome)))));

    }
}
