

import java.util.ArrayList;
import java.util.Objects;

public class Celular {

    private ArrayList<Contato> contatos = new ArrayList<>();

    public int obterPosicaoContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contatos.indexOf(contato);
            }
        }

        return -1;
    }

    public void adicionarContato(Contato contato) throws Exception {
        if (this.obterPosicaoContato(contato.getNome()) != -1) {
            throw new Exception("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }

        this.contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws Exception {
        if (this.obterPosicaoContato(contatoAntigo.getNome()) == -1) {
            throw new Exception("Nao foi possivel modificar contato. Contato nao existe");
        }


        if (!Objects.equals(contatoAntigo.getNome(), novoContato.getNome())) {
             throw new Exception("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }

        this.contatos.set(this.obterPosicaoContato(contatoAntigo.getNome()), novoContato);
    }

    public void removerContato(Contato contato) throws Exception {
        if (this.obterPosicaoContato(contato.getNome()) == -1) {
            throw new Exception("Nao foi possivel remover contato. Contato nao existe");
        }

        this.contatos.remove(this.obterPosicaoContato(contato.getNome()));
    }

    public void listarContatos() {
        for (Contato contato : this.contatos) {
            System.out.printf("%s -> %s (%s)\n",
                    contato.getNome(), contato.getNumeroTelefone(), contato.getTipoNumero());
        }
    }
}
