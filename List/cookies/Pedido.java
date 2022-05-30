
import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {

    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        this.cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie pedido : this.cookies) {
            total += pedido.getQuantidadeCaixas();
        }

        return total;
    }

    public int removerSabor(String sabor) {
        Iterator<PedidoCookie> iterator = this.cookies.iterator();
        int total = 0;

        while(iterator.hasNext()) {
            PedidoCookie pedido = iterator.next();
            if (pedido.getSabor().equals(sabor)) {
                total += pedido.getQuantidadeCaixas();
                iterator.remove();
            }
        }

        return total;
    }
}
