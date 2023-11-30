import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Musica> musicas = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            Playlist playlist1 = new Playlist();

            while (continuar) {
                System.out.println("Escolha uma opção: ");
                System.out.println("Para adicionar música, digite 1");
                System.out.println("Para remover uma música, digite 2");
                System.out.println("Para atualizar a música, digite 3");
                System.out.println("Para sair do aplicativo, digite 4");

                int escolha = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do scanner

                switch (escolha) {
                    case 1:
                        playlist1.adicionarMusica(musicas);
                        break;
                    case 2:
                        playlist1.removerMusica(musicas);
                        break;
                    case 3:
                        System.out.println("Digite o nome da música que deseja atualizar: ");
                        String nomeMusica = scanner.nextLine();
                        playlist1.atualizarMusica(musicas, nomeMusica);
                        break;
                    case 4:
                        continuar = false;
                        System.out.println("Saindo do aplicativo");
                        break;
                    default:
                        System.out.println("Opção inválida, saindo do programa!");
                        continuar = false;
                        break;
                }
            }
        }
    }
}

