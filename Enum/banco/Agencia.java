

import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nome, double transacao) {
        if (this.buscarCliente(nome) != null) {
            return false;
        }

        this.clientes.add(new Cliente(nome, transacao));
        return true;
    }

    public Cliente buscarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }

        return null;
    }

    public boolean adicionarTransacaoCliente(String nome, double transacao) {
        if (this.buscarCliente(nome) == null) {
            return false;
        }

        this.buscarCliente(nome).adicionarTransacao(transacao);
        return true;
    }
}
