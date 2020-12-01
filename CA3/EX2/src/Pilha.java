
public class Pilha {
	private int topo = -1;
	private int[] itens = new int[1000];
	
	public boolean vazia() {
		if (topo < 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean cheia() {
		if (topo == 999) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void empilha(int item) {
		if (topo >= 999) {
			System.out.println("Pilha cheia");
		}
		else {
			itens[++topo] = item;
			System.out.println(item + " adicionado a pilha");
		}
	}
	
	public int desempilha() {
		if (topo < 0) {
			System.out.println("Pilha vazia");
			return 0;
		}
		else {
			int item = itens[topo--];
			System.out.println(item + " desempilhado");
			return item;
		}
	}
	
	public int itemTopo() {
		return itens[topo];
	}
	
	public int quantEmpilhados() {
		return topo + 1;
	}
}
