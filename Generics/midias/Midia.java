public class Midia {
    private String nome;

    public Midia(String nome) {
        this.nome = nome;
    }

    private String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s - Nome: %s",
                this.getClass().getName(),
                getNome());
    }

}
