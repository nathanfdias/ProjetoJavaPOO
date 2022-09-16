package br.org.serratec.classes;

import java.time.LocalDate;
import java.time.Period;
import java.util.Set;

import br.org.serratec.abstracts.Pessoa;
import br.org.serratec.exception.DependenteException;
import br.org.serratec.interfaces.CalculoImposto;

public class Funcionario extends Pessoa implements CalculoImposto {
	protected Double salarioBruto;
	protected Double descontoINSS;
	protected Double descontoIR;
	public Set<Dependente> dependentes;
	protected Double valorDependencia = 0.0;
	protected Double salarioLiquido;

	public Funcionario(String nome, String cpf, String dataNascimento, String salarioBruto,
			Set<Dependente> dependentes) {
		super(nome, cpf, dataNascimento);
		this.salarioBruto = Double.parseDouble(salarioBruto);
		this.dependentes = dependentes;
	}

	@Override
	public String toString() {
		return "Funcionario [salarioBruto=" + salarioBruto + ", nome=" + nome + ", cpf=" + cpf + ", dataNascimento="
				+ dataNascimento + "Dependente: " + dependentes;
	}

	public Double getDescontoINSS() {
		return descontoINSS;
	}

	public Double getDescontoIR() {
		return descontoIR;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public Double getValorDependencia() {
		return valorDependencia;
	}

	public Double getSalarioLiquido() {
		return salarioLiquido;
	}

	@Override
	public Double calculoINSS() {

		if (salarioBruto <= 1212.00) {
			return descontoINSS = salarioBruto * 0.075;
		} else if (salarioBruto <= 2427.35) {
			return descontoINSS = salarioBruto * 0.09 - 18.18;
		} else if (salarioBruto <= 3641.03) {
			return descontoINSS = salarioBruto * 0.12 - 91;
		} else if (salarioBruto < 7087.22) {
			return descontoINSS = salarioBruto * 0.14 - 163.82;
		} else {
			return descontoINSS = 7087.22 * 0.14 - 163.82;
		}
	}

	@Override
	public Double validacaoDependente() throws DependenteException {
		for (Dependente dependente : dependentes) {
			LocalDate dataNascimento = dependente.getDataNascimento();
			LocalDate dataAtual = LocalDate.now();
			Period period = Period.between(dataNascimento, dataAtual);
			if (period.getYears() < 18) {
				this.valorDependencia += 189.59;
			} else {
				throw new DependenteException("A idade do dependente " + dependente.getNome() + " é maior que 18 anos");
			}
		}
		return this.valorDependencia;
	}

	@Override
	public Double calculoIR() {

		double baseCalculo = ((salarioBruto - descontoINSS) - this.valorDependencia);
		if (baseCalculo <= 1903.98) {
			descontoIR = 0.0;
		} else if (baseCalculo <= 2826.65) {
			descontoIR = (baseCalculo * 0.075) - 142.8;
		} else if (baseCalculo <= 3751.05) {
			descontoIR = (baseCalculo * 0.15) - 354.8;
		} else if (baseCalculo <= 4664.68) {
			descontoIR = (baseCalculo * 0.225) - 636.13;
		} else if (baseCalculo > 4664.68) {
			descontoIR = (baseCalculo * 0.275) - 869.36;
		}

		return descontoIR;
	}

	@Override
	public Double calculoSalarioLiquido() {
		salarioLiquido = (salarioBruto - descontoINSS) - descontoIR;
		return salarioLiquido;
	}
}
