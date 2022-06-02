

public class ArmazemDeEletronico<T extends Eletronico> extends Armazem<T>{
    public ArmazemDeEletronico(){
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
