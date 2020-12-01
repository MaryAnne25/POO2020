

public class Torre {
	private StatusPiece status;
	private Teams team;
	
	public Torre(Teams team) {
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
			return '\u2656';
		} else {
			return '\u265c';
		}
	}

	public boolean checaMovimento(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
		if ((linhaDestino >= 0 && linhaDestino < 8) && (colunaDestino >= 0 && colunaDestino < 8)) { // checa se a coluna e linha sao validas
			if (colunaDestino == colunaOrigem) { // se move na mesma coluna
				
				return true; // caso o caminho inteiro esteja vazio, ele vai terminar for e retornar
								// verdadeiro

			} else if (linhaDestino == linhaOrigem) { // se move na mesma linha 
				return true; // caso o caminho inteiro esteja vazio, ele vai terminar for e retornar verdadeiro
			} else {
				return false; // caso o movimento nao seja valido
			}
		} else {
			return false;
		}
	}
}
