import java.io.*;
import java.util.List;

public class SerializarEstudantes<T> {

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.setNomeArquivo(nomeArquivo);
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    private void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> listaEstudantes) {
        try {
            FileOutputStream fileOut = new FileOutputStream(this.nomeArquivo);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(listaEstudantes);
            objectOut.close();

        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        try {
            FileInputStream fileInp = new FileInputStream(this.nomeArquivo);
            ObjectInputStream objectInp = new ObjectInputStream(fileInp);

            List<Estudante> listaDesserializada = (List<Estudante>) objectInp.readObject();

            return listaDesserializada;

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        }

        return null;
    }
}
