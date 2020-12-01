

public class Cavalo {
	private StatusPiece status;
	private Teams team;

	public Cavalo(Teams team) {
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
			return '\u2658';
		} else {
			return '\u265e';
		}
	}

	public boolean checaMovimento(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
		if (linhaDestino >= 0 && linhaDestino < 8 && colunaDestino >= 0 && colunaDestino < 8) { // o destino deve estar dentro do tabuleiro

			if (linhaDestino == linhaOrigem - 2
					&& (colunaDestino == colunaOrigem - 1 || colunaDestino == colunaOrigem + 1)) { //
				return true; // caso o destino esteja vazio
			} else if (linhaDestino == linhaOrigem + 2
					&& (colunaDestino == colunaOrigem - 1 || colunaDestino == colunaOrigem + 1)) { // dupla inferior
				return true; // caso o destino esteja vazio
			} else if (colunaDestino == colunaOrigem + 2
					&& (linhaDestino == linhaOrigem - 1 || linhaDestino == linhaOrigem + 1)) { // dupla direita
				return true; // caso o destino esteja vazio
			} else if (colunaDestino == colunaOrigem - 2
					&& (linhaDestino == linhaOrigem - 1 || linhaDestino == linhaOrigem + 1)) { // dupla esquerda
				return true; // caso o destino esteja vazio
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

}
