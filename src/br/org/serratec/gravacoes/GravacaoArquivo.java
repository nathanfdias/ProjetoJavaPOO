package br.org.serratec.gravacoes;

//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
//import java.util.Set;
import java.util.Set;

import br.org.serratec.classes.Funcionario;

public class GravacaoArquivo {

	public void gravarArquivo(Set<Funcionario> funcionario) {
		
		DecimalFormat form = new DecimalFormat("0.00");
		
		
		//C:/Users/anikk/aula_po/ProjetoJavaPOO/FolhaDePagamento.csv
		
        try {
        	Scanner sc = new Scanner(System.in);
    		String arquivoFinal = sc.next();
            FileWriter arquivoGravar = new FileWriter(arquivoFinal);
            PrintWriter gravacaoArquivo = new PrintWriter(arquivoGravar);
            for (Funcionario funcionarios : funcionario) {
                String linha = funcionarios.getNome() + ";" + funcionarios.getCpf() + ";" +
                form.format(funcionarios.getDescontoINSS()) + ";" + form.format(funcionarios.getDescontoIR()) + ";" + form.format(funcionarios.getSalarioLiquido()) + "\n";
                gravacaoArquivo.print(linha);
            }
            System.out.println("Arquivo gravado com sucesso!");
            gravacaoArquivo.close();
            sc.close();

        } catch (IOException e) {
            System.out.println("Gravação não gerada");
            e.printStackTrace();
        }
    }
}
