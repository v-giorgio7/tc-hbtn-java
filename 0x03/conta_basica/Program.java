

public class Program {
    public static void main(String[] args) {
        try {
            ContaBancariaBasica conta1 = new ContaBancariaBasica("AAA", 50.0);
            System.out.printf("Conta %s - saldo: %s\n", conta1.getNumeracao(), convertDouble(conta1.getSaldo()));
            conta1.depositar(100);
            System.out.printf("Conta %s - saldo: %s\n", conta1.getNumeracao(), convertDouble(conta1.getSaldo()));
            conta1.sacar(25);
            System.out.printf("Conta %s - saldo: %s\n", conta1.getNumeracao(), convertDouble(conta1.getSaldo()));
            conta1.aplicarAtualizacaoMensal();
            System.out.printf("Conta %s - saldo: %s\n\n", conta1.getNumeracao(), convertDouble(conta1.getSaldo()));
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            ContaBancariaBasica conta2 = new ContaBancariaBasica("BBB", 100.0);
            System.out.printf("Conta %s - saldo: %s\n", conta2.getNumeracao(), convertDouble(conta2.getSaldo()));
            conta2.depositar(10);
            System.out.printf("Conta %s - saldo: %s\n", conta2.getNumeracao(), convertDouble(conta2.getSaldo()));
            conta2.sacar(10);
            System.out.printf("Conta %s - saldo: %s\n", conta2.getNumeracao(), convertDouble(conta2.getSaldo()));
            conta2.aplicarAtualizacaoMensal();
            System.out.printf("Conta %s - saldo: %s\n\n", conta2.getNumeracao(), convertDouble(conta2.getSaldo()));
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            ContaBancariaBasica conta3 = new ContaBancariaBasica("CCC", 120.0);
            System.out.printf("Conta %s - saldo: %s\n", conta3.getNumeracao(), convertDouble(conta3.getSaldo()));
            conta3.depositar(1600);
            System.out.printf("Conta %s - saldo: %s\n", conta3.getNumeracao(), convertDouble(conta3.getSaldo()));
            conta3.aplicarAtualizacaoMensal();
            System.out.printf("Conta %s - saldo: %s\n\n", conta3.getNumeracao(), convertDouble(conta3.getSaldo()));
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            ContaBancariaBasica conta4 = new ContaBancariaBasica("DDD", 70.0);
            System.out.printf("Conta %s - saldo: %s\n", conta4.getNumeracao(), convertDouble(conta4.getSaldo()));
            conta4.depositar(0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            ContaBancariaBasica conta5 = new ContaBancariaBasica("EEE", 50.0);
            System.out.printf("Conta %s - saldo: %s\n", conta5.getNumeracao(), convertDouble(conta5.getSaldo()));
            conta5.depositar(25);
            System.out.printf("Conta %s - saldo: %s\n", conta5.getNumeracao(), convertDouble(conta5.getSaldo()));
            conta5.sacar(30);
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }
    }

    private static String convertDouble(Double valor) {
        String valorStr = String.format("%.2f", valor);
        return valorStr.replace('.', ',');
    }
}
