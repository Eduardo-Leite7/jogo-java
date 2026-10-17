public class FlavioBolsonaro extends Inimigo {

    public FlavioBolsonaro() {
        super("FlavioBolsonaro", 500, 200, new Escudo(10) );
    }

	@Override
	public void fraseApresentacao() {
		System.out.println("NÃO VAI TER MAIS SUS, E ESSA É MINHA CAMPANHA!");
	}

	@Override
	public void fraseMorte() {
		System.out.println("Papai me ajude papaaaai");
	}


}
