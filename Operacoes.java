package AvaliaFormativa;

import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double val1,val2,resultado=0;
		String operacao;
		
		System.out.print("Informe o valor 1: ");
		val1 = ler.nextDouble();
		
		System.out.print("Informe o valor 2: ");
		val2 = ler.nextDouble();
		
		System.out.print("Informe a operação desejada.. Sendo ela +(Adição), -(Subtração) ou *(Multiplicação): ");
		operacao = ler.next();
		
		if (operacao.equals("+")) {
			resultado = val1 + val2;
			System.out.println("O resultado da soma é "+resultado);
	}
		else if (operacao.equals("-")) {
			resultado = val1-val2;
			System.out.println("O resultado da subtração é "+resultado);
		}
		else if (operacao.equals("*")) {
			resultado = val1*val2;
			System.out.println("O resultado da multiplicação é "+resultado);
		}
		else {
			System.out.println("Sinal inválido!");
		}
		
		ler.close();
		

	}
}
