import java.util.Random;

public class FlavioBolsonaro extends Inimigo {
	//UTILIZAÇÃO DA DEFESA HIBRIDA
    public FlavioBolsonaro() {
        super("FlavioBolsonaro", 500, 200, new DefesaHibrida(30, 20));
    }

	@Override
	public void fraseApresentacao() {
		System.out.println("NÃO VAI TER MAIS SUS, E ESSA É MINHA CAMPANHA!");
	}

	@Override
	public void fraseMorte() {
		System.out.println("Papai me ajude papaaaai");
	}

	//ATAQUE ESPECIAL = CHANCE DE CRITICO
	@Override
	public void fazAtaque(Criatura criatura){
		Random random = new Random();
		int sorteio =  random.nextInt(100);

		if (sorteio < 30) {
			System.out.println("Flávio realizou um ataque crítico");
			criatura.tomaDano(getAtaque() + 50);
		} else {
			System.out.println("Flávio realizou um ataque normal.");
			criatura.tomaDano(getAtaque());
		}
	}


}
