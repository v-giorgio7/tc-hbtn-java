

import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> lista, int numero) {
        if (lista.contains(numero)) {
            return lista.indexOf(numero);
        }

        return -1;
    }

    public static void adicionarNumero(List<Integer> numeros, int i) throws Exception {
        if (buscarPosicaoNumero(numeros, i) != -1) {
            throw new Exception("Numero jah contido na lista");
        } else {
            numeros.add(i);
        }
    }

    public static void removerNumero(List<Integer> numeros, Integer i) throws Exception {
        if (buscarPosicaoNumero(numeros, i) == -1) {
            throw new Exception("Numero nao encontrado na lista");
        } else {
            numeros.remove(i);
        }
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        if (buscarPosicaoNumero(numeros, numeroSubstituir) == -1) {
            numeros.add(numeroSubstituto);
        } else {
            numeros.set(numeros.indexOf(numeroSubstituir), numeroSubstituto);
        }
    }
}
