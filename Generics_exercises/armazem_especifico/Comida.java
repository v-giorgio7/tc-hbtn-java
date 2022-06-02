

public class Comida {

    private String nome;
    private double calorias;
    private double preco;

    public Comida(String nome, double calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        String caloriasFormatado = this.doubleFormatter(this.calorias);
        String precoFormatado = this.doubleFormatter(this.preco);
        return "[" + this.nome + "] " + caloriasFormatado + " R$ " + precoFormatado;
    }

    private String doubleFormatter(Double itemToBeFormatted) {
        String formattedItem = String.format("%.6f", itemToBeFormatted)
                .replace(".", ",");

        return formattedItem;
    }
}
