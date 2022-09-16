package br.org.serratec.exception;

public class UniqueCPFException extends Throwable{

	private static final long serialVersionUID = 1289125420236375324L;

	public UniqueCPFException(String message) {
		super(message);
	}
}
