package AvaliaFormativa;

import java.util.Scanner;

public class AreaQuadrada {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int area,lado;
		
		System.out.print("Insira o tamanho do lado da figura.. ");
		lado = ler.nextInt();
		
		area = lado*lado;
		
		System.out.println("A área da figura é "+area);
		ler.close();
	}

}
