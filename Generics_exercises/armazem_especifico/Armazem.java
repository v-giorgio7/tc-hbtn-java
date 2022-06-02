

import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<T> implements Armazenavel<T> {
    protected Map<String, T> itens;

    public Armazem() {
        this.itens = new HashMap<String, T>();
    }

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        itens.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return this.itens.get(nome);
    }
}
