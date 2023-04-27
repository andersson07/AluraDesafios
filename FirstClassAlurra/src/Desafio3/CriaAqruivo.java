package Desafio3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CriaAqruivo {
       static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static void criarArquivo(List<Endereco> meuEndereco) throws IOException {
        FileWriter file = new FileWriter("c:\\javatexto\\endereço.json");
        file.write(gson.toJson(meuEndereco));
        System.out.println("arquivo criado com sucesso!");
        file.close();

    }
}
