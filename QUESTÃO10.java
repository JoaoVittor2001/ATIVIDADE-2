package ATIVIDADE2;

import java.util.Scanner;

public class QUEST�O10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int valor[] = new int[3];
		int maior = 0, menor = 0; 
		for(int i = 0; i < valor.length; i++){
		System.out.print("Digite o " +(i+1)+"� valor: ");
		valor[i] = sc.nextInt();
		if(valor[i] > maior){ 
		maior = valor[i];
		}
		}
		for (int j = 0; j < valor.length; j++) {
		if(valor[j] < menor){
		menor = valor[j];
		}
		}
		System.out.println("Maior valor = "+ maior);
		System.out.println("Menor valor = "+ menor);
	}
}