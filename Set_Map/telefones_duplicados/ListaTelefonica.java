

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        this.listaTelefonica = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        if (this.listaTelefonica.containsKey(nome)) {
            if (this.listaTelefonica.get(nome).contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            } else {
                if (this.verificarSeNumeroExiste(telefone)){
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
                this.listaTelefonica.get(nome).add(telefone);
            }
        } else {
            HashSet<Telefone> novaListaNumeros = new HashSet<>();
            novaListaNumeros.add(telefone);
            this.listaTelefonica.put(nome, novaListaNumeros);
        }
    }

    private boolean verificarSeNumeroExiste(Telefone telefone) {
        Collection<HashSet<Telefone>> todosOsNumeros = this.listaTelefonica.values();
        for (HashSet<Telefone> numeros : todosOsNumeros) {
            if (numeros.contains(telefone)) {
                return true;
            }
        }
        return false;
    }

    public HashSet<Telefone> buscar(String nome) {
        if (this.listaTelefonica.containsKey(nome)) {
            return this.listaTelefonica.get(nome);
        }

        return null;
    }
}
