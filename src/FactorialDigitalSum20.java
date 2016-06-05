import java.math.BigDecimal;

public class FactorialDigitalSum20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BigDecimal.valueOf(factorial(100)));
		BigDecimal bd = new BigDecimal(factorial(100));
		System.out.println(bd.longValue());
	}
	
	public static double factorial(int n) {
		if (n==1) {
			return 1;
		}
		else
			return n * factorial(n-1);
	}

}
