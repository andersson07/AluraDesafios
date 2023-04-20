package Desafio2;

import java.util.HashMap;
import java.util.Map;

public class Produtos implements Comparable<Produtos> {
    private String nomeProduto;
    private double valorProduto;

    public Produtos(String nomeProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    @Override
    public String toString() {
        return "Compra: descricao = " + nomeProduto +
                " valor =" + valorProduto;
    }
    @Override
    public int compareTo(Produtos novaCompra) {
        return Double.valueOf(this.valorProduto).compareTo(Double.valueOf(novaCompra.valorProduto));
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }


}
