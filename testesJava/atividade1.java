package listaexercicio05;

import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			int IdadeAnos, IdadeMeses, IdadeDias, IdadeTotalDias;
			
			System.out.print("Calculadora de idade em dias\n\n");


			System.out.print("Digite os anos: ");
			IdadeAnos = leia.nextInt();
			
			System.out.print("Digite os meses: ");
			IdadeMeses = leia.nextInt();

			System.out.print("Digite os dias: ");
			IdadeDias = leia.nextInt();


			IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
			System.out.print("Idade total em dias = " + IdadeTotalDias + "\n");
			
		    }

		}

