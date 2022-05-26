package provedores;

public class Loggi implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor) {
        if (peso > 5000.0) {
            return new Frete(valor * 0.12, this.obterTipoProvedorFrete());
        } else {
            return new Frete(valor * 0.04, this.obterTipoProvedorFrete());
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
