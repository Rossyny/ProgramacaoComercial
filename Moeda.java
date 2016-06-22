package comercial;

class Moeda {
	private String nome;
	private double valor;

	public Moeda(double valor, String nome) {
		this.valor = valor;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

}
