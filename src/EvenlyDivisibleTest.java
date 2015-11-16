
public class EvenlyDivisibleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		while(true) {
			if(isDivisible(20*x)){
				System.out.println("Final: "+20*x+" with i= "+x);
				break;
			}
			x=x+2;
		}
	}
	
	public static boolean isDivisible(int num) {
		for(int i=19;i>1 ;i--) {
			System.out.println ("this is the num it is testing  "+num +" with "+ i);
			if (num%i==0 && (num/i)%2==0){
				System.out.println (num+"%"+i+"="+num%i+" and is it even ("+num+"/"+i+")%2="+(num/i));
				continue;
			}	
			else
				return false;
		}
		return true;
	}

}
