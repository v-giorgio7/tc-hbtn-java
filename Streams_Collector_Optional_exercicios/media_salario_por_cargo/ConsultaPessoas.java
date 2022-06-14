

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Collections.reverseOrder;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class ConsultaPessoas {

    static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa (
            List<Pessoa> pessoas) {

        return pessoas.stream().collect(groupingBy(
                Pessoa::getCargo,
                () -> new TreeMap<>(reverseOrder()),
                toCollection(() -> new TreeSet<>(comparing(Pessoa::getNome)))));

    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {

        return pessoas.stream().collect(groupingBy(
                Pessoa::getCargo,
                counting()
        ));
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(
            List<Pessoa> pessoas) {

        return pessoas.stream().collect(groupingBy(
                Pessoa::getCargo,
                groupingBy(Pessoa::getIdade, counting())));
    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoas) {

        return pessoas.stream().collect(groupingBy(
                Pessoa::getCargo,
                averagingDouble(Pessoa::getSalario)
        ));
    }
}
