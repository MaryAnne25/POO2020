import java.util.ArrayList;

class Dicionario {
	private String idioma;
	private int quantPalavras;
	private ArrayList<Palavra> palavras;
	private static final int MAXPALAVRAS = 1000;

	Dicionario(String idioma) {
		this.idioma = idioma;
		this.quantPalavras = MAXPALAVRAS;
		this.palavras = new ArrayList<Palavra>(this.quantPalavras);
		
	}

	Dicionario(String idioma, int maxPalavras) {
		this.idioma = idioma;
		this.quantPalavras = maxPalavras;
		this.palavras = new ArrayList<Palavra>(this.quantPalavras);
	}

	public void adicionarPalavra(String nome, String tipo, String significado) {
		Palavra palavra = new Palavra(nome, tipo, significado);
		if (checarRepetida(palavra)) {
			System.out.println("Palavra já presente no dicionário");
		}
		else {
			palavras.add(palavra);
		}
	}

	public void adicionarPalavra(String nome, String tipo, String significado1, String significado2) {
		Palavra palavra = new Palavra(nome, tipo, significado1, significado2);
		if (checarRepetida(palavra)) {
			System.out.println("Palavra já presente no dicionário");
		}
		else {
			palavras.add(palavra);
		}
	}
	
	public void adicionarPalavra(String nome, String tipo, String significado1, String significado2, String significado3) {
		Palavra palavra = new Palavra(nome, tipo, significado1, significado2, significado3);
		if (checarRepetida(palavra)) {
			System.out.println("Palavra já presente no dicionário");
		}
		else {
			palavras.add(palavra);
		}
	}
	
	private boolean checarRepetida(Palavra palavra) {
		return palavras.contains(palavra);
	}

	public void imprimir() {
		if(palavras.isEmpty()) {
			System.out.println("Dicionario vazio!");
			return;
		}
		for(int i = 0; i < palavras.size(); i++) {
			palavras.get(i).imprimir();
		}
	}
	
	public void imprimir(String palavra) {
		for(int i = 0; i < palavras.size(); i++) {
			if (palavras.get(i).getPalavra() == palavra) {
				palavras.get(i).imprimir();
				return;
			}
		}
		System.out.println("Palavra não se encontra no dicionário");
		return;
	}
}

class Palavra {
	private String nome;
	private String tipo;
	private Significado[] significados;
	
	public Palavra(String nome, String tipo, String significado) {
		this.nome = nome;
		this.tipo = tipo;
		this.significados = new Significado[1];
		significados[0] = new Significado(significado);
	}
	
	public Palavra(String nome, String tipo, String significado1, String significado2) {
		this.nome = nome;
		this.tipo = tipo;
		this.significados = new Significado[2];
		significados[0] = new Significado(significado1);
		significados[1] = new Significado(significado2);
	}
	
	public Palavra(String nome, String tipo, String significado1, String significado2, String significado3) {
		this.nome = nome;
		this.tipo = tipo;
		this.significados = new Significado[3];
		significados[0] = new Significado(significado1);
		significados[1] = new Significado(significado2);
		significados[2] = new Significado(significado3);
	}
	
	public String getPalavra() {
		return this.nome;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void imprimir() {
		System.out.println(this.nome);
		System.out.println(this.tipo);
		for(int i = 0; i < significados.length; i++) {
			significados[i].imprimir();
		}
		System.out.println("\n");
	}
}

class Significado {
	private String descricao;
	
	public Significado() {
		super();
	}
	
	public Significado(String descricao) {
		super();
		this.descricao = descricao;
	}

	public void setSignificado(String significado) {
		this.descricao = significado;
	}
	
	public String getSignificado() {
		return this.descricao;
	}
	
	public void imprimir() {
		System.out.println(descricao);
	}
}
