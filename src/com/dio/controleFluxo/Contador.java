package com.dio.controleFluxo;

import java.util.Scanner;

import com.dio.controleFluxo.exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int argUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int argDois = terminal.nextInt();

		try {
			contar(argUm, argDois);

		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception);
		}

	}

	static void contar(int argUm, int argDois) throws ParametrosInvalidosException {
		if (argUm > argDois) {
			System.out.println(new ParametrosInvalidosException().ArgInvalidoException());
		} else if (argDois > argUm) {
			int contagem = argDois - argUm;
			System.out.println("\n");
			for (int i = 1; i <= contagem; i++) {
				System.out.println(i);
			}
		}
	}
}
