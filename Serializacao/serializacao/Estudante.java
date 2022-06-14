import java.io.Serial;
import java.io.Serializable;

public class Estudante implements Serializable {
    @Serial
    private static final long serialVersionUID = 1842161927130585364L;

    private int idade;
    private String nome;
    private transient String senha;

    public Estudante(int idade, String nome, String senha) {
        this.setIdade(idade);
        this.setNome(nome);
        this.setSenha(senha);
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return String.format("Estudante { nome='%s', idade='%d', senha='%s' }",
                this.nome,
                this.idade,
                this.senha);
    }
}
