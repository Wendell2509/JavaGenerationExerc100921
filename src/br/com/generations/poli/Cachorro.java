package br.com.generations.poli;

public class Cachorro extends AnimalSuperClass implements AnimalInterface {

	@Override
	public void EmitirSom() {
		System.out.println("~Latido~");

	}

	public void Correr() {
		System.out.println("Cachorro correndo!");
	}

	// Construtor
	public Cachorro(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

}
