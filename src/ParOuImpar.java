import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o numero e descubra se e par ou impar: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}