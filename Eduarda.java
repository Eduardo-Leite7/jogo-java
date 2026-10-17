public class Eduarda extends Inimigo{

    public Eduarda() {
        super("Eduarda", 300, 230, new Escudo(70) );
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu sou a maior inimiga das feministas de São Paulo");
    }

    @Override
    public void fraseMorte() {
        System.out.println("O soco dele é muito forte!!!!!! Nãaaaaaoooo");
    }


}
