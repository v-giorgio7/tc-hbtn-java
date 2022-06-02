

public class ArmazemDeComida<T extends Comida> extends Armazem<T> {

    public ArmazemDeComida(){
        super();
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
