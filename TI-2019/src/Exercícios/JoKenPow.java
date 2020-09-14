package Exerc�cios;

import java.util.Scanner;

/**
 * @author Gilson Caetano
 * Atividade do Jogo JoKenPow
 * Trabalhando com IF Else IF Else.
 *
 */
public class JoKenPow {

	public static void main(String[] args) {
		// Elementos que ser�o apresentado
		int jogador;
		Scanner jogo = new Scanner(System.in);
		System.out.println("");
		// Entrada dos elementos
		System.out.println("___G___JoKenPow____C__");
		System.out.println("");
		System.out.println("1. Papel");
		System.out.println("2. Tesoura");
		System.out.println("3. Pedra");
		System.out.println("Escolha  Seu Jogo: ");
		// Procesamento do resultado do jogador	
		jogador = jogo.nextInt();
		System.out.println("");
		if (jogador == 1) {
			System.out.println("Jogador escolhel PAPEL");			
		} else if (jogador == 2) {
			System.out.println("Jogador escolhel TESOURA");
		} else if (jogador == 3) {
			System.out.println("Jogador escolhel PEDRA");
		} else {
			System.out.println("VOC� IDGITOU A OP��O INVALIDA ");
		}
		jogo.close();
		
		// entrada dos elementos para escolha da Maquina
		System.out.println("______________________________");
		int maquina;
		maquina = (int) (Math.random() * 3 + 1);
		if (maquina == 1) {
			System.out.println("Maquina escolhel PAPEL");			
		} else if (maquina == 2) {
			System.out.println("Maquina escolhel TESOURA");
		} else if (maquina == 3) {
			System.out.println("Maquina escolhel PEDRA");
		} else {
			System.out.println("VOC� IDGITOU A OP��O INVALIDA ");
		}
		System.out.println("______________________________");
		// Saida dos resultados do jogo final
		if (maquina == jogador) {
		 if ((maquina==1 && jogador==3)||(maquina == 2 && jogador==1)||(maquina==3 && jogador==2)) {
			System.out.println("MAQUINA VENCEU.");
			
			} else 
			System.out.println("JOGADOR VENCEU.");			
	  	    } else {
			System.out.println("JOGO DEU EMPATE. ");		  
		
	  }
   }
}
