package br.org.serratec.abstracts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import br.org.serratec.exception.UniqueCPFException;

public abstract class Pessoa {
	protected String nome, cpf;
	protected LocalDate dataNascimento;

	protected Pessoa(String nome, String cpf, String dataNascimento) throws UniqueCPFException {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.BASIC_ISO_DATE);
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

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
}
