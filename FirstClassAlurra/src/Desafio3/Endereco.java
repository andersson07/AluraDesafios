package Desafio3;

public class Endereco {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    public Endereco(EnderecoCepJson meuCep) {
        this.cep = meuCep.cep();
        this.logradouro = meuCep.logradouro();
        this.bairro = meuCep.bairro();
        this.localidade = meuCep.localidade();
        this.uf = meuCep.uf();
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogadouro() {
        return logradouro;
    }

    public void setLogadouro(String logadouro) {
        this.logradouro = logadouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", logadouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
