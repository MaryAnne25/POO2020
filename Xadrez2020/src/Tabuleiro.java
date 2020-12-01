public class Tabuleiro {
	Posicao[][] posicoes = new Posicao[8][8];

	public Tabuleiro() {
		super();
		posicoes[0][0] = new Posicao(1, 'a', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[0][1] = new Posicao(1, 'b', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[0][2] = new Posicao(1, 'c', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[0][3] = new Posicao(1, 'd', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[0][4] = new Posicao(1, 'e', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[0][5] = new Posicao(1, 'f', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[0][6] = new Posicao(1, 'g', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[0][7] = new Posicao(1, 'h', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		
		posicoes[1][0] = new Posicao(2, 'a', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[1][1] = new Posicao(2, 'b', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[1][2] = new Posicao(2, 'c', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[1][3] = new Posicao(2, 'd', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[1][4] = new Posicao(2, 'e', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[1][5] = new Posicao(2, 'f', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[1][6] = new Posicao(2, 'g', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[1][7] = new Posicao(2, 'h', CorPosicao.BRANCO, StatusPosicao.OCUPADA);

		posicoes[2][0] = new Posicao(3, 'a', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[2][1] = new Posicao(3, 'b', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[2][2] = new Posicao(3, 'c', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[2][3] = new Posicao(3, 'd', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[2][4] = new Posicao(3, 'e', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[2][5] = new Posicao(3, 'f', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[2][6] = new Posicao(3, 'g', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[2][7] = new Posicao(3, 'h', CorPosicao.PRETO, StatusPosicao.LIVRE);
		
		posicoes[3][0] = new Posicao(4, 'a', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[3][1] = new Posicao(4, 'b', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[3][2] = new Posicao(4, 'c', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[3][3] = new Posicao(4, 'd', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[3][4] = new Posicao(4, 'e', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[3][5] = new Posicao(4, 'f', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[3][6] = new Posicao(4, 'g', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[3][7] = new Posicao(4, 'h', CorPosicao.BRANCO, StatusPosicao.LIVRE);

		posicoes[4][0] = new Posicao(5, 'a', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[4][1] = new Posicao(5, 'b', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[4][2] = new Posicao(5, 'c', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[4][3] = new Posicao(5, 'd', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[4][4] = new Posicao(5, 'e', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[4][5] = new Posicao(5, 'f', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[4][6] = new Posicao(5, 'g', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[4][7] = new Posicao(5, 'h', CorPosicao.PRETO, StatusPosicao.LIVRE);
		
		posicoes[5][0] = new Posicao(6, 'a', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[5][1] = new Posicao(6, 'b', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[5][2] = new Posicao(6, 'c', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[5][3] = new Posicao(6, 'd', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[5][4] = new Posicao(6, 'e', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[5][5] = new Posicao(6, 'f', CorPosicao.BRANCO, StatusPosicao.LIVRE);
		posicoes[5][6] = new Posicao(6, 'g', CorPosicao.PRETO, StatusPosicao.LIVRE);
		posicoes[5][7] = new Posicao(6, 'h', CorPosicao.BRANCO, StatusPosicao.LIVRE);

		posicoes[6][0] = new Posicao(7, 'a', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[6][1] = new Posicao(7, 'b', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[6][2] = new Posicao(7, 'c', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[6][3] = new Posicao(7, 'd', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[6][4] = new Posicao(7, 'e', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[6][5] = new Posicao(7, 'f', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[6][6] = new Posicao(7, 'g', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[6][7] = new Posicao(7, 'h', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		
		posicoes[7][0] = new Posicao(8, 'a', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[7][1] = new Posicao(8, 'b', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[7][2] = new Posicao(8, 'c', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[7][3] = new Posicao(8, 'd', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[7][4] = new Posicao(8, 'e', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[7][5] = new Posicao(8, 'f', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
		posicoes[7][6] = new Posicao(8, 'g', CorPosicao.PRETO, StatusPosicao.OCUPADA);
		posicoes[7][7] = new Posicao(8, 'h', CorPosicao.BRANCO, StatusPosicao.OCUPADA);
	}

	void desenharTabuleiro() {
		System.out.println("\t\t\t    A  B  C  D  E  F  G  H ");
		System.out.println("\t\t\t   ________________________");
		for (int l=0; l < 8; l++){
			System.out.print("\t\t\t" + (l+1) + " |");
			for (int c=0 ; c < 8; c++){
				if (posicoes[l][c].getStatus() == StatusPosicao.OCUPADA){
					System.out.printf(" \u265A ");//com a classe piece implementada imprimirá o símbolo correto de cada peça
				}

				else if(posicoes[l][c].getCor() == CorPosicao.PRETO)
					System.out.printf(" + " ); //casas pretas
				else
					System.out.printf(" - "); //casas brancas
			}
			System.out.println("| " + (l+1));
		}
		System.out.println("\t\t\t   ________________________");
		System.out.println("\t\t\t    A  B  C  D  E  F  G  H \n");
	}

}
