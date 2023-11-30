import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String idPessoa;

    public Pessoa(String nome, String idPessoa){
        this.idPessoa = idPessoa;
        this.nome = nome;
    }

    public String getIdPessoa() {
        return idPessoa;
    }
    public String getNome() {
        return nome;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void pegarDadosPessoas(Scanner leitor){
        System.out.println("Digite o id da Pessoa: ");
        this.idPessoa = leitor.nextLine();
        System.out.println("Digite o nome da Pessoa: ");
        this.nome = leitor.nextLine();
        leitor.nextLine();

    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", idPessoa='" + getIdPessoa() + "'" +
            "}";
    }


}
