import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int operacao = 0;

        while (operacao != 3) {
            System.out.println("Menu");
            System.out.println("1 - Calcular área do quadrado");
            System.out.println("2 - Calcular área do círculo");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            operacao = input.nextInt();

            if (operacao == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = input.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);

            } else if (operacao == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = input.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);

            } else if (operacao == 3) {
                System.out.println("Programa encerrado.");

            } else {
                System.out.println("Opção inválida. Tente novamente.");

            }
        }
    }
}
