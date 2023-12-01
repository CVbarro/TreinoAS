import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livraria {

    public void menu() {
        List<Livro> livrosFisicos = new ArrayList<>();
        List<Livro> livrosEbook = new ArrayList<>();
        Ebook ebook = new Ebook(null, null, null);
        LivroFisico lFisico = new LivroFisico(null, null);

        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;

            while (continuar) {
                System.out.println("Escolha uma opcao: ");
                System.out.println("(1)-Para adicionar um livro fisico: ");
                System.out.println("(2)-Para adicionar um livro Ebook: ");
                System.out.println("(3)-Para remover um livro fisico: ");
                System.out.println("(4)-Para remover um livro Ebook: ");
                System.out.println("(5)-Para ver a disponibilidade de um livro");
                System.out.println("(6)-Para reservar um livro");
                System.out.println("(7)-Para cancelar a reserva de um livro");
                System.out.println("(8)-Para devolver um livro");
                System.out.println("(9)-Para sair do menu");

                int escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        lFisico.adicionarLivro(livrosFisicos);
                        break;
                    case 2:
                        ebook.adicionarLivro(livrosEbook);
                        break;
                    case 3:
                        lFisico.removerLivroFisico(livrosFisicos);
                        break;
                    case 4:
                        ebook.removerLivroFisico(livrosEbook);
                        break;
                    case 5:
                        System.out.println("Digite o nome do livro para verificar a disponibilidade: ");
                        String nomeLivro = scanner.nextLine();
                        pesquisarLivro(livrosFisicos, nomeLivro);
                        pesquisarLivro(livrosEbook, nomeLivro);
                        break;
                    case 6:
                        System.out.println("Digite o nome do livro para realizar a reserva: ");
                        nomeLivro = scanner.nextLine();
                        pesquisarLivro(livrosFisicos, nomeLivro);
                        pesquisarLivro(livrosEbook, nomeLivro);
                        break;
                    case 7:
                        System.out.println("Digite o nome do livro para cancelar a reserva: ");
                        nomeLivro = scanner.nextLine();
                        pesquisarLivro(livrosFisicos, nomeLivro);
                        pesquisarLivro(livrosEbook, nomeLivro);
                        break;
                    case 8:
                        System.out.println("Digite o nome do livro para devolver: ");
                        nomeLivro = scanner.nextLine();
                        pesquisarLivro(livrosFisicos, nomeLivro);
                        pesquisarLivro(livrosEbook, nomeLivro);
                        break;
                    case 9:
                        continuar = false;
                        System.out.println("Saindo do menu");
                        break;

                    default:
                        System.out.println("Opcao invalida programa fechando!");
                        continuar = false;
                        break;
                }
            }
        }

    }

    public boolean isLivroDisponivel(List<Livro> livros, String nomeLivro) {
        for (Livro livro : livros) {
            if (livro.getNomeLivro().equalsIgnoreCase(nomeLivro)) {
                if (!livro.isReservado()) {
                    System.out.println("Livro disponível: " + nomeLivro);
                    return true;
                } else {
                    System.out.println("Livro reservado: " + nomeLivro);
                    return false;
                }
            }
        }
        System.out.println("Livro não encontrado: " + nomeLivro);
        return false;
    }

    public void reservarLivro(List<Livro> livros, String nomeLivro) {
        for (Livro livro : livros) {
            if (livro.getNomeLivro().equalsIgnoreCase(nomeLivro) && !livro.isReservado()) {
                livro.setReservado(true);
                System.out.println("Livro reservado com sucesso: " + nomeLivro);
                return;
            }
        }
        System.out.println("Livro não encontrado ou já reservado: " + nomeLivro);
    }

    public void pesquisarLivro(List<? extends Livro> livros, String nomeLivro) {
        for (Livro livro : livros) {
            if (livro.getNomeLivro().equalsIgnoreCase(nomeLivro)) {
                if (livro.isReservado()) {
                    System.out.println("Livro reservado: " + livro.getNomeLivro());
                } else {
                    System.out.println("Livro disponível: " + livro.getNomeLivro());
                }
                return;
            }
        }
        System.out.println("Livro não encontrado: " + nomeLivro);
    }

}