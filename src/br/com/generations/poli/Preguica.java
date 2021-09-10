package br.com.generations.poli;

public class Preguica extends AnimalSuperClass implements AnimalInterface {

	@Override
	public void EmitirSom() {
		System.out.println("~grito~");

	}

	public void SubirArvore() {
		System.out.println("~Subindo árvore~");
	}

	// Construtor
	public Preguica(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

}
