package ATIVIDADE2;

import java.util.Scanner;

public class QUESTÃO8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Primeira Nota : ");
		int numI = entrada.nextInt();
		System.out.print("Segunda Nota : ");
		int numII = entrada.nextInt();
		if ((numII+numII)/2 >= 6) {
			System.out.println ("Aprovado");
		}
		else{
			System.out.println ("Reprovado");
		}
		entrada.close();
	}
}
