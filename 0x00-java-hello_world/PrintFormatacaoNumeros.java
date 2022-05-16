import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale ptBr = new Locale("pt", "BR");
        String valorString = NumberFormat.getCurrencyInstance(ptBr).format(valor);
        String valorFormatado= valorString.substring(0,8) + '.' + valorString.substring(9);
        String valorFormatadoFinal = valorFormatado.substring(0,4) + ',' + valorFormatado.substring(5);
        System.out.printf("Valor: %s\nTaxa: %.2f%%", valorFormatadoFinal, taxa);
    }
}