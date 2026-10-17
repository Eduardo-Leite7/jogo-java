public class Bolsonaro extends Inimigo {

    public Bolsonaro() {
        super("Bolsonaro", 800, 60);
    }

	@Override
	public void fraseApresentacao() {
        System.out.println("É só uma gripezinha pô!");
	}

	@Override
	public void fraseMorte() {
        System.out.println("Flávio ganhe por mim nessa eleições de 2026!");
	}


	//--Sistema de Upgrade
	private boolean upgraded = false;
	private int vidaCritica = 200;
	@Override
	public void upgrade(){
		if( !upgraded ){
			if( vidaCritica(vidaCritica) ){
				System.out.println(getNome() + " está turbinado!");
				upgraded = true;
				setDefesa(new Escudo(40));
				setAtaque(200);
			}
		}
	}
    
}
