public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }

    public InteiroPositivo(String valor) {
        if (Integer.parseInt(valor) < 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = Integer.valueOf(valor);
    }

    public void setValor(Integer valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }

    public Integer getValor() {
        return this.valor;
    }

    public boolean ehPrimo() {
        if (this.valor == 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(this.valor); i++) {
            if (this.valor % i == 0) {
                return false;
            }
        }

        return true;
    }
}
