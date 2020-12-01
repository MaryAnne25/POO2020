
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
		Circulo c3 = new Circulo(p1, 15);
		Circulo c4 = new Circulo(p3, 2);
		Circulo c5 = new Circulo(p4, 14);
		Circulo c6 = new Circulo(p5, 3);
		
		PilhaDePontos pilhaPontos = new PilhaDePontos();
		PilhaDeCirculos pilhaCirculos = new PilhaDeCirculos();
		
		pilhaPontos.empilha(p1);
		pilhaPontos.empilha(p2);
		pilhaPontos.empilha(p3);
		pilhaPontos.empilha(p4);
		pilhaPontos.empilha(p5);
		pilhaPontos.empilha(p6);
		
		pilhaCirculos.empilha(c1);
		pilhaCirculos.empilha(c2);
		pilhaCirculos.empilha(c3);
		pilhaCirculos.empilha(c4);
		pilhaCirculos.empilha(c5);
		pilhaCirculos.empilha(c6);
		
		pilhaCirculos.desempilha();
		pilhaCirculos.desempilha();
		pilhaCirculos.empilha(c2);
	}

}
