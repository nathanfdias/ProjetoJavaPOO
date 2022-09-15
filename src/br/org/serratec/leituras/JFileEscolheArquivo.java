package br.org.serratec.leituras;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JFileEscolheArquivo extends JFrame {


    public String JFileEscolherArquivo() {
        return EscolheArquivo();
    }



    private String EscolheArquivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.CANCEL_OPTION)
            System.exit(1);

        return fileChooser.getSelectedFile().getPath();
    }

}
