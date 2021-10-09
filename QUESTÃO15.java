package ATIVIDADE2;

import java.util.Scanner;

public class QUESTÃO15 {

	public static void main (String[]args)
	{
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.print ("Digite o Codigo do Produto : ");
		int codigo = entrada.nextInt ();
		System.out.print ("Qual o preço de custo do produto? : ");
		int valor = entrada.nextInt ();
		if (codigo == 1){
			System.out.println ("Origem sul");
			System.out.println ("preco :" + valor);	
		if (codigo == 2) 
			System.out.println ("Origem sul");
			System.out.println ("preco :" + valor);
		if (codigo == 3) 
			System.out.println ("Origem Leste");
			System.out.println ("preco :" + valor);
		if (codigo == 4) 
			System.out.println ("Origem Oeste");
			System.out.println ("preco :" + valor);
		if ((codigo == 5)|(codigo == 6)) 
			System.out.println ("Origem nordeste");
			System.out.println ("preco :" + valor);
		if ((codigo == 7)|(codigo == 8)) 
			System.out.println ("Origem Centro-oeste");
			System.out.println ("preco :" + valor);
		}
		else {
			System.out.println ("Produto importado");
		}
		entrada.close ();
	}
}
