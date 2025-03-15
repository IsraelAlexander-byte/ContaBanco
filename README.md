# ContaBanco - Projeto de Cadastro de Conta Bancária

## Descrição

Este é um projeto simples de cadastro de conta bancária, desenvolvido como parte de uma atividade de aprendizado. O programa solicita informações ao usuário sobre a conta bancária e exibe uma mensagem de boas-vindas com os dados fornecidos. O objetivo deste projeto é demonstrar o uso de entrada de dados e manipulação de strings no Java.

## Funcionalidades

O programa realiza as seguintes ações:

1. Solicita ao usuário o **número da conta**.
2. Solicita ao usuário o **número da agência**.
3. Solicita ao usuário o **nome completo do cliente**.
4. Solicita ao usuário o **saldo da conta**.
5. Após a inserção dos dados, o sistema exibe uma mensagem personalizada com as informações fornecidas.

### Exemplo de Execução:

Digite o número da conta: 1021 Digite o número da agência: 067-8 Digite o nome do cliente: MARIA ANDRADE Digite o saldo da conta: 500.00



**Saída:**
Olá MARIA ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo R$ 500.0 já está disponível para saque.

csharp
Copiar
Editar

## Estrutura do Código

### Classe `ContaTerminal.java`

- **Objetivo:** Esta classe contém a lógica principal do programa. Ela utiliza a classe `Scanner` para capturar dados inseridos pelo usuário e depois exibe uma mensagem personalizada com as informações fornecidas.
  
### Passos no Código:

1. **Captura de dados:** O programa solicita informações do usuário através do terminal (número da conta, agência, nome e saldo).
2. **Exibição de dados:** Após a coleta das informações, a classe exibe uma mensagem de boas-vindas com os dados inseridos.
  
### Código:

```java
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
Como Usar

cd ContaBanco
Compile o código Java:


javac ContaTerminal.java
Execute o programa:


java ContaTerminal
Siga as instruções no terminal para inserir os dados da conta.

Tecnologias Utilizadas
Java 8 ou superior
Scanner (para entrada de dados no terminal)
Contribuições
Sinta-se à vontade para contribuir com melhorias ou sugerir mudanças. Para isso, basta fazer um fork do projeto, realizar as alterações e criar um pull request.
