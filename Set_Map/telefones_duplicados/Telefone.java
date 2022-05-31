

import java.util.Objects;

public class Telefone implements Comparable<Telefone>{
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
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

    @Override
    public int compareTo(Telefone o) {
        return this.numero.compareTo(o.getNumero());
    }
}
