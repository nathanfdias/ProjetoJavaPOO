package br.org.serratec.classes;

import br.org.serratec.abstracts.Pessoa;
import br.org.serratec.interfaces.IFuncionário;

public class Funcionario extends Pessoa implements IFuncionário{
	public Dependente[] dependentes;

	public Funcionario(String nome, String cpf, String dataNascimento, Dependente[] dependentes) {
		super(nome, cpf, dataNascimento);
		this.dependentes = dependentes;
	}

	@Override
	public Double descontoINSS() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double descontoIR() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
