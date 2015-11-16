
public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = 600851475143.0;
		//double number = 13195.0;
		isFactor(number);

	}
	
//	public static void isFactor(double number) {
//		for(double i =Math.round(number/2); i > 0; i--) {
//			System.out.println("Checking for number: "+ i);
//			if(number%i == 0) {
//				if(isPrime(i)) {
//					System.out.println(i);
//					break;
//				}
//			}	
//		}
//	}
	
	public static void isFactor(double number) {
		for(double i =2 ; i < number; i++ ) {
			double output = number/i;
			if (output == Math.round(output)) {
				System.out.println("Testing prime for :"+ output);
				if(isPrime(output)){
					System.out.println("Finalllllllllllllllllllllllll: "+output);
					break;
				}
					
			}
			
			
		}
	}
	
	public static boolean isPrime(double n) {
		if (n%2==0) return false;
	    //if not, then just check the odds
	    for(double i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
