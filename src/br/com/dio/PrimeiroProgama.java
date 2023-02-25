package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgama {

	public static void main(String[] args) {

		Gato gato = new Gato("bichanos", "blue", 3);
		Livros livros = new Livros();
		System.out.println(livros);
		System.out.println(gato);
//		
	}

}

 class Livros {
	private String nome;
	private String npag;

	public Livros() {
		super();
	}

}