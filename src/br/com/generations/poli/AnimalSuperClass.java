package br.com.generations.poli;

public abstract class AnimalSuperClass {
//super classe onde serao criados os atributos dos animais

	String nome;
	int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void MostrarInformacoes() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
	}

}
