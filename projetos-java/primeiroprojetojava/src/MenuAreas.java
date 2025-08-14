import java.util.Scanner;

public class MenuAreas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.print("Escolha uma opção: ");
        int opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.print("Digite o lado do quadrado: ");
            double lado = scan.nextDouble();
            System.out.println("Área do quadrado: " + (lado * lado));
        } else if (opcao == 2) {
            System.out.print("Digite o raio do círculo: ");
            double raio = scan.nextDouble();
            System.out.println("Área do círculo: " + (Math.PI * raio * raio));
        } else {
            System.out.println("Opção inválida!");
        }
        scan.close();
    }
}
