import java.util.HashMap;
import java.util.Map;

public class NumberLettersCount17New {
	
	private static StringBuffer sb;
	private static String s1,s2;
	private static int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,40,50,60,70,80,90,100,1000};
	private static String[] numWords = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven",
            "twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",
            "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","onehundred","onethousand"};

	public static void main(String[] args) {
		
		//System.out.println("n/100 : "+n/100+" n/10 : "+n/10+" n/1 : "+n/1);
		//System.out.println("n%100 : "+n%100+" n%10 : "+n%10+" n%1 : "+n%1);
		//System.out.println(getNumberName(52));
		int length = 0;
		for(int i = 1;i <= 1000;i++) {
			sb = new StringBuffer();
			s1=null;
			s2=null;
			String number = getName(i,100);
			System.out.println(i+ ": "+number);
			length += number.length();
		}
		System.out.println(length);
		
		
		                    
	}
	
	public static String getName(int number,int divider) {
		int quotient = number/divider;
		int remainder = number % divider;
		
		if(getNumberName(number) != null) {	
			if(s1 != null)
				sb.append(s1);
			if(s2 != null)
				sb.append(s2);
			return sb.append(getNumberName(number/1)).toString();
		} else if(number > 100) {
			if(number%100 ==0) {
				return getNumberName(quotient) + "hundred";
			} else {
				s1 = getNumberName(quotient) + "hundredand";
			}
			return getName(remainder,divider/10);
		} else if(number > 20 && number < 100) {
			s2 = getNumberName((quotient)*10);
			return getName(remainder,divider/10);
		} else if(number > 10 && number < 20) {
			s2 = getNumberName(quotient);
			return getName(remainder,divider/10);
		} 
		return sb.toString();
	}
	
	public static String getNumberName(int number) {
		for(int i=0;i<nums.length;i++){
			if(nums[i] == number){
				return numWords[i];
			}
		}
		return null;
	}
	
	

}
