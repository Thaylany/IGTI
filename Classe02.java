package Pacote02;

import java.util.Scanner;

public class Classe02 {

	public static void main(String[] args) {
		int valor1=0,valor2=75, valor3=0;
		Scanner ent =  new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro para a variavel valor1:");
		valor1 = ent.nextInt();
		valor2 += valor1;
		
		if (valor1 % 2==0) // Saber se o n�mero � par.
			valor3 = valor1 * 5;
		else if (valor1 % 3==0) // Saber se o n�mero � �mpar.
			valor3 = valor2 * 9;
		else
			valor3 = valor2;
		System.out.printf("O valor da vari�vel valor3 �: %d.", valor3);
		
		System.out.printf(" %d.", valor2);
	}

}
