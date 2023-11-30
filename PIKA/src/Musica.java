import java.util.Scanner;

public class Musica {
    private String nomeMusica;
    private double duracao;

    public Musica(String nomeMusica, double duracao) {
        this.duracao = duracao;
        this.nomeMusica = nomeMusica;
    }

    public double getDuracao() {
        return duracao;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public void pegarDados(Scanner leitor) {
        System.out.println("digite o nome da musica: ");
        this.nomeMusica = leitor.nextLine();
        System.out.println("Digite a duracao da musica: ");
        this.duracao = leitor.nextDouble();
        leitor.nextLine();
    }

    @Override
    public String toString() {
        return "{" +
                " nomeMusica =" + getNomeMusica() +
                ", duracao =" + getDuracao() +
                "}";
    }

}