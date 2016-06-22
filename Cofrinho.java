package comercial;

import java.util.ArrayList;
import java.util.List;

class Cofrinho {
	private List<Moeda> moedas = new ArrayList<Moeda>();

	public Cofrinho() {

	}

	public void adicionar(Moeda m) {
		moedas.add(m);
	}

	public double CalcularTotal() {
		double soma = 0;
		for (Moeda moeda : moedas) {
			soma += moeda.getValor();
		}
		return soma;
	}

	public int quantidadeMoedas() {
		return moedas.size();
	}

	public int quantidadeMoedas(double valor) {
		int quantidade = 0;
		for (Moeda moeda : moedas) {
			if (valor == moeda.getValor()) {
				quantidade++;
			}
		}
		return quantidade;
	}

	public double maiorValor() {
		double maior = 0;
		for (Moeda moeda : moedas) {
			if (maior < moeda.getValor()) {
				maior = moeda.getValor();
			}
		}
		return maior;
	}
}