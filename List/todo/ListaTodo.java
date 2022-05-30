

import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    private List<Tarefa> tarefas;

    public ListaTodo() {
        tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws IllegalArgumentException {
        if (this.verificarExistencia(tarefa)) {
            throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
        }

        tarefas.add(tarefa);
    }

    public boolean verificarExistencia(Tarefa tarefaAVerificar) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == tarefaAVerificar.getIdentificador()
                || tarefa.getDescricao().equals(tarefaAVerificar.getDescricao())
            ) {
                return true;
            }
        }

        return false;
    }

    public boolean marcarTarefaFeita(int i) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == i) {
                tarefa.setEstahFeita(true);
                return true;
            }
        }

        return false;
    }

    public boolean desfazerTarefa(int i) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == i) {
                tarefa.setEstahFeita(false);
                return true;
            }
        }

        return false;
    }

    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isEstahFeita()) {
                System.out.print("[X]  ");
            } else {
                System.out.print("[ ]  ");
            }

            System.out.printf("Id: %d - Descricao: %s\n", tarefa.getIdentificador(), tarefa.getDescricao());
        }
    }

    public void fazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(true);
        }
    }

    public void desfazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(false);
        }
    }
}
