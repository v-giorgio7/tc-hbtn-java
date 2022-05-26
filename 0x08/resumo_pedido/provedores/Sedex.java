package provedores;

public class Sedex implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor) {
        if (peso > 1000.0) {
            return new Frete(valor * 0.1, this.obterTipoProvedorFrete());
        } else {
            return new Frete(valor * 0.05, this.obterTipoProvedorFrete());
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
