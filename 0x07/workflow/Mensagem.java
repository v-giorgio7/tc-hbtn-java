public class Mensagem {
    private String texto;
    private TipoMensagem tipoMensagem;

    public Mensagem(TipoMensagem msg, String arquivo) {
        this.texto = arquivo;
        this.tipoMensagem = msg;
    }

    public String getTexto() {
        return texto;
    }

    public TipoMensagem getTipoMensagem() {
        return tipoMensagem;
    }
}
