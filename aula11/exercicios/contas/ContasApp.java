package exercicios.contas;

import java.util.Scanner;

import exercicios.contas.dados.GerenciaContas;

public class ContasApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int numeroConta;
        double limite, valor;

        GerenciaContas contas = new GerenciaContas();

        while (opcao != 7) {
            System.out.println("1- Nova Conta Corrente");
            System.out.println("2- Nova Conta Poupança");
            System.out.println("3- Nova Conta Especial");
            System.out.println("4- Consultar Saldo");
            System.out.println("5- Depositar");
            System.out.println("6- Sacar");
            System.out.println("7- Sair");
            System.out.print("--> ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    contas.novaContaCorrente(numeroConta);                    
                    break;
                case 2:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;
                case 3:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    System.out.println("Informe o valor do limite:");
                    limite = scanner.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite);
                    break;
                case 4:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    System.out.println(contas.consultarSaldo(numeroConta));
                    break;
                case 5:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    System.out.println("Qual o valor do depósito: ");
                    valor = scanner.nextDouble();
                    if (contas.depositar(numeroConta, valor)) { // se o depósito foi feito
                        System.out.println("Sucesso");
                    } else { // se deu erro no depósito
                        System.out.println("Falha ao depositar.");
                    }
                    break;
                case 6:
                    System.out.println("Informe o número da conta");
                    numeroConta = scanner.nextInt();
                    System.out.println("Qual o valor do saque: ");
                    valor = scanner.nextDouble();
                    if (contas.sacar(numeroConta, valor)) { // se o depósito foi feito
                        System.out.println("Sucesso");
                    } else { // se deu erro no depósito
                        System.out.println("Falha ao sacar.");
                    }
                    break;
                case 7:
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scanner.close();
    }
}
