
public class PilhaDePontos {
	private int topo;
	private Ponto[] pontos;

	public PilhaDePontos() {
		super();
		this.topo = -1;
		this.pontos = new Ponto[1000];
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

	public void empilha(Ponto ponto) {
		if (topo >= 999) {
			System.out.println("Pilha cheia");
		} else {
			pontos[++topo] = ponto;
			ponto.imprimir();
			System.out.println("adicionado a pilha");
		}
	}

	public Ponto desempilha() {
		if (topo < 0) {
			System.out.println("Pilha vazia");
			return null;
		} else {
			Ponto ponto = pontos[topo--];
			ponto.imprimir();
			System.out.println("desempilhado");
			return ponto;
		}
	}

	public Ponto itemTopo() {
		return pontos[topo];
	}

	public int quantEmpilhados() {
		return topo + 1;
	}
}