import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    List<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canal){
        this.canais.add(canal);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal : canais) {
            System.out.printf("%s - %s\n",
                    canal.notificar(new Mensagem(TipoMensagem.LOG, video.getArquivo())),
                    video.getFormato());
        }

    }
}
