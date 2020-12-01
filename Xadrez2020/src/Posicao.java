public class Posicao {
	private int linha;
	private char coluna;
	private CorPosicao cor;
	private StatusPosicao status;
	//private Piece piece; 
	
	public Posicao(int linha, char coluna, CorPosicao cor, StatusPosicao status) {
		super();
		this.linha = linha;
		this.coluna = coluna;
		this.cor = cor;
		this.status = status;
	}

	public int getLinha() {
		return linha;
	}
	
	public char getColuna() {
		return coluna;
	}
	
	public CorPosicao getCor() {
		return cor;
	}

	public StatusPosicao getStatus() {
		return status;
	}
	public void setStatus(StatusPosicao status) {
		this.status = status;
	}
}
