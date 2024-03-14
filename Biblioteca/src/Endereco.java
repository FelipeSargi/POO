public class Endereco {
    private String logadouro;
    private Integer numero;
    private String bairro;
    private String cidade;

    public Endereco(String logadouro, Integer numero, String bairro, String cidade){
        this.logadouro = logadouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String consultarEnde(){
//        System.out.println("Logadouro: " + logadouro);
//        System.out.println("numero: " + numero);
//        System.out.println("bairro: " + bairro);
        return this.logadouro + this.numero;

    }
}
