

public class Program {
    public static void main(String[] args) {
        try {
            ContaBancariaTarifada conta1 = new ContaBancariaTarifada("AAA", 30.0);
            System.out.printf("Conta %s - saldo: %s\n", conta1.getNumeracao(), convertDouble(conta1.getSaldo()));
            conta1.depositar(125);
            System.out.printf("Conta %s - saldo: %s\n", conta1.getNumeracao(), convertDouble(conta1.getSaldo()));
            conta1.sacar(30);
            System.out.printf("Conta %s - saldo: %s\n", conta1.getNumeracao(), convertDouble(conta1.getSaldo()));
            conta1.depositar(10);
            System.out.printf("Conta %s - saldo: %s\n", conta1.getNumeracao(), convertDouble(conta1.getSaldo()));
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            ContaBancariaControlada conta2 = new ContaBancariaControlada("BBB", 30.0, 20, 5);
            System.out.printf("Conta %s - saldo: %s\n", conta2.getNumeracao(), convertDouble(conta2.getSaldo()));
            conta2.depositar(125);
            System.out.printf("Conta %s - saldo: %s\n", conta2.getNumeracao(), convertDouble(conta2.getSaldo()));
            conta2.sacar(105);
            System.out.printf("Conta %s - saldo: %s\n", conta2.getNumeracao(), convertDouble(conta2.getSaldo()));
            conta2.aplicarAtualizacaoMensal();
            System.out.printf("Conta %s - saldo: %s\n", conta2.getNumeracao(), convertDouble(conta2.getSaldo()));
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            ContaBancariaControlada conta3 = new ContaBancariaControlada("CCC", 30.0, 20, 5);
            System.out.printf("Conta %s - saldo: %s\n", conta3.getNumeracao(), convertDouble(conta3.getSaldo()));
            conta3.depositar(125);
            System.out.printf("Conta %s - saldo: %s\n", conta3.getNumeracao(), convertDouble(conta3.getSaldo()));
            conta3.sacar(106);
            System.out.printf("Conta %s - saldo: %s\n", conta3.getNumeracao(), convertDouble(conta3.getSaldo()));
            conta3.aplicarAtualizacaoMensal();
            System.out.printf("Conta %s - saldo: %s\n", conta3.getNumeracao(), convertDouble(conta3.getSaldo()));
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }
    }

    private static String convertDouble(Double valor) {
        String valorStr = String.format("%.2f", valor);
        return valorStr.replace('.', ',');
    }

}
