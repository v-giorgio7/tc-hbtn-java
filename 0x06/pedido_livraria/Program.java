import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        produtos.Livro livro1 = new produtos.Livro("Duna", 2017, "Brasil", 56.30, 680, "Frank Herbert", 1);
        produtos.Livro livro2 = new produtos.Livro("Um de nós está mentindo", 2018, "Brasil", 34.93, 384,
                "Karen Mcmanus", 1);
        produtos.Livro livro3 = new produtos.Livro("Mindset Milionário", 2021, "Brasil", 31.70, 272,
                "José Roberto Marques", 1);

        produtos.Dvd dvd1 = new produtos.Dvd("Anjos da Noite 5 - Guerras de Sangue", 2016, "Estados Unidos", 16.90,
                "Anna Foerster",
                "Ação", 91);
        produtos.Dvd dvd2 = new produtos.Dvd("Annabelle 2 - A Criação do Mal", 2017, "Brasil", 39.90,
                "Jame Wan e Peter Safran",
                "Terror",
                109);

        // Pedido 1
        ItemPedido[] itensPedido1 = new ItemPedido[]{
                new ItemPedido(livro1, 1),
                new ItemPedido(dvd2, 1)
        };

        // gambiarra:
        Pedido pedido1 = new Pedido(0, itensPedido1);
        String total1 = Double.toString(pedido1.calcularTotal());
        int commaIndex1 = total1.indexOf(".");
        total1 = total1.substring(0, commaIndex1 + 3);

        System.out.println("Total Pedido: " + total1.replace('.', ','));

        // Pedido 2
        ItemPedido[] itensPedido2 = new ItemPedido[]{
                new ItemPedido(livro1, 1),
                new ItemPedido(dvd2, 1)
        };

        // gambiarra:
        Pedido pedido2 = new Pedido(10, itensPedido2);
        String total2 = Double.toString(pedido2.calcularTotal());
        int commaIndex2 = total2.indexOf(".");
        total2 = total2.substring(0, commaIndex2 + 3);

        System.out.println("Total Pedido: " + total2.replace('.', ','));

        // Pedido 3
        ItemPedido[] itensPedido3 = new ItemPedido[]{
                new ItemPedido(livro2, 1),
                new ItemPedido(livro3, 2),
                new ItemPedido(dvd1, 1)
        };

        // gambiarra:
        Pedido pedido3 = new Pedido(5, itensPedido3);
        String total3 = Double.toString(pedido3.calcularTotal());
        int commaIndex3 = total3.indexOf(".");
        total3 = total3.substring(0, commaIndex3 + 3);

        System.out.println("Total Pedido: " + total3.replace('.', ','));
        // Pedido 4
        ItemPedido[] itensPedido4 = new ItemPedido[]{
                new ItemPedido(livro2, 1),
                new ItemPedido(livro2, 1),
                new ItemPedido(livro3, 2),
                new ItemPedido(dvd1, 1),
                new ItemPedido(dvd2, 2)
        };

        // gambiarra:
        Pedido pedido4 = new Pedido(5, itensPedido4);
        String total4 = Double.toString(pedido4.calcularTotal());
        int commaIndex4 = total4.indexOf(".");
        total4 = total4.substring(0, commaIndex4 + 3);

        System.out.println("Total Pedido: " + total4.replace('.', ','));
    }
}