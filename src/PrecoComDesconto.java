public class PrecoComDesconto {
    public static void main(String[] args) {
        double precoOriginal = 49.50;
        double percentualDesconto = 10;
        double valorDesconto = (precoOriginal * percentualDesconto)/100;
        double precoComDesconto = precoOriginal - valorDesconto;

        System.out.println("preco com desconto: R$ " + precoComDesconto );
    }
}
