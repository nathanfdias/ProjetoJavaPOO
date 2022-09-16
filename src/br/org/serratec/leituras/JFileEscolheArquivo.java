package br.org.serratec.leituras;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JFileEscolheArquivo extends JFrame {

	private static final long serialVersionUID = -6253163076412770271L;

	public String JFileEscolherArquivo() {
		return EscolheArquivo();
	}

	public String JFileEscolherDiretorio() {
		return EscolherDiretorio();
	}

	private String EscolheArquivo() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int result = fileChooser.showOpenDialog(this);

		if (result == JFileChooser.CANCEL_OPTION)
			System.exit(1);

		return fileChooser.getSelectedFile().getPath();
	}

	private String EscolherDiretorio() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int result = fileChooser.showOpenDialog(this);

		if (result == JFileChooser.CANCEL_OPTION)
			System.exit(1);

		return fileChooser.getSelectedFile().getPath();
	}

}