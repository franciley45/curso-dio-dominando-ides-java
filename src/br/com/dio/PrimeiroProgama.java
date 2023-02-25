package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgama {

	public static void main(String[] args) {

		Gato gato = new Gato("bichanos", "blue", 3);
		Livros livros = new Livros();
		System.out.println(livros);
		System.out.println(gato);
		/*
		 * int A = 2; int B = 3; System.out.println("Helo Word!!!!!" + (A + B));
		 */
	}

}

 class Livros {
	private String nome;
	private String npag;

	public Livros() {
		super();
	}

}