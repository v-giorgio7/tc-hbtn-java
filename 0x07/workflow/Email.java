public class Email implements CanalNotificacao {

    @Override
    public String notificar(Mensagem mensagem) {
        return String.format("[EMAIL] {%s} - %s", mensagem.getTipoMensagem(), mensagem.getTexto());
    }
}
