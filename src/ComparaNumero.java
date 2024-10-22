import java.util.Scanner;

public class ComparaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println("primeiro número maior que segundo número");
        }else {
            System.out.println(" segundo número maior que primeiro  número");
        }
    }
}
