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
        Scanner entrada = new Scanner(System.in);
        String opcao = "";

        while (!opcao.equalsIgnoreCase("1")) {

            System.out.println("Digite 1 para encerrar ou qualquer tecla para iniciar a busca");
            opcao = entrada.nextLine();

            if (opcao.equalsIgnoreCase("1")) {
                System.out.println("Encerrando o sistemas até logo");
                break;
            }

            System.out.println("Digite um CEP ex:(12345-678)");
            String cep = entrada.nextLine();

            while (!validando.validaCep(cep)) {
                System.out.println("Coloque um cep valido ex:(12345-678) ");
                cep = entrada.nextLine();
            }
            String urlApiCep = "https://viacep.com.br/ws/" + cep + "/json";
            String json = conexao.connectionApi(urlApiCep);

            EnderecoCepJson meuCep = gson.fromJson(json, EnderecoCepJson.class);
            Endereco meuEndeco = new Endereco(meuCep);
            listEndereco.add(meuEndeco);
            criarArquivo(listEndereco);

            System.out.println(meuEndeco);
            System.out.println("______________________________________________________________");
        }

    }

}







