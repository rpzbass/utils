package bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class BigDecimalTest {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        double x = leitor.nextDouble();
        BigDecimal[] n = new BigDecimal[100];
        n[0] = new BigDecimal(x).setScale(6,RoundingMode.HALF_EVEN);
        
        for (int i=1;i<100;i++) {
        	  BigDecimal temp = n[i-1];
        	  n[i] = temp.divide(new BigDecimal("2.00"),MathContext.UNLIMITED);
        }
        
        for (int i=1;i<100;i++) {
        	System.out.println(String.format("N["+ i + "] = %.4f \n", n[i].setScale(6,RoundingMode.HALF_EVEN)));
        }
		leitor.close();

	}

}
