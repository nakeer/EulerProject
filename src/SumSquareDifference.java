

public class SumSquareDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0,squareTotal=0;
		for(int i=1;i<=100;i++){
			squareTotal+=i;
			total+=i*i;
		}
		
		System.out.println(squareTotal*squareTotal-total);
	}

}