public class DefesaHibrida extends Defesa{
    private Escudo escudo;
    private Esquiva esquiva;

    public DefesaHibrida(int chanceEsquiva, int reducaoEscudo) {
        this.escudo = new Escudo(reducaoEscudo);
        this.esquiva = new Esquiva(chanceEsquiva);
    }

    @Override
    public int danoReduzido(int dano) {
        int danoAposEsquiva = esquiva.danoReduzido(dano);
        return escudo.danoReduzido(danoAposEsquiva);
    }
}
