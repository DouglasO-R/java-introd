import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num = leitura.nextInt();

        if (num > 0){
            System.out.println("Numero positivo");
        }else if(num < 0) {
            System.out.println("Numero negativo");
        }
    }
}
