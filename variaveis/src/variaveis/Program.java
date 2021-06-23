package variaveis;

public class Program {

	public static void main(String[] args) {

		/*expressoes + operadores aritmeticos*/
	
		
		int[] vetor = new int[]{2,1,2,4,4,2,10,4,4,2};
		
													 
		for(int i=0; i < vetor.length;i++) {    			
				
			System.out.println(vetor[i]+ vetor[i+1]);
			i++;
		}
		
		/* i inicia com valor 0, enquanto i for menor ou igual 
		 * ao tamanho do vetor com lenght , i pós incrementa mais 1,
		 * no primeiro instante a leitura e feita da esquerda pra direita, depois da
		 * direita para esquerda.
		 */
		
			
	}

}
