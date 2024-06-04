import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e capturar os dados da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final
        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}
