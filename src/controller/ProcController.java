package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;
import javax.swing.plaf.SliderUI;

public class ProcController {
	public String so() {
		return System.getProperty("os.name");
	}
	public void processoCompleto(String so) {
		if(so.contains("Windows")) {
			processoLista("TASKLIST");
			processoWindows();
		}else if(so.contains("Linux")) {
			processoLista("top");
			processoLinux();
		}
	}
	public void processoLista(String path) {
		try {			
			Process proc = Runtime.getRuntime().exec(path);
			InputStream fluxo = proc.getInputStream(); // fluxo recebe stream de proc
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha != null){ //o laço vai até a ultima linha
				System.out.println(linha);
				linha = buffer.readLine(); //atribuindo linha com a proxima linha do arquivo
			}
		} catch (IOException e){
			String erro = e.getMessage();
			JOptionPane.showMessageDialog(null, erro, "ERRO", JOptionPane.ERROR_MESSAGE); //CONSTANTE QUE EXISTE DENTRO DA CLASSE JOPTIONPANE, O "ERRO" VAI APARECER NO CABEÇALHO
			e.printStackTrace(); //erro aparece no console
			
		}
		
	}
	public void processoWindows() {
		
	}
	public void processoLinux() {
		
	}
}
