package br.com.generations.poli;

public class Cavalo extends AnimalSuperClass implements AnimalInterface {

	@Override
	public void EmitirSom() {
		System.out.println("~Relinchado~");

	}

	public void Correr() {
		System.out.println("Cavalo correndo!");
	}

	// Construtor
	public Cavalo(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

}
