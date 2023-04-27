package Desafio3;


import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Desafio3.CriaAqruivo.criarArquivo;

public class consultaCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConexaoApi conexao = new ConexaoApi();
        ValidarCep validando = new ValidarCep();
        List<Endereco> listEndereco = new ArrayList<>();
        Gson gson = new Gson();
        String cep= "";

            do {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Coloque um cep para buscar (12345-678) ou digite 1 para encerrar");
                cep = entrada.nextLine();

                while (!validando.validaCep(cep)) {
                    System.out.println("Coloque um cep valido");
                    cep = entrada.nextLine();
                }

                String urlApiCep = "https://viacep.com.br/ws/" + cep + "/json";
                String json = conexao.connectionApi(urlApiCep);

                EnderecoCepJson meuCep = gson.fromJson(json, EnderecoCepJson.class);
                Endereco meuEndeco = new Endereco(meuCep);
                listEndereco.add(meuEndeco);
                criarArquivo(listEndereco);

                System.out.println(meuEndeco);


            }while (!cep.equalsIgnoreCase("1"));

    }

}
