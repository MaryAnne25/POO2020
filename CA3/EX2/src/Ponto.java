
public class Ponto {
	private double x;
	private double y;
	
	public Ponto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void imprimir() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
}
