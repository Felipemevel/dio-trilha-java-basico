import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:
        // Importação da classe scanner
        // Exibição de mensagens
        // Obter dados pelo scanner
        // Criar condicionais para verificação
        // Exibir dados inseridos

        var scanner = new Scanner (System.in);
        System.out.println("Olá! Seja bem vindo ao Santander! Por favor, nos forneça os dados abaixo.");

        System.out.println("Qual é o seu nome e sobrenome?");
        var nome = scanner.nextLine();

        System.out.println("Agência: ");

        int agencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Conta: ");
        String conta = scanner.nextLine();

        double saldo = 400.00;

        if (String.valueOf(agencia).length() < 3 || String.valueOf(agencia).length() >= 5) System.out.println("Agência inválida.");

        if (conta.length() != 5) System.out.println("Conta inválida.");

        System.out.printf("Olá, %s! Muitas boas vindas ao Santander! Esses são os dados da sua conta:\nAgência: %s\nConta: %s \nSaldo disponível para saque: R$ %.2f", nome, agencia, conta, saldo);


        scanner.close();
    }
}