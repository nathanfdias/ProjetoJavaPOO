package br.org.serratec.leituras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.org.serratec.classes.Dependente;
import br.org.serratec.classes.Funcionario;

public class LeituraArquivo {

    public Set<Funcionario> verificaArquivo() /*throws UniqueCPFException*/ {

        Set<Funcionario> funcionario = new HashSet<>();
        Set<Dependente> dependente = new HashSet<>();
        JFileEscolheArquivo application = new JFileEscolheArquivo();
        File arquivo = new File(application.JFileEscolherArquivo());

        try {
            Scanner sc = new Scanner(arquivo);
            while (sc.hasNextLine()) {
                String linhaFuncionario = sc.nextLine();
                String vetorFuncionario[] = linhaFuncionario.split(",");
                String linhaDependente = sc.nextLine();
                while (!linhaDependente.isEmpty()) {
                    String vetorDependente[] = linhaDependente.split(",");
                    dependente.add(new Dependente(vetorDependente[0], vetorDependente[1], vetorDependente[2],
                            vetorDependente[3]));
                    if(sc.hasNextLine()) {
                        linhaDependente = sc.nextLine();
                    }else {
                        break;
                    }
                }
                funcionario.add(new Funcionario(vetorFuncionario[0], vetorFuncionario[1], vetorFuncionario[2],
                        vetorFuncionario[3], dependente));
                dependente = new HashSet<>();
            }
            System.out.println("Leitura realizada com sucesso!");
            sc.close();
            
//            for (Funcionario funcionario2 : funcionario) {
//                System.out.println(funcionario2);
//            }
//            
            return funcionario;
            

        } catch (FileNotFoundException e) {
        	System.out.println("Diretório não encontrado");
            e.printStackTrace();
            return funcionario;
        }
    }

}