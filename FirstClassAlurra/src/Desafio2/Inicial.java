package Desafio2;

import java.util.Collections;
import java.util.Scanner;

import static Desafio2.Validar.*;

public class Inicial {
    public static void main(String[] args) {

       // Scanner valorDigitadoUsuario = new Scanner(System.in);
        System.out.println("Digite o limite do cartão ");
        double limite = validaDouble();

        Cartao saldoCartao =new Cartao(limite);

        int opcaoEscolhida = 1;

        while (opcaoEscolhida != 0 ){

            System.out.println("Digite a descrição da compra ");
            String descricaoProduto = validaString();

            System.out.println("Digite o valor da compra ");
            double valorProduto = validaDouble();

            Produtos produtosList = new Produtos(descricaoProduto, valorProduto);
            boolean compraEfetuada = saldoCartao.verificaSaldoCartao(produtosList);

            if (compraEfetuada) {
                opcaoEscolhida = validaInteiro();
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

