package br.org.serratec.gravacoes;

//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
//import java.util.Set;
import java.util.Set;

import br.org.serratec.classes.Funcionario;

public class GravacaoArquivo {

	public void gravarArquivo(Set<Funcionario> funcionario) {
		
		DecimalFormat form = new DecimalFormat("0.00");
		
        try {
            FileWriter arquivoGravar = new FileWriter("C:/Users/anikk/aula_po/ProjetoJavaPOO/FolhaDePagamento.csv");
            PrintWriter gravacaoArquivo = new PrintWriter(arquivoGravar);
            for (Funcionario funcionarioss : funcionario) {
                String linha = funcionarioss.getNome() + ";" + funcionarioss.getCpf() + ";" +
                form.format(funcionarioss.getDescontoINSS()) + ";" + form.format(funcionarioss.getDescontoIR()) + ";" + form.format(funcionarioss.getSalarioLiquido()) + "\n";
                gravacaoArquivo.print(linha);
            }
            System.out.println("Arquivo gravado com sucesso!");
            gravacaoArquivo.close();

        } catch (IOException e) {
            System.out.println("Gravação não gerada");
            e.printStackTrace();
        }
    }
}
