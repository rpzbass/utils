import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		/*
		 * 2.Fa?a um programa que leia um valor num?rico inteiro. O programa deve
		 * apresentar a mensagem ?O valor est? na faixa permitida?, caso o valor
		 * informado esteja entre 1 e 9. Se o valor estiver fora da faixa, o programa
		 * deve apresentar a mensagem ?O valor est? fora da faixa permitida?
		 */

		Scanner input = new Scanner(System.in);

		int numero = input.nextInt();

		if (numero >= 1 && numero <= 9) {
			
			System.out.println("valor est? na faixa permitida");
		
		} else {

			System.out.println("valor est? fora da faixa permitida");

		}
			input.close();
	}

}
