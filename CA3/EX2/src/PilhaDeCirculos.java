
public class PilhaDeCirculos {
	private int topo;
	private Circulo[] circulos;

	public PilhaDeCirculos() {
		super();
		this.topo = -1;
		this.circulos = new Circulo[1000];
	}

	public boolean vazia() {
		if (topo < 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean cheia() {
		if (topo == 999) {
			return true;
		} else {
			return false;
		}
	}

	public void empilha(Circulo circulo) {
		if (topo >= 999) {
			System.out.println("Pilha cheia");
		} else {
			circulos[++topo] = circulo;
			circulo.imprimir();
			System.out.println("adicionado a pilha");
		}
	}

	public Circulo desempilha() {
		if (topo < 0) {
			System.out.println("Pilha vazia");
			return null;
		} else {
			Circulo circulo = circulos[topo--];
			circulo.imprimir();
			System.out.println("desempilhado");
			return circulo;
		}
	}

	public Circulo itemTopo() {
		return circulos[topo];
	}

	public int quantEmpilhados() {
		return topo + 1;
	}
}
