package br.org.serratec.main;

import java.util.Set;

import javax.swing.JOptionPane;

import br.org.serratec.classes.Funcionario;
import br.org.serratec.exception.DependenteException;
import br.org.serratec.gravacoes.GravacaoArquivo;
import br.org.serratec.leituras.LeituraArquivo;

public class Main {

	public static void main(String[] args) {

		LeituraArquivo leituraArquivo = new LeituraArquivo();
		Set<Funcionario> funcionario = leituraArquivo.verificaArquivo();

		for (Funcionario funcionarios : funcionario) {
			funcionarios.calculoINSS();
			try {
				funcionarios.validacaoDependente();
			} catch (DependenteException e) {
				System.out.println(e.getMessage());
			}
			funcionarios.calculoIR();
			funcionarios.calculoSalarioLiquido();
		}

		JOptionPane.showMessageDialog(null, "Selecione o local onde o novo arquivo será gravado.");
		GravacaoArquivo gravacaoArquivo = new GravacaoArquivo();
		gravacaoArquivo.gravarArquivo(funcionario);
	}
}