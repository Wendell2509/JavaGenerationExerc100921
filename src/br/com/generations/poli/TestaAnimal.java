package br.com.generations.poli;

public class TestaAnimal {

	public static void main(String[] args) {

		Cachorro Clifford = new Cachorro("Clifford", 5);
		Cavalo Spirit = new Cavalo("Spirit", 15);
		Preguica Soneca = new Preguica("Soneca", 20);

		Clifford.MostrarInformacoes();
		Clifford.EmitirSom();
		Clifford.Correr();
		
		System.out.println("---");

		Spirit.MostrarInformacoes();
		Spirit.EmitirSom();
		Spirit.Correr();
		
		System.out.println("---");

		Soneca.MostrarInformacoes();
		Soneca.EmitirSom();
		Soneca.SubirArvore();

	}

}
