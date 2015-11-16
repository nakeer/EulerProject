import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class PalindromeFactor {
	
	private static int MAX = 0;
	public static void main(String[] args) {
		int start = 999 * 999;
		for (int i = start;i > 0; i--){
			isPalindrome(i);
		}
			
		System.out.println(MAX);
	}

	public static void factors(int number) {
		ArrayList list = new ArrayList();
		for(int i =2 ; i < number; i++ ) {
			if( number%i == 0) {
				if(i > 100 && i < 1000 && number/i > 100 && number/i < 1000) {
					//System.out.println( i + " : " + number/i);	
					if (number > MAX){
						MAX = number;	
					}
					
				}
			}
		}
	}
	
	public static void isPalindrome(int number) {
		Integer num = number;
		String str = num.toString();
		
		Stack stack = new Stack();
		char[] charArray = new char[str.length()];
		for(int i = 0;i <str.length();i++) {
			stack.push(str.charAt(i));
		}
		
		for(int i =0;i<str.length();i++) {
			charArray[i] = (char) stack.pop();
		}
		
		String newStr = String.valueOf(charArray);
		
		//System.out.println(newStr);
		if(str.equals(newStr)){
			factors(number);
		} 
		
	}
}
