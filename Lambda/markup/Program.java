

public class Program {
    public static void main(String[] args) {
        Produto produto1 = new Produto(129.99, "Mouse Gamer");

        System.out.printf("%s - %s - %s\n", produto1.getNome(),
                convertDouble(produto1.getPreco()),
                convertDouble(produto1.precoComMarkUp.get()));

        produto1.atualizarMarkUp.accept(15d);

        System.out.printf("%s - %s - %s\n", produto1.getNome(),
                convertDouble(produto1.getPreco()),
                convertDouble(produto1.precoComMarkUp.get()));
    }

    private static String convertDouble(Double valor) {
        String valorStr = String.format("%.2f", valor);
        return valorStr.replace('.', ',');
    }

}
