import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        int sortNumber = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);

        int tentativa = 0;
        int num = 0;

        while (tentativa < 5) {
            System.out.println("adivinhe o número da sorte ");
            num = leitura.nextInt();

            if (num > sortNumber){
                System.out.println("O seu número e maior que o numero da sorte ");
                tentativa++;
            }

            if (num < sortNumber){
                System.out.println("O seu número e menor que o numero da sorte");
                tentativa++;
            }

            if (num == sortNumber){
                System.out.println("Voce acertou o numero da sorte");
                break;
            }

            if (tentativa == 5 && num != sortNumber) {
                System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + sortNumber);
            }
        }


    }
}
