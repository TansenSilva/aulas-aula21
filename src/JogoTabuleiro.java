public abstract class JogoTabuleiro {

    //Atributos
    private boolean tabuleiro;
    private int linhas;
    private int colunas;
    private int pecas;

    //Construtor
    public JogoTabuleiro(boolean tabuleiro, int linhas, int colunas, int pecas) {
        this.tabuleiro = tabuleiro;
        this.linhas = linhas;
        this.colunas = colunas;
        this.pecas = pecas;
    }

    //Métodos
    public abstract void jogar();
}
