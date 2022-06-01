import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {
    List<T> listaMidia;

    public Biblioteca() {
        listaMidia = new ArrayList<T>();
    }

    public void adicionarMidia(T midia) {
        this.listaMidia.add(midia);
    }

    public List<T> obterListaMidias() {
        return this.listaMidia;
    }

}
