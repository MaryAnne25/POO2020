

public class Bispo {
	private StatusPiece status;
	private Teams team;

	public Bispo(Teams team) {
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
			return '\u2657';
		} else {
			return '\u265D';
		}
	}

	public boolean checaMovimento(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
		if (linhaDestino >= 0 && linhaDestino < 8 && colunaDestino >= 0 && colunaDestino < 8) { // o destino deve estar dentro do tabuleiro
			if (linhaDestino < linhaOrigem && colunaDestino < colunaOrigem) { // diagonal superior esquerda
				for (int i = linhaOrigem - 1, j = colunaOrigem - 1; i >= linhaDestino && j >= colunaDestino; i--, j--) { // percorre a diagonal começando pelo proximo da origem
					if (linhaDestino == i && colunaDestino == j) { // caso o destino esteja na diagonalw
						return true;
					}
				}
				return false;
			} else if (linhaDestino < linhaOrigem && colunaDestino > colunaOrigem) { // diagonal superior direita
				for (int i = linhaOrigem - 1, j = colunaOrigem + 1; i >= linhaDestino && j <= colunaDestino; i--, j++) { // percorre a diagonal começando pelo proximo da origem
					if (linhaDestino == i && colunaDestino == j) { // caso o destino esteja na diagonalw
						return true;
					}
				}
				return false;
			} else if (linhaDestino > linhaOrigem && colunaDestino > colunaOrigem) { // diagonal inferior direita
				for (int i = linhaOrigem + 1, j = colunaOrigem + 1; i <= linhaDestino && j <= colunaDestino; i++, j++) { // percorre a diagonal começando pelo proximo da origem
					if (linhaDestino == i && colunaDestino == j) { // caso o destino esteja na diagonalw
						return true;
					}
				}
				return false;
			} else if (linhaDestino > linhaOrigem && colunaDestino < colunaOrigem) { // diagonal inferior esquerda
				for (int i = linhaOrigem + 1, j = colunaOrigem - 1; i <= linhaDestino && j >= colunaDestino; i++, j--) { // percorre a diagonal começando pelo proximo da origem
					if (linhaDestino == i && colunaDestino == j) { // caso o destino esteja na diagonalw
						return true;
					}
				}
				return false;
			} else {
				return false; // caso não esteja em nenhuma diagonal
			}
		} else {
			return false; // caso esteja fora do tabuleiro
		}
	}
}
