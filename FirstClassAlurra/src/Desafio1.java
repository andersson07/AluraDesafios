import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        String nome = "Anderson Silva";
        String conta = "Corrente";
        double saldoInicial = 2500;

        System.out.println("************************ ");
        System.out.println("\nNome do cliente " + nome);
        System.out.println("Tipo da conta " + conta);
        System.out.println("Saldo da conta " + saldoInicial);
        System.out.println("\n************************ ");

        Scanner valorDigitado = new Scanner(System.in);
        int opcaoSelecionada;

        do {
            String menu = getMenuString();
            System.out.println(menu);
            opcaoSelecionada = valorDigitado.nextInt();
            realizaOperacao(opcaoSelecionada, saldoInicial, valorDigitado);
        } while (opcaoSelecionada != 4);
    }

    private static void realizaOperacao(int opcao, double saldo, Scanner valorDigitado) {

        switch (opcao) {
            case 1:
                System.out.println("Seu saldo atual é " + saldo);
                break;
            case 2:
                System.out.println("Informe o valor que será transferido");
                double valorTransferencia = valorDigitado.nextDouble();
                if (valorTransferencia > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Novo saldo de sua conta " + saldo);
                }
                break;
            case 3:
                System.out.println("Informe o valor a ser depositado");
                double valorDeposito = valorDigitado.nextDouble();
                saldo += valorDeposito;
                System.out.println("Novo saldo de sua conta " + saldo);
                break;
            case 4:
                System.out.println("Obrigado por utilizar nossos serviços!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private static String getMenuString() {
        return """
                *** Digite uma opção ***
                   1 - Consultar saldo
                   2 - Transferência 
                   3 - Depósito 
                   4 - Sair
                """;
    }
}

