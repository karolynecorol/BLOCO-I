package listaexercicio05;

import java.util.Scanner;

public class atividade2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int meses = 12, diasDoAno = 365, dia, anoDoNasc, idade;

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        System.out.println("Digite o dia do seu anivers�rio: ");
        dia = leia.nextInt();

        System.out.println("Digite o m�s do seu anivers�rio: ");
        meses = leia.nextInt();

        System.out.println("Digite o ano do seu nascimento: ");
        anoDoNasc = leia.nextInt();


        System.out.println("Sua idade em dias �: " + idade * diasDoAno);

        leia.close();
	
	}
}
