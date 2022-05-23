public class NumerosPares {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0 && i + 2 >= 100) System.out.print(i + "\n");
            else if (i % 2 == 0) System.out.print(i + ", ");
        }
    }
}
