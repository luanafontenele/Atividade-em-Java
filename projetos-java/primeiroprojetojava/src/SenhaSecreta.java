import java.util.Scanner;

public class SenhaSecreta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senhaCorreta = "Java123";
        String senhaDigitada = "";

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            senhaDigitada = scan.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta, tente novamente.");
            }
        }

        System.out.println("Acesso permitido!");
        scan.close();
    }
}

