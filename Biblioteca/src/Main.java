//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Endereco[] enderecos = new Endereco[4];

        enderecos[0] = new Endereco("Av. Brasil", 5, "Centro", "ivaiporã");
        enderecos[1] = new Endereco("Av. tope", 5454, "Centro", "jardim");
        enderecos[2] = new Endereco("Av. magera", 698, "Centro", "ivaiporã");
        enderecos[3] = new Endereco("Av. leops", 488, "Centro", "marrocos");



        Pessoa[] pessoas = new Pessoa[5];
        pessoas[0] = new Pessoa("fernad", 40, "326.465.789-78", enderecos[0]);
        pessoas[1] = new Pessoa("jorg", 40, "326.465.789-78", enderecos[0]);
        pessoas[2] = new Pessoa("troi", 40, "326.465.789-78", enderecos[0]);
        pessoas[3] = new Pessoa("kilia", 40, "326.465.789-78", enderecos[0]);
        pessoas[4] = new Pessoa("marg", 40, "326.465.789-78", enderecos[0]);


//        pessoas[0].getEndereco().consultarEnde();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome() == "jorg") {
                System.out.println(pessoa.getEndereco());
            }
        }
    }
}
