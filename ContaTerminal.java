package Dio.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os dados do usuário
        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        // Consumir a quebra de linha pendente
        scanner.nextLine(); 

        System.out.println("Digite o nome do cliente:");
        String nomeCompleto = scanner.nextLine(); // Captura o nome completo

        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem formatada
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
                + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
