public class Video {
    private String arquivo;
    private FormatoVideo formato;

    public Video(String s, FormatoVideo formato) {
        this.arquivo = s;
        this.formato = formato;
    }

    public String getArquivo() {
        return arquivo;
    }

    public FormatoVideo getFormato() {
        return formato;
    }
}
