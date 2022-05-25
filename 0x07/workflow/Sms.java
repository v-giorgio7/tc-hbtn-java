public class Sms implements CanalNotificacao {

    @Override
    public String notificar(Mensagem mensagem) {
        return String.format("[SMS] {%s} - %s", mensagem.getTipoMensagem(), mensagem.getTexto());
    }
}
