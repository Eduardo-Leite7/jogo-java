public class Batalha {

    public boolean iniciar(Criatura jogador, Criatura inimigo){
        System.out.println("Começa a Batalha");
        System.out.println("################\n");

        jogador.fraseApresentacao();
        inimigo.fraseApresentacao();

        while(true){
            jogador.mostraVida();
            inimigo.mostraVida();

            jogador.fazAtaque(inimigo);
            if( inimigo.estaVivo() ){
                inimigo.fazAtaque(jogador);
            }

            if( !jogador.estaVivo() ){
                jogador.fraseMorte();
                System.out.println(inimigo.getNome() + " venceu.");
                break;
                return false;
            }
            if( !inimigo.estaVivo() ){
                inimigo.fraseMorte();
                System.out.println(jogador.getNome() + " venceu.");
                break;
                return true;
            }

            jogador.upgrade();
            inimigo.upgrade();
        }
    }
}
