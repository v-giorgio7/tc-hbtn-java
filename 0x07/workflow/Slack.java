public class Slack implements CanalNotificacao {
    @Override
    public String notificar(Mensagem mensagem) {
        return String.format("[SLACK] {%s} - %s", mensagem.getTipoMensagem(), mensagem.getTexto());
    }
}
