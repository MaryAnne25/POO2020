
public class SegmentoDeReta {
	private Ponto pontoInicial;
	private Ponto pontoFinal;
	
	public SegmentoDeReta(Ponto pontoInicial, Ponto pontoFinal) {
		super();
		this.pontoInicial = pontoInicial;
		this.pontoFinal = pontoFinal;
	}

	public Ponto getPontoInicial() {
		return pontoInicial;
	}

	public Ponto getPontoFinal() {
		return pontoFinal;
	}

	public double comprimento() {
		return Math.sqrt(Math.pow((pontoInicial.getX() - pontoFinal.getX()), 2) + Math.pow((pontoInicial.getY() - pontoFinal.getY()), 2));
	}
	
	public void imprimir() {
		System.out.println("[(" + pontoInicial.getX() + ", " + pontoInicial.getY() + "), (" + pontoFinal.getX() + ", " + pontoFinal.getY() + ")]");
	}
	
}
