package br.org.serratec.gravacoes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Set;
import javax.swing.JOptionPane;

import br.org.serratec.classes.Funcionario;
import br.org.serratec.leituras.JFileEscolheArquivo;

public class GravacaoArquivo {

	public void gravarArquivo(Set<Funcionario> funcionario) {

		DecimalFormat form = new DecimalFormat("0.00");
		JFileEscolheArquivo application = new JFileEscolheArquivo();
		String diretorio = new String(application.JFileEscolherDiretorio());

		try {
			String nomeArquivo = JOptionPane.showInputDialog("Informe o nome do arquivo:");
			FileWriter arquivoGravar = new FileWriter(diretorio + "/" + nomeArquivo + ".csv");
			PrintWriter gravacaoArquivo = new PrintWriter(arquivoGravar);
			for (Funcionario funcionarios : funcionario) {
				String linha = funcionarios.getNome() + ";" + funcionarios.getCpf() + ";"
						+ form.format(funcionarios.getDescontoINSS()) + ";" + form.format(funcionarios.getDescontoIR())
						+ ";" + form.format(funcionarios.getSalarioLiquido()) + "\n";
				gravacaoArquivo.print(linha);
			}
			JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso!");
			gravacaoArquivo.close();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Gravação não gerada.");
			e.printStackTrace();
		}
	}
}
