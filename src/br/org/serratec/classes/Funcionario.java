package br.org.serratec.classes;

import java.time.LocalDate;
import br.org.serratec.abstracts.Pessoa;
import br.org.serratec.interfaces.IFuncionário;

public class Funcionario extends Pessoa implements IFuncionário{
	protected Double salarioBruto;
	public Dependente[] dependentes;

	public Funcionario(String nome, String cpf, LocalDate dataNascimento, Double salarioBruto,
			Dependente[] dependentes) {
		super(nome, cpf, dataNascimento);
		this.salarioBruto = salarioBruto;
		this.dependentes = dependentes;
	}	
	
	public Double getSalarioBruto() {
		return salarioBruto;
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
