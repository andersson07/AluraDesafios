package Desafio2;

import java.util.Collections;
import java.util.Scanner;

public class Inicial {
    public static void main(String[] args) {

        Scanner valorDigitadoUsuario = new Scanner(System.in);
        System.out.println("Digite o limite do cartão ");
        double limite = valorDigitadoUsuario.nextDouble();

        Cartao saldoCartao =new Cartao(limite);

        int opcaoEscolhida = 1;

        while (opcaoEscolhida != 0 ){

            System.out.println("Digite a descrição da compra ");
            String descricaoProduto = valorDigitadoUsuario.next();

            System.out.println("Digite o valor da compra ");
            double valorProduto = valorDigitadoUsuario.nextDouble();

            Produtos produtosList = new Produtos(descricaoProduto, valorProduto);
            boolean compraEfetuada = saldoCartao.verificaSaldoCartao(produtosList);

            if (compraEfetuada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                opcaoEscolhida = valorDigitadoUsuario.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                opcaoEscolhida = 0;
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(saldoCartao.getCompra());
        for (Produtos c : saldoCartao.getCompra()) {
            System.out.println(c.getNomeProduto() + " - " +c.getValorProduto());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +saldoCartao.getSaldo());

        }

    }

