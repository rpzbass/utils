package guardachuvas;

import java.util.Scanner;

public class SistemaGuardaChuvasTest {

	public static void main(String[] args) {

		
		Scanner leitor = new Scanner(System.in);
		int diasPrevisao = leitor.nextInt();
		
		int i = 1;

		int casaComprado = 0;
		int casa = 0;
		int trabComprado = 0;
		int trab = 0;

		for (; i <= diasPrevisao; i++) {

			String idaTrabalho = leitor.next().toLowerCase();
			String voltaCasa = leitor.next().toLowerCase();
			
			if (idaTrabalho.equals("sol") && voltaCasa.equals("chuva")) {
			
				if (trab == 0) {
					trabComprado++;
					casa++;
				} else if (trab > 0) {
					casa++;
					trab--;
				}
			}else if(idaTrabalho.equals("chuva") && voltaCasa.equals("sol")) {
				
				if(casa == 0) {
					casaComprado++;
					trab++;
				}else if(casa > 0) {
					
					trab++;
					casa--;
				}
			}else if(idaTrabalho.equals("chuva") && voltaCasa.equals("chuva")) {
				
				if(casa == 0) {
					casaComprado++;
					casa++;
				}
			}		
		}
		
		System.out.println("Casacomprado: "+ casaComprado + " " + " Trabalho Comprado: "+ trabComprado );
		System.out.println("\nGuardados em casa: "+ casa);
		System.out.println("\nGuardados no trab: "+ trab);
		
		leitor.close();

	}

	
}
