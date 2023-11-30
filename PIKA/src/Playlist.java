import java.util.List;
import java.util.Scanner;

public class Playlist {

    public void adicionarMusica(List<Musica> musicas) {
        Scanner leitor = new Scanner(System.in);
        Musica musica = new Musica(null, 0);
        musica.pegarDados(leitor);
        musicas.add(musica);
        System.out.println(musicas);
    }

    public void removerMusica(List<Musica> musicas) {
        if (!musicas.isEmpty()) {
            musicas.remove(musicas.size() - 1);
            System.out.println("Ultima musica removida");
        } else {
            System.out.println("Sem musicas para remover");
        }

    }

    public void atualizarMusica(List<Musica> musicas, String nomeMusica) {
        Scanner leitor = new Scanner(System.in);
        boolean musicaEncontrada = false;

        for (Musica musica : musicas) {
            if (musica.getNomeMusica().equals(nomeMusica)) {
                System.out.println("Digite o novo nome da música: ");
                String novoNome = leitor.nextLine();
                System.out.println("Digite a nova duração da música: ");
                double novaDuracao = leitor.nextDouble();

                musica.setNomeMusica(novoNome);
                musica.setDuracao(novaDuracao);

                System.out.println("Música atualizada:");
                System.out.println("Nome: " + musica.getNomeMusica());
                System.out.println("Duração: " + musica.getDuracao());
                System.out.println("Playlist atual: " + musicas);

                musicaEncontrada = true;
                break; // Saia do loop após encontrar e atualizar a música
            }
        }

        if (!musicaEncontrada) {
            System.out.println("A música não foi encontrada na playlist: " + nomeMusica);
        }
    }
}