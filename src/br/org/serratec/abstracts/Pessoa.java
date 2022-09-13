package br.org.serratec.abstracts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import br.org.serratec.exception.UniqueCPFException;

public abstract class Pessoa {
	protected String nome, cpf;
	protected LocalDate dataNascimento;
	//private static Set<String> cpfs;
	
	
	protected Pessoa(String nome, String cpf,String dataNascimento) throws UniqueCPFException {
		this.nome = nome;
		this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.BASIC_ISO_DATE);
		
		/*if (cpfs.contains(cpf)) {
			throw new UniqueCPFException("Esse CPF já existe!");
		} else {
			this.cpf = cpf;
			cpfs.add(cpf);
		}*/
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	//Rivania
	
}
