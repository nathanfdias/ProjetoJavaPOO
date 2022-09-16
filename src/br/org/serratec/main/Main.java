package br.org.serratec.main;

import java.util.Set;
import javax.swing.JOptionPane;
import br.org.serratec.classes.Funcionario;
import br.org.serratec.exception.UniqueCPFException;
import br.org.serratec.gravacoes.GravacaoArquivo;
import br.org.serratec.leituras.LeituraArquivo;

public class Main {

	public static void main(String[] args) throws UniqueCPFException {

		LeituraArquivo leituraArquivo = new LeituraArquivo();
		Set<Funcionario> funcionario = leituraArquivo.verificaArquivo();

		for (Funcionario funcionarios : funcionario) {
			funcionarios.calculoINSS();
			funcionarios.validacaoDependente();
			funcionarios.calculoIR();
			funcionarios.calculoSalarioLiquido();
		}

		JOptionPane.showMessageDialog(null, "Selecione o local onde o novo arquivo será gravado.");
		GravacaoArquivo gravacaoArquivo = new GravacaoArquivo();
		gravacaoArquivo.gravarArquivo(funcionario);
	}
}