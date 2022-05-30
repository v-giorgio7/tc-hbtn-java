

public class Tarefa {
    private String descricao;
    private int identificador;
    private boolean estahFeita;

    public Tarefa(String descricao, int i) throws Exception {
        if (descricao == null || descricao.equals("")) {
            throw new Exception("Descricao de tarefa invalida");
        }
        this.descricao = descricao;
        this.identificador = i;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void modificarDescricao(String descricao) throws Exception {
        if (descricao == null || descricao.equals("")) {
            throw new Exception("Descricao de tarefa invalida");
        }

        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }
}
