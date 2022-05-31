

import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        this.listaTelefonica = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        if (this.listaTelefonica.containsKey(nome)) {
            this.listaTelefonica.get(nome).add(telefone);
        } else {
            ArrayList<Telefone> novaListaNumeros = new ArrayList<>();
            novaListaNumeros.add(telefone);
            this.listaTelefonica.put(nome, novaListaNumeros);
        }
    }

    public ArrayList<Telefone> buscar(String nome) {
        if (this.listaTelefonica.containsKey(nome)) {
            return this.listaTelefonica.get(nome);
        }

        return null;
    }
}
