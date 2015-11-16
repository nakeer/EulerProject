package old;

public class NthPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int i=1;
		while(count!=10002){
			if(isPrime(i)){
				count++;
				
			}
				i++;
			
		}
		
		System.out.println(i-1 +" :"+count);
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		for(int i=2;i<num;i++){
			if(num%i==0)
				return false;
		}
		return true;
	}

}
