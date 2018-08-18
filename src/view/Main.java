package view;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para listar os processos e mata-los" + "\nDigite 9 para sair do programa"));
			switch(opc) {
			case 1:	
				break;
			case 2: System.exit(0);
				break;
			}
		}while(opc!=9);
	}
}
