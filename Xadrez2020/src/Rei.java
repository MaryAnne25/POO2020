

public class Rei {
	private StatusPiece status;
	private Teams team;
	
	public Rei(Teams team) {
		super();
		this.status = StatusPiece.INGAME;
		this.team = team;
	}

	public StatusPiece getStatus() {
		return status;
	}
	
	public void setStatus(StatusPiece status) {
		this.status = status;
	}

	public Teams getTeam() {
		return team;
	}

	public char desenho() {
		if (team == Teams.WHITE) {
			return '\u2654';
		} else {
			return '\u265a';
		}
	}

	public boolean checaMovimento(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
		if (colunaDestino >= 0 && colunaDestino < 8 && linhaDestino >= 0 && linhaDestino < 8) { // checar se o destino n�o esta pra fora do tabuleiro
			if (linhaOrigem == linhaDestino
					&& (colunaDestino == colunaOrigem + 1 || colunaDestino == colunaOrigem - 1)) { // andar na mesma linha
				return true;
			} else if (colunaOrigem == colunaDestino
					&& (linhaDestino == linhaOrigem - 1 || linhaDestino == linhaOrigem + 1)) { // andar na mesma coluna
				return true;
			} else if (linhaDestino == linhaOrigem - 1 && colunaDestino == colunaOrigem - 1) { // andar na diagonal superior esquerda
				return true;
			} else if (linhaDestino == linhaOrigem + 1 && colunaDestino == colunaOrigem + 1) { // andar na diagonal superior direita
				return true;
			} else if (linhaDestino == linhaOrigem + 1 && colunaDestino == colunaOrigem - 1) {// andar na diagonal inferior esquerda
				return true;
			} else if (linhaDestino == linhaOrigem - 1 && colunaDestino == colunaOrigem + 1) { // andar na diagonal inferior direita
				return true;
			} else {
				return false; // se for uma posi��o invalida
			}
		} else {
			return false; // caso esteja fora do tabuleiro
		}
	}
}
