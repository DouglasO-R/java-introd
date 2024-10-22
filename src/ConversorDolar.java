public class ConversorDolar {
    public static void main(String[] args) {
        double valorEmDolares = 100;
        double taxaDeConversao = 4.94;
        double valorEmReal = valorEmDolares * taxaDeConversao;

        System.out.println("R$ " + valorEmReal );
    }
}
