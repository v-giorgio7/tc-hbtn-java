

public class Gerente extends Empregado{
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double diferencaParcialBonus = 0.01 *
                (departamento.getValorAtingidoMeta() - departamento.getValorMeta());

        if (departamento.alcancouMeta())
            return this.getSalarioFixo() * 0.2 + diferencaParcialBonus;

        return 0.0;
    }
}
