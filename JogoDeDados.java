package aula25;

import java.util.Random;
import java.util.Scanner;

public class JogoDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("QUAL O SEU PALPITE? ");
		int palpite = sc.nextInt();
		
		Random n = new Random();
		int dado = n.nextInt(6)+1; // 0-5
		
		System.out.println("Palpite: " + palpite);
		System.out.println("Dado: " + dado);

		if(palpite == dado) {
			System.out.println("VOCÊ ACERTOU!!");
		}else {
			System.out.println("VOCÊ ERROU!");
		}
	}
}
