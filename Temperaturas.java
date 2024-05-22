package AvaliaFormativa;

import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Double celsius,fah;
		
		System.out.print("Insira a temperatura em Fahrenheit: ");
		fah = ler.nextDouble();
		
		celsius = ((fah-32)*5)/9;
		
		System.out.println("A temperatura convertida em celsius é "+celsius);
		
		ler.close();
	}

}
