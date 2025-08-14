import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scan.nextInt();
        int soma = 0;
        int numero = 1;

        for (int i = 0; i < n; i++) {
            soma += numero;
            numero += 2;
        }

        System.out.println("Soma: " + soma);
        scan.close();
    }
}
