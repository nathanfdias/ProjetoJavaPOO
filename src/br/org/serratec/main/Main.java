package br.org.serratec.main;

import java.util.Set;

import br.org.serratec.classes.Funcionario;
import br.org.serratec.gravacoes.GravacaoArquivo;
import br.org.serratec.leituras.LeituraArquivo;

public class Main {

	public static void main(String[] args) /*throws UniqueCPFException*/ {
		
		
		LeituraArquivo leituraArquivo = new LeituraArquivo();
		Set<Funcionario> funcionario = leituraArquivo.verificaArquivo();
		
		//C:/Users/anikk/aula_po/ProjetoJavaPOO/Pessoas.csv
		for (Funcionario funcionarios : funcionario) {
			funcionarios.calculoINSS();
			funcionarios.validacaoDependente();
			funcionarios.calculoIR();
			funcionarios.calculoSalarioLiquido();
		}
		System.out.println("\nInsira o diretório que deseja gravar: ");
		GravacaoArquivo gravacaoArquivo = new GravacaoArquivo();
		gravacaoArquivo.gravarArquivo(funcionario);
		
	}	
}
