package recursiva;

public class RecursividadeTest {

	public static int calc(int x,int y) {
		

		if(y==1) {
			return x;
		}
		else {
			System.out.println("chamada funçao "+ y + x);
			return 1 + calc(x,y-1);
			
		}
		
		
		
	}
	public static void main(String[] args) {
		
		
		System.out.println(calc(2,3));
			

	}

	
	
}
