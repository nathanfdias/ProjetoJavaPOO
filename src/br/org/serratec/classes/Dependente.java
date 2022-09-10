package br.org.serratec.classes;

import java.time.LocalDate;

import br.org.serratec.abstracts.Pessoa;
import br.org.serratec.enums.Parentesco;

public class Dependente extends Pessoa{
	private Parentesco parentesco;

	public Dependente(String nome, String cpf, LocalDate dataNascimento, Parentesco parentesco) {
		super(nome, cpf, dataNascimento);
		this.parentesco = parentesco;
	}
		public Parentesco getParentesco() {
		return parentesco;
	}

	
}
