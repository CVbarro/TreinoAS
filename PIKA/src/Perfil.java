import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perfil {
    private Playlist playlist;

    public void adicionarPessoa(List<Pessoa> perfis) {
        Scanner leitor = new Scanner(System.in);
        Pessoa pessoa = new Pessoa(null, null);
        pessoa.pegarDadosPessoas(leitor);
        perfis.add(pessoa);
        System.out.println(perfis);
    }

    public void removerPessoa(List<Pessoa> perfis){
        if (!perfis.isEmpty()){
            perfis.remove(perfis.size() - 1);
            System.out.println("Ultimo Perfil removido!");
        } else{
            System.out.println("Sem perfis para ser excluido");
        }

    }
    public void atualizarPessoa(List<Pessoa> perfis, String idPessoa){
        Scanner leitor = new Scanner(System.in);
        boolean pessoaEncontrada = false;
        for (Pessoa pessoa : perfis){
            if (pessoa.getNome().equals(idPessoa)){
                System.out.println("Digite o novo nome: ");
                String nomePessoa = leitor.nextLine();
                System.out.println("Digite o novo id dessa pessoa: ");
                String novoid = leitor.nextLine();

                pessoa.setIdPessoa(novoid);
                pessoa.setNome(nomePessoa);

                System.out.println("Perfil atualizado:");
                System.out.println("Nome atualizado: " + pessoa.getNome());
                System.out.println("Id novo: " + pessoa.getIdPessoa());
                System.out.println("Playlist atual: " + perfis);

                pessoaEncontrada = true;
                break;
            }
        }
        if (!pessoaEncontrada) {
            System.out.println("A música não foi encontrada na playlist: " + idPessoa);
        }

    }
}
