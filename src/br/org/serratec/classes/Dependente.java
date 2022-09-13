package br.org.serratec.classes;

import java.time.LocalDate;

import br.org.serratec.abstracts.Pessoa;
import br.org.serratec.enums.Parentesco;

public class Dependente extends Pessoa{
	private Parentesco parentesco;

	public Dependente(String nome, String cpf, LocalDate dataNascimento, String parentesco) {
		super(nome, cpf, dataNascimento);
		switch (parentesco) {
		case "FILHO":
			this.parentesco = Parentesco.FILHO;
			break;
		case "SOBRINHO":
			this.parentesco = Parentesco.SOBRINHO;
			break;
		case "OUTROS":
			this.parentesco = Parentesco.OUTROS;
		default:
			break;
		}
	}
	
	public Parentesco getParentesco() {
		return parentesco;
	}

	
}
