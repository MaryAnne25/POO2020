

public class Peao {
	private StatusPiece status;
	private Teams team;

	public Peao(Teams team) {
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
			return '\u2659';
		} else {
			return '\u265f';
		}
	}

	public boolean checaMovimento(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
		if (linhaDestino >= 0 && linhaDestino < 8 && colunaDestino >= 0 && colunaDestino < 8) { // o destino deve estar dentro do tabuleiro
			if (team == Teams.WHITE) { // se for o team branco
				if (linhaOrigem == 1 && (linhaDestino == 2 || linhaDestino == 3) && colunaOrigem == colunaDestino) { // primeira jogada pode pular 1 ou 2 casas
					return true;
				} else if (linhaOrigem > 1 && linhaDestino == linhaOrigem + 1 && colunaOrigem == colunaDestino) { // proximas jogadas pulam de 1 em 1
					return true;
				} else {
					return false;
				}
			} else if (team == Teams.BLACK) { // se o team for preto
				if (linhaOrigem == 6 && (linhaDestino == 5 || linhaDestino == 4) && colunaOrigem == colunaDestino)
					return true;
				else if (linhaOrigem < 6 && linhaDestino == linhaOrigem - 1 && colunaOrigem == colunaDestino)
					return true;
				else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false; // se o destino for fora do tabuleiro
		}
	}
}
