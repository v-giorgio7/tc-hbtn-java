

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] listaNumeros) {
        Set<Integer> numerosDaLista = new HashSet<>();
        TreeSet<Integer> numerosRepetidos = new TreeSet<>();

        for (int numero : listaNumeros) {
            if (numerosDaLista.contains(numero)) {
                numerosRepetidos.add(numero);
            }
            numerosDaLista.add(numero);
        }

        return numerosRepetidos;
    }
}
