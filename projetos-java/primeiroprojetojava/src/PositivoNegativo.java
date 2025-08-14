import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = scan.nextDouble();

        if (num > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
        scan.close();
    }
}
