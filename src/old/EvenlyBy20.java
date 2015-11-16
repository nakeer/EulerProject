package old;

public class EvenlyBy20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i < Integer.MAX_VALUE; i = i + 2) {
			int num = 20 * i;
			if (isDivByall(num)) {
				System.out.println(num);
				break;
			}
		}
	}

	public static boolean isDivByall(int num) {
		//System.out.println(num);
		for (int i = 1; i < 20 ; i++) {
			if (num % i == 0)
				continue;
			else
				return false;
		}
		return true;
	}
}