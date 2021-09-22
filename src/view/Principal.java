package view;

import javax.swing.JOptionPane;

import br.com.leandrocolevati.pilhastring.Pilha;
import controller.ControllerPalindromo;

public class Principal {

	public static void main(String[] args) {
		
		ControllerPalindromo cPalindromo = new ControllerPalindromo();
		Pilha pilha = new Pilha();
		String palavra;
		String palavraInvertida;
		
		palavra = JOptionPane.showInputDialog(null, "Digite uma palavra");
		palavraInvertida = cPalindromo.inerverterPalavra(palavra, pilha);
		
		if (cPalindromo.palindromo(palavra, palavraInvertida)) {
			
			System.out.println("A palavra " + palavraInvertida + " é um palindromo.");
			
		}
		
		else {
			
			System.out.println("A palavra " + palavra + " não é um palindromo.");
		
		}
			

	}

}
