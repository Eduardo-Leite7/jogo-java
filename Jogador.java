import java.util.Scanner;

public class Jogador extends Criatura {

    private Arma[] armas;
    private final int vidaInicial = 1000;

    public Jogador(String nome, Arma[] armas ) {
        super(nome, 1000);
        this.armas = armas;
    }

    public void restaurar(){
        restaurarVida(vidaInicial);

        for (Arma arma : armas) {
            arma.restaurarMunicao();
        }
    }

	@Override
	public void fazAtaque(Criatura criatura) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- SEU TURNO DE ATAQUE ---");
        System.out.println("Escolha qual arma deseja usar neste ataque:");
        int n = 1;
        for( Arma arma : armas ){
            System.out.print( n + ") " );
            arma.mensagem();
            n++;
        }

        System.out.print("Digite o número da arma: ");
        int escolha = sc.nextInt();
        while( escolha < 1 || escolha > n - 1 ) {
            System.out.print("Número inválido. Digite novamente: ");
            escolha = sc.nextInt();
        }
        
        armas[escolha-1].fazAtaque(criatura);

	}

	@Override
	public void fraseApresentacao() {
		System.out.println("Não contava com minha astúcia!");		
	}

	@Override
	public void fraseMorte() {
        System.out.println("pipipipipipipipi");
	}
    
}
