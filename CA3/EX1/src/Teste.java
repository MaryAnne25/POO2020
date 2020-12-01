
public class Teste {

	public static void main(String[] args) {
		Ponto p1 = new Ponto(1, 2); 
		Ponto p2 = new Ponto(0, 0);
		Ponto p3 = new Ponto(4, -7);
		Ponto p4 = new Ponto(-11, 8);
		Ponto p5 = new Ponto(3, 99);
		Ponto p6 = new Ponto(-57, -64);
		
		Circulo c1 = new Circulo(p6, 16);
		Circulo c2 = new Circulo(p2, 1);
		
		SegmentoDeReta sr1 = new SegmentoDeReta(p1, p4);
		SegmentoDeReta sr2 = new SegmentoDeReta(p5, p3);
	}

}
