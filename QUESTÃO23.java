package ATIVIDADE2;

import java.util.Scanner;

public class QUESTÃO23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual a idade do primeiro aluno?: ");
		int n1 = entrada.nextInt();
		System.out.print("Qual a idade do segundo aluno?: ");
		int n2 = entrada.nextInt();
		System.out.print("Qual a idade do terceiro aluno?: ");
		int n3 = entrada.nextInt();
		float media = (float) ((n1 + n2 + n3) / 3);
		System.out.println("A média de idade dos alunos é: " + media);
		if (media < 25) {
		System.out.println("Jovens");
		}
		else if ((media > 25) && (media <= 40)) {
		System.out.println("Adultos");
		} else {
		System.out.println("Idosos");
		}
		entrada.close();
	}
}