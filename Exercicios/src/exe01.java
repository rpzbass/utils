import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
	
		/*
			1.Fa�a um programa que leia dois valores num�ricos inteiros e apresente o resultado da diferen�a 
			do maior valor pelo menor valor.Se os valores forem iguais, o programa deve mostrar zero.
		*/
		int n1,n2;
		Scanner input = new Scanner(System.in);
		
			n1 = input.nextInt();
			n2 = input.nextInt();
		
		if(n1 > n2) {
			
			System.out.printf("diferen�a �  %d",n1-n2);
		
		}else if(n2 > n1) {
			
			System.out.printf("difen�a � %d", n2-n1);
		}else if (n1 == n2) {
			
			System.out.printf("diferen�a � %d ", n1-n2);
		}
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
