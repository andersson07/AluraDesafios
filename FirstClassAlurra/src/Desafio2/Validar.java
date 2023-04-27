package Desafio2;

import java.util.Scanner;

public class Validar {

    // System.out.println("Digite o limite do cartão ");
    public static double validaDouble() {
        Scanner valorDigitadoUsuario = new Scanner(System.in);
        double valorDoubleValidado;
        while (true) {
            try {
                valorDoubleValidado = valorDigitadoUsuario.nextDouble() ;
                break;
            } catch (Exception e) {
                valorDigitadoUsuario.nextLine();
                System.out.println("Entrada inválida, digite apenas numeros");
            }
        }
        return valorDoubleValidado;
    }

    public static String validaString() {
        Scanner valorDigitadoUsuario = new Scanner(System.in);
        String valorStringValidado;
        while (true) {
            try {
                valorStringValidado = valorDigitadoUsuario.nextLine() ;
                if (isNumero(valorStringValidado)) {
                    break;
                }
            } catch (Exception e) {
                valorDigitadoUsuario.nextLine();
                System.out.println("Entrada inválida, digite apenas letras");
            }
        }
        return valorStringValidado;

    }

    public static boolean isNumero(String valor) {
           try {
               Double.parseDouble(valor);
               return false;
           }catch (Exception e){
               return true;
           }
    }

    public static int validaInteiro() {
        Scanner valorDigitadoUsuario = new Scanner(System.in);
        int valorIntValidado;
        while (true) {
            try {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                valorIntValidado = valorDigitadoUsuario.nextInt();
                break;
            } catch (Exception e) {
                valorDigitadoUsuario.nextLine();
                System.out.println("Entrada inválida, digite apenas numeros");
            }
        }
        return valorIntValidado;
    }
}
