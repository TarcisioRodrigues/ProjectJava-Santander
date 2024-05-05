import java.util.Scanner;

public class Main {
    private static double saldo = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;

        while (executando) {
            exibirMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    depositar();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    verificarSaldo();
                    break;
                case 4:
                    System.out.println("Sessão encerrada.");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Verificar Saldo");
        System.out.println("4. Sair");
    }

    private static void depositar() {
        System.out.print("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    private static void sacar() {
        System.out.print("Digite o valor a ser sacado: ");
        double valor = scanner.nextDouble();
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        }
    }

    private static void verificarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
