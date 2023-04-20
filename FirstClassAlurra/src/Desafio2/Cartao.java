package Desafio2;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limiteCartao;
   private double saldo;
    private List<Produtos> compra;


    public Cartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.saldo = limiteCartao;
        this.compra = new ArrayList<>();
    }

    public boolean verificaSaldoCartao(Produtos compra){
        if (this.saldo > compra.getValorProduto()){
            this.saldo -= compra.getValorProduto();
            this.compra.add(compra);
            return true;
        }else{
            return false;
        }

    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Produtos> getCompra() {
        return compra;
    }
}
