import java.util.*;

public class Collatz14 {

	private static List<Double> nums;
	private static Map<Double, Double> map = new HashMap<Double, Double>();
	private static int count = 0;
	public static void main(String[] args) {
		double max=0,temp = 0, forI =0;
		
		for(double i =1;i<=1000000; i++){
			count = 0;
			temp = recCollatz(i);
			map.put(i, temp);
			if (max < temp) {
				max = temp;
				forI = i;
			}
		}
		System.out.println(forI);
	}
	
	public static double recCollatz(double n) {
		if (n ==1) {
			count++;
			return count;
		}
		else if (map.containsKey(n)) {
			return count + map.get(n);
		}
		else if(n%2==0 ) {
			count++;
			return recCollatz(n/2);
		} else {
			count++;
			return recCollatz(3*n+1);
		} 
	}
}
