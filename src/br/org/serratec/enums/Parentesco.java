package br.org.serratec.enums;

public enum Parentesco {
	FILHO('F'),
	SOBRINHO('S'),
	OUTROS('O');
	
	private char valor;

	private Parentesco(char valor) {
		this.valor = valor;
	}
	
	private char getValor() {
		return this.valor;
	}
	
}
