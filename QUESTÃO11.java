package ATIVIDADE2;

import java.util.Scanner;

public class QUESTÃO11 {

	public static void main(String[] args) {

		
	Scanner entrada = new Scanner(System.in);
	System.out.print("Que turno você estuda? (m) = Matutino ; (v) Vespertino ; (n) Noturno : ");
	String letra = entrada.nextLine();

	if ((letra.equals("m"))) {
	System.out.println("Bom Dia");
	}
	else {
				
	if ((letra.equals("v"))) { 
	System.out.print("Boa Tarde");
	}
	else {			
	System.out.println ("Boa Noite");
	}
		}
			entrada.close();
		}
  }


