

public class Eletronico {

    private String descricao;
    private double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        String valorFormatado = this.doubleFormatter(this.valor);
        return "[" + this.descricao + "] R$ " + valorFormatado;
    }

    private String doubleFormatter(Double itemToBeFormatted) {
        String formattedItem = String.format("%.6f", itemToBeFormatted)
                .replace(".", ",");
        return formattedItem;
    }
}
