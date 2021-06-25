package collectionTest;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		int i = 0;
		for(;i<=50;i++) {
			System.out.println("numero : "+ i + " "+ fibonacci(i));
		}
	}

	public static int fibonacci(int num) {
		
		if(num < 2) 
			return num;
		
		
		return fibonacci(num -1) + fibonacci(num-2);
		
	}
	
	
	
}
