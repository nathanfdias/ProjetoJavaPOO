package br.org.serratec.main;

import java.util.Scanner;
import java.util.Set;

import br.org.serratec.classes.Funcionario;
import br.org.serratec.gravacoes.GravacaoArquivo;
import br.org.serratec.leituras.LeituraArquivo;

public class Main {

	public static void main(String[] args) /*throws UniqueCPFException*/ {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o diretório do arquivo: ");
		String arquivo = sc.next();
		LeituraArquivo leituraArquivo = new LeituraArquivo();
		Set<Funcionario> funcionario = leituraArquivo.verificaArquivo(arquivo);
		
		//C:/Users/anikk/aula_po/ProjetoJavaPOO/Pessoas.csv
		for (Funcionario funcionarios : funcionario) {
			funcionarios.calculoINSS();
			funcionarios.validacaoDependente();
			funcionarios.calculoIR();
			funcionarios.calculoSalarioLiquido();
		}
		
		GravacaoArquivo gravacaoArquivo = new GravacaoArquivo();
		gravacaoArquivo.gravarArquivo(funcionario);
		
	}	
}
