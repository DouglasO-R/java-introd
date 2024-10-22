import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iterador = 0;

        System.out.print("Digite o valor da tabuada ");
        int numero = input.nextInt();

        while (iterador <= 10) {
            int valor = iterador * numero;
            System.out.println(numero + " x " + iterador + " = " + valor);
            iterador++;
        }
    }
}
