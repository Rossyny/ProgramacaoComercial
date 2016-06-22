package comercial;

public class Teste {
	public static void main(String[] args) {
		Moeda m = new Moeda(1, "1 Centavo");
		Moeda m1 = new Moeda(5, "5 Centavos");
		Moeda m2 = new Moeda(10, "10 Centavos");
		Moeda m3 = new Moeda(25, "25 Centavos");
		Moeda m4 = new Moeda(50, "50 Centavos");
		Cofrinho c = new Cofrinho();
		c.adicionar(m);
		c.adicionar(m1);
		c.adicionar(m2);
		c.adicionar(m3);
		c.adicionar(m4);
		System.out.println(c.quantidadeMoedas());
		System.out.println(c.quantidadeMoedas(10));
		System.out.println(c.maiorValor());
	}
}
