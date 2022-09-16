package br.org.serratec.interfaces;

import br.org.serratec.exception.DependenteException;

public interface CalculoImposto {
	public Double calculoINSS();

	public Double calculoIR();

	public Double validacaoDependente() throws DependenteException;

	public Double calculoSalarioLiquido();
}
