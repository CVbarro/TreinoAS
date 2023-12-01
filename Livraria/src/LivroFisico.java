import java.util.List;
import java.util.Scanner;

public class LivroFisico extends Livro {
    public LivroFisico(String nomeAutor, String nomeLivro){
        super(nomeLivro, nomeAutor);
    }

    public void adicionarLivro(List<Livro> livrosFisicos){
        Scanner leitor = new Scanner(System.in);
        Livro livro = new LivroFisico(getNomeAutor(), getNomeLivro());
        livro.pegarDadosFisico(leitor);
        livrosFisicos.add(livro);
        System.out.println(livrosFisicos);
    }

    public void removerLivroFisico(List<Livro> livrosFisicos){
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite para confirmar a remocao do livro: (S)");
            String op;
            op = leitor.nextLine().toUpperCase();
            if (op.equals("S")){
                System.out.println("Livro será removido");
                livrosFisicos.remove(livrosFisicos.size() -1);
                System.out.println("Livro mais recente removido com sucesso!");
            }
        }
    }

}