
public class HighestTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =10000; i<Integer.MAX_VALUE;i++) {
			int total = getTotalForARow(i);
			int factors = getTotalNumberOfFactors(total);
			System.out.println("Total: "+total+" ,factors: "+factors );
			if(factors >= 500) {
				System.out.println("Total: "+total+"factors: "+factors );
				break;
			}
			else
				continue;
		}

	}

	public static int getTotalForARow(int rowNumber) {
		// n(n+1)
		//System.out.println((rowNumber*(rowNumber+1))/2);
		return (rowNumber*(rowNumber+1))/2;
		
	}
	
	public static int getTotalNumberOfFactors(int number) {
		int count =0;
		for(int i=2;i < number/2;i++) {
			if(number%i == 0) {
				count++;
			}
		}
		
		return count+2;
	}
	
	
	
}
