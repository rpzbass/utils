package br.com.empresa;

public class App {

	public static void main(String[] args) {
	
		
		final int TAM = 5;
		int[] exem1 = new int [TAM];
		
		int[] exem2 = new int[] {1,2,3,4}; // unidimensional
		
		int[][] exemp3 = new int[2][2];    //multidimesional, composto por dois arrays 0[0,1] 1[0,1];
		
		//FORMA VERBOSA
		
		for(int i =0;i<exemp3.length;i++) {
		
			for(int j=0;j<exemp3[i].length;j++) {
				
				exemp3[i][j] = i+1;
		
				System.out.print(exemp3[i][j] + " ");
			
			}
		
		}
		
		System.out.print("\n---------------------------------\n");
		
		
		//FORMA RESUMIDA
		
		for(int[] ex: exemp3 ) {
			
			for(int x : ex) {
				
				System.out.print( x + " ");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
