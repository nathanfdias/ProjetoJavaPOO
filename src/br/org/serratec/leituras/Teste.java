package br.org.serratec.leituras;

import java.util.Set;

import br.org.serratec.classes.Funcionario;
import br.org.serratec.exception.UniqueCPFException;

public class Teste {

    public static void main(String[] args) throws UniqueCPFException {

        String arquivo = "G://serratec//teste//ProjetoJavaPOO//Pessoas.csv";
        LeituraArquivo leituraArquivo = new LeituraArquivo();
        Set<Funcionario> funcionario = leituraArquivo.verificaArquivo(arquivo);
        for (Funcionario funcionario2 : funcionario) {
            System.out.println(funcionario2);
        }

    }
}