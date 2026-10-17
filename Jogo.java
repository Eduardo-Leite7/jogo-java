import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Jogo {
    public static void main(String[] args) {

        // NOME DO JOGADOR
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do seu personagem: ");
        String nomeJogador = sc.nextLine();

        // ESCOLHA DA ARMA CURTA
        System.out.println("Escolha sua arma de curta distância:");
        System.out.println("1 - Espada");
        System.out.println("2 - Faca");
        System.out.println("Opções: ");

        int escolhaCurta = sc.nextInt();

        while (escolhaCurta != 1 && escolhaCurta != 2) {
            System.out.println("Opção inválida. Escolha 1 ou 2: ");
        }

        Arma armaCurta;

        if (escolhaCurta == 1) {
            armaCurta = new Espada();
        } else {
            armaCurta = new Faca();
        }

        // ESCOLHA DA ARMA LONGA
        System.out.println("Escolha sua arma de longa distância:");
        System.out.println("1 - Arco e flecha");
        System.out.println("2 - Pistola");
        System.out.print("Opção: ");

        int escolhaLonga = sc.nextInt();

        while (escolhaLonga != 1 && escolhaLonga != 2) {
            System.out.print("Opção inválida. Escolha 1 ou 2: ");
            escolhaLonga = sc.nextInt();
        }

        Arma armaLonga;

        if (escolhaLonga == 1) {
            armaLonga = new ArcoEFlecha();
        } else {
            armaLonga = new Pistola();
        }

        //--------------------------------------------

        Arma[] armas = {
                armaCurta,
                armaLonga
        };

        Jogador jogador = new Jogador(nomeJogador, armas);
        Criatura inimigo = new FlavioBolsonaro();
        Batalha batalha = new Batalha();
        List<String> resultados = new ArrayList<>();

        System.out.println("\n========== PRIMEIRO BOSS: FLAVIO ==========");
        boolean venceu = batalha.iniciar(jogador, new FlavioBolsonaro());
        resultados.add("FlavioBolsonaro: " + (venceu ? "VITÓRIA" : "DERROTA"));

        if (venceu) {
            jogador.restaurar();

            System.out.println("\n========== SEGUNDO BOSS: BOLSONARO ==========");
            venceu = batalha.iniciar(jogador, new Bolsonaro());
            resultados.add("Bolsonaro: " + (venceu ? "VITÓRIA" : "DERROTA"));

            if (venceu) {
                jogador.restaurar();

                System.out.println("\n========== TERCEIRO BOSS: EDUARDA ==========");
                venceu = batalha.iniciar(jogador, new Eduarda());
                resultados.add("Eduarda: " + (venceu ? "VITÓRIA" : "DERROTA"));

                if (venceu) {
                    System.out.println("\nPARABÉNS! VOCÊ VENCEU OS TRÊS BOSSES!");
                }
            }
        }

        System.out.println("\n========== RESULTADO FINAL ==========");

        for (String resultado : resultados) {
            System.out.println(resultado);
        }

    }
}