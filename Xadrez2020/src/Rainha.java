

public class Rainha {
	private StatusPiece status;
	private Teams team;

	public Rainha(Teams team) {
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
			return '\u2655';
		} else {
			return '\u265b';
		}
	}

	public boolean checaMovimento(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
		if ((linhaDestino >= 0 && linhaDestino < 8) && (colunaDestino >= 0 && colunaDestino < 8)) { // checa se esta no tabuleiro

			if (colunaDestino == colunaOrigem) { // se move na mesma coluna
				return true; // caso o caminho inteiro esteja vazio, ele vai terminar for e retornar verdadeiro
			} else if (linhaDestino == linhaOrigem) { 
				return true; // caso o caminho inteiro esteja vazio, ele vai terminar for e retornar verdadeiro
			} else if (linhaDestino < linhaOrigem && colunaDestino < colunaOrigem) { // diagonal superior esquerda
				for (int i = linhaOrigem - 1, j = colunaOrigem - 1; i >= linhaDestino && j >= colunaDestino; i--, j--) { // percorre a diagonal come�ando pelo proximo da origem
					if (linhaDestino == i && colunaDestino == j) { // caso o destino esteja na diagonal
						return true;
					}
				}
				return false;
			} else if (linhaDestino < linhaOrigem && colunaDestino > colunaOrigem) { // diagonal superior direita
				for (int i = linhaOrigem - 1, j = colunaOrigem + 1; i >= linhaDestino && j <= colunaDestino; i--, j++) { // percorre a diagonal come�ando pelo proximo da origem
					if (linhaDestino == i && colunaDestino == j) { // caso o destino esteja na diagonal
						return true;
					}
				}
				return false;
			} else if (linhaDestino > linhaOrigem && colunaDestino > colunaOrigem) { // diagonal inferior direita
				for (int i = linhaOrigem + 1, j = colunaOrigem + 1; i <= linhaDestino && j <= colunaDestino; i++, j++) { // percorre a diagonal come�ando pelo proximo da origem
					if (linhaDestino == i && colunaDestino == j) { // caso o destino esteja na diagonalw
						return true;
					}
				}
				return false;
			} else if (linhaDestino > linhaOrigem && colunaDestino < colunaOrigem) { // diagonal inferior esquerda
				for (int i = linhaOrigem + 1, j = colunaOrigem - 1; i <= linhaDestino && j >= colunaDestino; i++, j--) { // percorre a diagonal come�ando pelo proximo da origem
					if (linhaDestino == i && colunaDestino == j) { // caso o destino esteja na diagonal
						return true;
					}
				}
				return false;
			} else {
				return false; // caso o movimento nao seja valido
			}
		} else {
			return false; // caso esteja fora do tabuleiro
		}
	}
}
