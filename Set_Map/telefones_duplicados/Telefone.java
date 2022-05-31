

import java.util.Objects;

public class Telefone {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    /* para identificar os telefones repetidos de acordo com os numeros */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return numero.equals(telefone.numero);
    }

    /* para identificar os telefones repetidos de acordo com os numeros */
    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return String.format("(%s) %s", this.codigoArea, this.numero);
    }
}
