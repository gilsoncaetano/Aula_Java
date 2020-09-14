package Exerc�cios;

import java.util.Scanner;

/**
 *
 * @author Vinicius Bueno Silva
 *
 */

public class Tema {

	public static void main(String[] args) {
		int primeiraJogada, segundaJogada, computador, computador2; 
		Scanner leitor = new Scanner(System.in);
		System.out.println("------JOGO DOS PARES------");
		System.out.println("");
		System.out.println("Idealizado por Vinicius Bueno");
		System.out.println("Executado por Gabriel Costa e Vinicius Bueno");
		System.out.println("");
		System.out.println("O jogo consiste em adivinhar um par de frutas. Todos os jogadores"
				+ " possuem 2 chances, cada 'virada' de carta � descontado de suas chances."
				+ " Quem encontrar o par primeiro ganha.");
		System.out.println("");
		System.out.println("As frutas que est�o no jogo s�o: Banana, Morango, Abacaxi, Cereja,"
				+ " Kiwi, Laranja, Ma�� e Uva.");
		System.out.println("");
		System.out.println("Digite um n�mero entre 1 e 8: ");
		primeiraJogada = leitor.nextInt();
		System.out.println("");
		switch (primeiraJogada) {
		case 1:
			System.out.println("Voc� escolheu Banana");
			break;
		case 2:
			System.out.println("Voc� escolheu Morango");
			break;
		case 3:
			System.out.println("Voc� escolheu Abacaxi");
			break;
		case 4:
			System.out.println("Voc� escolheu Cereja");
			break;
		case 5:
			System.out.println("Voc� escolheu Kiwi");
			break;
		case 6:
			System.out.println("Voc� escolheu Laranja");
			break;
		case 7:
			System.out.println("Voc� escolheu Ma��");
			break;
		case 8:
			System.out.println("Voc� escolheu Uva");
			break;
		default:
			System.out.println("N�MERO INV�LIDO! Comece de novo.");
			break;
		}
		
		if (primeiraJogada > 8 ) {
			System.exit(0);
		}

		System.out.println("");
		System.out.println("Digite outro n�mero entre 9 e 16: ");
		segundaJogada = leitor.nextInt();
		System.out.println("");
		
		switch (segundaJogada) {
		case 9:
			System.out.println("Voc� escolheu Morango");
			break;
		case 10:
			System.out.println("Voc� escolheu Uva");
			break;
		case 11:
			System.out.println("Voc� escolheu Banana");
			break;
		case 12:
			System.out.println("Voc� escolheu Cereja");
			break;
		case 13:
			System.out.println("Voc� escolheu Abacaxi");
			break;
		case 14:
			System.out.println("Voc� escolheu Laranja");
			break;
		case 15:
			System.out.println("Voc� escolheu Kiwi");
			break;
		case 16:
			System.out.println("Voc� escolheu Ma��");
			break;
		default:
			System.out.println("N�MERO INV�LIDO! Comece de novo. ");
			break;
		}
		if (segundaJogada < 9 || segundaJogada > 16 ) {
			System.exit(0);
		}
			
		if ( primeiraJogada == 1 && segundaJogada == 11 || primeiraJogada == 2 && segundaJogada == 9 || primeiraJogada == 3 && segundaJogada == 13 || primeiraJogada == 4 && segundaJogada == 12 || primeiraJogada == 5 && segundaJogada == 15 || primeiraJogada == 6 && segundaJogada == 14 || primeiraJogada == 7 && segundaJogada == 16 || primeiraJogada == 8 && segundaJogada == 10) {
				System.out.println("Voc� VENCEU!");
				System.exit(0);
		} 
		
		System.out.println("");
		System.out.println("_______________________________________________");
		System.out.println("");
		computador = (int) (Math.random() * 8 + 1);
		switch (computador) {
		case 1:
			System.out.println("O Computador escolheu Banana");
			break;
		case 2:
			System.out.println("O Computador escolheu Morango");
			break;
		case 3:
			System.out.println("O Computador escolheu Abacaxi");
			break;
		case 4:
			System.out.println("O Computador escolheu Cereja");
			break;
		case 5:
			System.out.println("O Computador escolheu Kiwi");
			break;
		case 6:
			System.out.println("O Computador escolheu Laranja");
			break;
		case 7:
			System.out.println("O Computador escolheu Ma��");
			break;
		case 8:
			System.out.println("O Computador escolheu Uva");
			break;
		}
		
	System.out.println("");
	computador2 = (int) (Math.random() * 8 + 9);
	switch (computador2) {
	case 9:
		System.out.println("O Computador escolheu Morango");
		break;
	case 10:
		System.out.println("O Computador escolheu Uva");
		break;
	case 11:
		System.out.println("O Computador escolheu Banana");
		break;
	case 12:
		System.out.println("O Computador escolheu Cereja");
		break;
	case 13:
		System.out.println("O Computador escolheu Abacaxi");
		break;
	case 14:
		System.out.println("O Computador escolheu Laranja");
		break;
	case 15:
		System.out.println("O Computador escolheu Kiwi");
		break;
	case 16:
		System.out.println("O Computador escolheu Ma��");
		break;
	} 
		
		System.out.println("_______________________________________________");
		System.out.println("");
		if ( computador == 1 && computador2 == 11 || computador == 2 && computador2 == 9 || computador == 3 && computador2 == 13 || computador == 4 && computador2 == 12 || computador == 5 && computador2 == 15 || computador == 6 && computador2 == 14 || computador == 7 && computador2 == 16 || computador == 8 && computador2 == 10) {
			System.out.println("Computador VENCEU!");
			System.out.println("Voc� PERDEU!");
		} else {
			System.out.println("Os dois PERDERAM! Tente novamente.");
		}
		

		
		leitor.close();
		}

	}