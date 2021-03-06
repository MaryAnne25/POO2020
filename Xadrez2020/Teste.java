public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogo game = new Jogo();
		System.out.println("Status do Jogo: " + game.getStatus());
		System.out.println("Vez de qual jogador: " + game.getVez());
		
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.desenharTabuleiro();
		
		Rei blackKing = new Rei(Teams.BLACK);
		System.out.println(blackKing.desenho());
		Rei whiteKing = new Rei(Teams.WHITE);
		System.out.println(whiteKing.desenho());
		System.out.println(blackKing.checaMovimento(6, 4, 5, 4));
		System.out.println(blackKing.checaMovimento(6, 4, 5, 5));
		System.out.println(blackKing.checaMovimento(6, 4, 6, 5));
		System.out.println(whiteKing.checaMovimento(6, 4, 2, 2));
		System.out.println(whiteKing.checaMovimento(6, 4, 6, 9));
		System.out.println(whiteKing.checaMovimento(8, 1, 9, 1));
		
		Rainha blackQueen = new Rainha(Teams.BLACK);
		System.out.println(blackQueen.desenho());
		Rainha whiteQueen = new Rainha(Teams.WHITE);
		System.out.println(whiteQueen.desenho());
		System.out.println(blackQueen.checaMovimento(6, 4, 5, 4));
		System.out.println(blackQueen.checaMovimento(6, 4, 5, 5));
		System.out.println(blackQueen.checaMovimento(6, 4, 6, 5));
		System.out.println(whiteQueen.checaMovimento(6, 4, 2, 2));
		System.out.println(whiteQueen.checaMovimento(6, 4, 6, 9));
		System.out.println(whiteQueen.checaMovimento(8, 1, 9, 1));
		
		Cavalo blackHorse = new Cavalo(Teams.BLACK);
		System.out.println(blackHorse.desenho());
		Cavalo whiteHorse = new Cavalo(Teams.WHITE);
		System.out.println(whiteHorse.desenho());
		System.out.println(blackHorse.checaMovimento(5, 5, 4, 3));
		System.out.println(blackHorse.checaMovimento(5, 5, 3, 4));
		System.out.println(blackHorse.checaMovimento(5, 5, 3, 6));
		System.out.println(whiteHorse.checaMovimento(5, 5, 4, 7));
		System.out.println(whiteHorse.checaMovimento(5, 5, 6, 7));
		System.out.println(whiteHorse.checaMovimento(5, 5, 7, 6));
		System.out.println(blackHorse.checaMovimento(5, 5, 7, 4));
		System.out.println(blackHorse.checaMovimento(5, 5, 6, 3));
		System.out.println(blackHorse.checaMovimento(5, 5, 3, 5));
		System.out.println(whiteHorse.checaMovimento(5, 5, 5, 9));
		System.out.println(whiteHorse.checaMovimento(5, 5, 5, 4));
		System.out.println(whiteHorse.checaMovimento(5, 5, 2, 2));
		
		Bispo blackBishop = new Bispo(Teams.BLACK);
		System.out.println(blackBishop.desenho());
		Bispo whiteBishop = new Bispo(Teams.WHITE);
		System.out.println(whiteBishop.desenho());
		System.out.println(blackBishop.checaMovimento(5, 5, 2, 2));
		System.out.println(blackBishop.checaMovimento(5, 5, 3, 7));
		System.out.println(blackBishop.checaMovimento(5, 5, 7, 7));
		System.out.println(whiteBishop.checaMovimento(5, 5, 7, 3));
		System.out.println(whiteBishop.checaMovimento(5, 5, 2, 5));
		System.out.println(whiteBishop.checaMovimento(5, 5, 4, 8));
		System.out.println(blackBishop.checaMovimento(5, 5, 5, 4));
		System.out.println(blackBishop.checaMovimento(5, 5, 2, 9));
		System.out.println(whiteBishop.checaMovimento(5, 5, 5, 9));
		
		Torre blackTower = new Torre(Teams.BLACK);
		System.out.println(blackTower.desenho());
		Torre whiteTower = new Torre(Teams.WHITE);
		System.out.println(whiteTower.desenho());
		System.out.println(blackTower.checaMovimento(5, 5, 7, 5));
		System.out.println(blackTower.checaMovimento(5, 5, 5, 1));
		System.out.println(blackTower.checaMovimento(5, 5, 4, 4));
		System.out.println(whiteTower.checaMovimento(8, 1, 8, 10));
		System.out.println(whiteTower.checaMovimento(8, 1, 9, 9));
		
		Peao blackPawn = new Peao(Teams.BLACK);
		System.out.println(blackPawn.desenho());
		Peao whitePawn = new Peao(Teams.WHITE);
		System.out.println(whitePawn.desenho());
		System.out.println(blackPawn.checaMovimento(6, 3, 5, 3));
		System.out.println(blackPawn.checaMovimento(6, 3, 4, 3));
		System.out.println(blackPawn.checaMovimento(6, 3, 6, 4));
		System.out.println(blackPawn.checaMovimento(6, 3, 7, 4));
		System.out.println(blackPawn.checaMovimento(6, 3, 8, 3));
		System.out.println(blackPawn.checaMovimento(6, 3, 9, 3));
		
		System.out.println(whitePawn.checaMovimento(1, 4, 3, 4));
		System.out.println(whitePawn.checaMovimento(1, 4, 2, 4));
		System.out.println(whitePawn.checaMovimento(1, 4, 3, 5));
		System.out.println(whitePawn.checaMovimento(1, 4, 2, 5));
		System.out.println(whitePawn.checaMovimento(1, 4, 1, 4));
		System.out.println(whitePawn.checaMovimento(1, 4, 2, 9));
		
		
	}

}
