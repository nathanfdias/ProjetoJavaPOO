package br.org.serratec.classes;

import java.time.LocalDate;
import br.org.serratec.abstracts.Pessoa;
import br.org.serratec.interfaces.IFuncionário;

public class Funcionario extends Pessoa implements IFuncionário{
	public Dependente[] dependentes;

	public Funcionario(String nome, String cpf, LocalDate dataNascimento, Dependente[] dependentes) {
		super(nome, cpf, dataNascimento);
		this.dependentes = dependentes;
	}

	@Override
	public Double descontoINSS() {
		return null;
	}

	@Override
	public Double descontoIR() {
		return null;
	}
	
	
}
