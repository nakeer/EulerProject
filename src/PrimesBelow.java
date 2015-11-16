

public class PrimesBelow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long count=0,total=0;
		long i=1;
		while(i<2000000){
			if(isPrime(i)){
				//System.out.print(i+"-");
				total+=i;
			}
			i++;
			
		}
		System.out.println();
		System.out.println(" : "+total);
	}
	
	private static boolean isPrime(long n) {
		// TODO Auto-generated method stub
		if (n==2) return true;
		if (n%2==0 || n ==1) return false;
	    //if not, then just check the odds
	    for(long i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}