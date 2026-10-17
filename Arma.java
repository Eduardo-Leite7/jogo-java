import java.util.Random;

public abstract class Arma {
    
    private String nome;
    private int ataque;
    private int chance;
    private int municao;
    
    public Arma(String nome, int ataque, int chance) {
        this.nome = nome;
        this.ataque = ataque;
        this.chance = chance;
        this.municao = -1;
    }
    public Arma(String nome, int ataque) {
        this.nome = nome;
        this.ataque = ataque;
        this.chance = 100;
        this.municao = -1;
    }

    public Arma(String nome, int ataque, int chance, int municao) {
        this.nome = nome;
        this.ataque = ataque;
        this.chance = chance;
        this.municao = municao;
    }

    public void mensagem(){
        System.out.println( this.nome + " - dano: " + 
                            this.ataque + " - chance: " +
                            this.chance + "%" );
        if (municao >= 0){
            System.out.println("Munição restante: " + municao);
        }
    }

    public void fazAtaque( Criatura criatura ){
        if (municao == 0) {
            System.out.println("Essa arma está sem munição!");
            return;
        }

        if (municao > 0){
            municao--;
        }

        Random rd = new Random();
        int sorteio = rd.nextInt(100);
        if( sorteio < this.chance ){
            criatura.tomaDano(this.ataque);
        } else {
            System.out.println("Errou!");
        }
    }

    

}
