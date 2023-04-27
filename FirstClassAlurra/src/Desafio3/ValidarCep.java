package Desafio3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarCep {
    public static boolean validaCep(String cep) {
        Pattern pattern = Pattern.compile("\\d{5}-\\d{3}");
        Matcher matcher = pattern.matcher(cep);
        return matcher.matches();
    }
}
