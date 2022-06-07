

import conta_basica.exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.saldo = 0;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException{
        if (valor <= 0)
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");

        this.saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0)
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");

        if (valor > this.saldo)
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");

        this.saldo -= valor;
    }

    public double calcularTarifaMensal() {
        return Math.min(this.saldo * 0.10, 10.0);
    }

    public double calcularJurosMensal() {
        if (this.saldo < 0) return 0;
        return (this.saldo * (this.taxaJurosAnual / 100.0)) / 12.0;
    }

    public void aplicarAtualizacaoMensal() {
        this.saldo = this.getSaldo() - calcularTarifaMensal() + calcularJurosMensal();
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }


}
