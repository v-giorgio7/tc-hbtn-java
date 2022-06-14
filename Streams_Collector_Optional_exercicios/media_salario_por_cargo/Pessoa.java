

public class Pessoa implements Comparable<Pessoa> {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setCargo(cargo);
        this.setIdade(idade);
        this.setSalario(salario);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s %d R$ %.6f",
                this.codigo,
                this.nome,
                this.cargo,
                this.idade,
                this.salario);
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.cargo.compareTo(pessoa.getNome());
    }
}
