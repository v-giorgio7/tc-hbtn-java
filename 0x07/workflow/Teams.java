public class Teams implements CanalNotificacao {

    @Override
    public String notificar(Mensagem mensagem) {
        return String.format("[TEAMS] {%s} - %s", mensagem.getTipoMensagem(), mensagem.getTexto());
    }
}
