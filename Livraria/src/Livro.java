import java.util.Scanner;

public abstract class Livro {
    private String nomeLivro, nomeAutor, tipo;
    private boolean reservado = false;

    public Livro(String nomeLivro, String nomeAutor, String tipo) {
        this.tipo = tipo;
        this.nomeAutor = nomeAutor;
        this.nomeLivro = nomeLivro;
    }

    public Livro(String nomeLivro, String nomeAutor) {
        this.nomeAutor = nomeAutor;
        this.nomeLivro = nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void pegarDadosFisico(Scanner leitor) {
        System.out.println("Digite o nome do livro: ");
        this.nomeLivro = leitor.nextLine();
        System.out.println("Digite o nome do autor: ");
        this.nomeAutor = leitor.nextLine();

        System.out.println("Livro fisico cadastrado!");
    }

    public void pegarDadosEbook(Scanner leitor) {
        System.out.println("Digite o nome do livro: ");
        this.nomeLivro = leitor.nextLine();
        System.out.println("Digite o nome do autor: ");
        this.nomeAutor = leitor.nextLine();

        boolean formatoValido = false;

        while (!formatoValido) {
            System.out.println("Digite o tipo de formato entre (PDF ou ePUB): ");
            this.tipo = leitor.nextLine().toUpperCase();

            if (tipo.equals("PDF") || tipo.equals("EPUB")) {
                formatoValido = true;
                System.out.println("Ebook cadastrado com sucesso!");
                break;
            } else {
                System.out.println("Formato não encontrado, tente novamente.");
                return;
            }
        }
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public void reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println("Livro reservado com sucesso: " + nomeLivro);
        } else {
            System.out.println("Livro já está reservado: " + nomeLivro);
        }
    }

    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva do livro cancelada: " + nomeLivro);
        } else {
            System.out.println("Livro não está reservado para cancelar a reserva: " + nomeLivro);
        }
    }

    public void devolver() {
        if (reservado) {
            reservado = false;
            System.out.println("Livro devolvido com sucesso: " + nomeLivro);
        } else {
            System.out.println("Livro não está reservado para devolver: " + nomeLivro);
        }
    }
}