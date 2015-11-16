
public class EvenlyDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		while(i<10) {
			if(isDivisible(20*i)){
				System.out.println("Final: "+20*i+" with i= "+i);
				break;
			}
			i=i+2;
		}
	}
	
	public static boolean isDivisible(int num) {
		for(int i=19;i>1 ;i--) {
			System.out.println ("this is the num it is testing with "+num +" divided by "+ i);
			if (num%i==0 && (num/i)%2==0){
				System.out.println (num+"%"+i+"="+num%i+" - ("+num+"/"+i+")%2="+(num/i)%2);
				continue;
			}	
			else
				return false;
		}
		return true;
	}

}
