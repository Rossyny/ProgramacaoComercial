package comercial;

public class TesteAgenda {
	public static void main(String[] args) {
		AgendaTelefonica a = new AgendaTelefonica();
		a.inserir("Dayvid", "99406-8497");
		a.inserir("Welma", "99978-9995");
		a.inserir("Alguém", "99999-9999");
		a.inserir("Ninguém", "88888-8888");
		a.inserir("Zé Bedeu", "77777-7777");
		System.out.println(a.buscarNumero("Joaquim"));
		a.remover("Ninguém");
		System.out.println(a.tamanho());
	}
}
