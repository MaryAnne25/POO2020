
public class Circulo {
	private Ponto centro;
	private double raio;
	
	public Circulo(Ponto centro, float raio) {
		super();
		this.centro = centro;
		this.raio = raio;
	}

	public Ponto getCentro() {
		return centro;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public double perimetro() {
		return 2*Math.PI*raio;
	}
	
	public double area() {
		return Math.PI*raio*raio;
	}
	
	public String posicaoPonto(Ponto ponto) {
		if ((Math.pow((ponto.getX() - centro.getX()), 2) + Math.pow((ponto.getY() - centro.getY()), 2)) < Math.pow(raio, 2)) {
			return "Interno";
		}
		else if ((Math.pow((ponto.getX() - centro.getX()), 2) + Math.pow((ponto.getY() - centro.getY()), 2)) == Math.pow(raio, 2)) {
			return "Pertence";
		}
		
		else {
			return "Externo";
		}
	}

	public void imprimir() {
		System.out.println("[(" + centro.getX() + ", " + centro.getY() + "), " + raio + "]");
	}
}

