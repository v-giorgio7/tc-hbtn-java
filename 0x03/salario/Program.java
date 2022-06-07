

public class Program {
    public static void main(String[] args) {
        Departamento departamentoEngenharia = new Departamento(1000, 1100);
        Departamento departamentoDocumentacao = new Departamento(1000, 800);

        Empregado empregadoEngenharia1 = new Empregado(2300);
        Empregado empregadoEngenharia2 = new Empregado(3650);
        Gerente gerenteEngenharia = new Gerente(5800);

        Empregado empregadoDocumentacao1 = new Empregado(2500);
        Empregado empregadoDocumentacao2 = new Empregado(3000);
        Gerente gerenteDocumentacao = new Gerente(4980);

        System.out.printf("Salario Fixo: %s - Salario Total: %s - Valor Bonus: %s\n",
                convertDouble(empregadoEngenharia1.getSalarioFixo()),
                convertDouble(empregadoEngenharia1.calcularSalarioTotal(departamentoEngenharia)),
                convertDouble(empregadoEngenharia1.calcularBonus(departamentoEngenharia)));

        System.out.printf("Salario Fixo: %s - Salario Total: %s - Valor Bonus: %s\n",
                convertDouble(empregadoEngenharia2.getSalarioFixo()),
                convertDouble(empregadoEngenharia2.calcularSalarioTotal(departamentoEngenharia)),
                convertDouble(empregadoEngenharia2.calcularBonus(departamentoEngenharia)));

        System.out.printf("Salario Fixo: %s - Salario Total: %s - Valor Bonus: %s\n",
                convertDouble(gerenteEngenharia.getSalarioFixo()),
                convertDouble(gerenteEngenharia.calcularSalarioTotal(departamentoEngenharia)),
                convertDouble(gerenteEngenharia.calcularBonus(departamentoEngenharia)));

        System.out.printf("Salario Fixo: %s - Salario Total: %s - Valor Bonus: %s\n",
                convertDouble(empregadoDocumentacao1.getSalarioFixo()),
                convertDouble(empregadoDocumentacao1.calcularSalarioTotal(departamentoDocumentacao)),
                convertDouble(empregadoDocumentacao1.calcularBonus(departamentoDocumentacao)));


        System.out.printf("Salario Fixo: %s - Salario Total: %s - Valor Bonus: %s\n",
                convertDouble(empregadoDocumentacao2.getSalarioFixo()),
                convertDouble(empregadoDocumentacao2.calcularSalarioTotal(departamentoDocumentacao)),
                convertDouble(empregadoDocumentacao2.calcularBonus(departamentoDocumentacao)));

        System.out.printf("Salario Fixo: %s - Salario Total: %s - Valor Bonus: %s\n",
                convertDouble(gerenteDocumentacao.getSalarioFixo()),
                convertDouble(gerenteDocumentacao.calcularSalarioTotal(departamentoDocumentacao)),
                convertDouble(gerenteDocumentacao.calcularBonus(departamentoDocumentacao)));
    }

    private static String convertDouble(Double valor) {
        String valorStr = String.format("%s", valor);
        return valorStr.replace('.', ',');
    }
}
