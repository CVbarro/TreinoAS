import java.util.List;
import java.util.Scanner;

public class Ebook extends Livro {

    public Ebook(String nomeAutor, String nomeLivro, String tipo){
        super(nomeLivro, nomeAutor, tipo);
    }

    public void adicionarLivro(List<Livro> livrosEbook){
        Scanner leitor = new Scanner(System.in);
        Livro livro = new Ebook(getNomeAutor(), getNomeLivro(), getTipo());
        livro.pegarDadosEbook(leitor);
        livrosEbook.add(livro);
        System.out.println(livrosEbook);
    }

    public void removerLivroFisico(List<Livro> livrosEbook){
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite para confirmar a remocao do livro: (S)");
            String op;
            op = leitor.nextLine().toUpperCase();
            if (op.equals("S")){
                System.out.println("Livro será removido");
                livrosEbook.remove(livrosEbook.size() -1);
                System.out.println("Livro mais recente removido com sucesso!");
            }
        }
    }
}