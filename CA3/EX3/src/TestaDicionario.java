
public class TestaDicionario {
	public static void main(String[] args) {
        Dicionario d1 = new Dicionario("portugues", 100);
        Dicionario d2 = new Dicionario("portugues");
        d1.adicionarPalavra("paz", "substantivo", "sossego", "tranquilidade", 
                                         "ausência de guerra");
        d1.adicionarPalavra("ver", "verbo", "Olhar para", "enxergar");
        d1.imprimir("paz");
        d1.imprimir();
        d2.adicionarPalavra("andar", "verbo", "Mover-se, mudando de lugar");
        d2.imprimir();
	}
}
