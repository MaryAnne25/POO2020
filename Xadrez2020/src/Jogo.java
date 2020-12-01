
public class Jogo {
	private Tabuleiro tabuleiro;
	//private Jogador player1;
	//private Jogador player2;
	private StatusJogo status;
	private Vez vez;
	
	public Jogo() {
		super();
		this.tabuleiro = new Tabuleiro();
		this.status = StatusJogo.START;
		this.vez = Vez.JOGADOR1;
	}

	public StatusJogo getStatus() {
		return status;
	}

	public void setStatus(StatusJogo status) {
		this.status = status;
	}

	public Vez getVez() {
		return vez;
	}

	public void setVez(Vez vez) {
		this.vez = vez;
	}
	
}