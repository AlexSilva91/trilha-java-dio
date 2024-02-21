package com.dio.controleFluxo.exception;

public class ParametrosInvalidosException extends Exception {

	private static final long serialVersionUID = 1L;

	public String ArgInvalidoException() {
		return "\nO segundo parâmetro deve ser maior que o primeiro";
	}

}
