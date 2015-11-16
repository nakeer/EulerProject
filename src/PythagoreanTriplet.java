


public class PythagoreanTriplet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1;i<=332;i++){
			for(int j=i+1;j < 1000-i-j;j++){
				int k = 1000-i-j;
				if(i*i + j*j == k*k){
					System.out.println(i*j*k);
					System.exit(0);
				}
			}
		}
	}

}