package br.org.serratec.interacao;

import java.util.Scanner;
import java.util.Set;

import br.org.serratec.classes.Funcionario;
import br.org.serratec.exception.UniqueCPFException;
import br.org.serratec.leituras.LeituraArquivo;

public class Interacao {

	public void leituraArquivo() throws UniqueCPFException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o diretório do arquivo: ");
		String arquivo = sc.next();
		LeituraArquivo leituraArquivo = new LeituraArquivo();
		Set<Funcionario> funcionario = leituraArquivo.verificaArquivo(arquivo);
	}
	
}
