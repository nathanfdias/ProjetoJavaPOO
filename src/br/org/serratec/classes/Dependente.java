package br.org.serratec.classes;

import br.org.serratec.abstracts.Pessoa;
import br.org.serratec.enums.Parentesco;

public class Dependente extends Pessoa{
	public Parentesco parentesco;

	public Dependente(String nome, String cpf, String dataNascimento, Parentesco parentesco) {
		super(nome, cpf, dataNascimento);
		this.parentesco = parentesco;
	}
	
	
}
