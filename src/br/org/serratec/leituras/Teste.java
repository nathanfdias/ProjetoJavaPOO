package br.org.serratec.leituras;

import java.util.Set;

import br.org.serratec.classes.Funcionario;

public class Teste {

    public static void main(String[] args) {

        String arquivo = "C://empregados.txt";
        LeituraArquivo leituraArquivo = new LeituraArquivo();
        Set<Funcionario> funcionario = leituraArquivo.verificaArquivo(arquivo);
        for (Funcionario funcionario2 : funcionario) {
            System.out.println(funcionario2);
        }

    }
}