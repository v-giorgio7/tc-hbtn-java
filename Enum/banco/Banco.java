

import java.util.ArrayList;

public class Banco {

    private final String nome;
    private final ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        agencias = new ArrayList<Agencia>();
    }

    private Agencia buscarAgencia(String nomeAgencia) {
        for (Agencia agencia : agencias) {
            if (agencia.getNome().equals(nomeAgencia)) {
                return agencia;
            }
        }

        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        if (this.buscarAgencia(nomeAgencia) != null) {
            return false;
        }

        this.agencias.add(new Agencia(nomeAgencia));
        return true;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double transacao) {
        if (this.buscarAgencia(nomeAgencia) == null) {
            return false;
        }

        if (this.buscarAgencia(nomeAgencia).buscarCliente(nomeCliente) == null) {
            this.buscarAgencia(nomeAgencia).novoCliente(nomeCliente, transacao);
            return true;
        }

        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double transacao) {
        if (this.buscarAgencia(nomeAgencia) == null) {
            return false;
        }

        if (this.buscarAgencia(nomeAgencia).buscarCliente(nomeCliente) == null) {
            return false;
        }

        this.buscarAgencia(nomeAgencia).adicionarTransacaoCliente(nomeCliente, transacao);
        return true;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacoes) {
        if (this.buscarAgencia(nomeAgencia) == null) {
            return false;
        }

        ArrayList<Cliente> clientes = this.buscarAgencia(nomeAgencia).getClientes();

        for (Cliente cliente : clientes) {
            System.out.printf("Cliente: %s [%d]\n", cliente.getNome(), clientes.indexOf(cliente) + 1);

            if (imprimeTransacoes) {
                ArrayList<Double> transacoes = cliente.getTransacoes();
                for (Double transacao : transacoes) {
                    String valor = String.format("%.2f", transacao).replace(".", ",");
                    System.out.printf("  [%d] valor %s\n", transacoes.indexOf(transacao) + 1, valor);
                }
            }
        }

        return true;
    }

    public String getNome() {
        return nome;
    }
}
