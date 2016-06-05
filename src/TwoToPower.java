import javax.swing.plaf.synth.SynthSeparatorUI;

public class TwoToPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9223372036854775807
		int base = 2;
		int power = 1000;
		int answer =0;
		String s1 = ((Long)Double.valueOf(recToPower(base,power)).longValue()).toString();
		//System.out.printf("%1$.300f",recToPower(base,power));
		String s = "10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958581275946729175531468251871452856923140435984577574698574803934567774824230985421074605062371141877954182153046474983581941267398767559165543946077062914571196477686542167660429831652624386837205668069376";
		for(int i =0;i <s.length();i++){
			answer+=Integer.parseInt(s.charAt(i)+"");
		}
		System.out.println(answer);
	}
	
	public static double recToPower(int base, int power) {
		if (power == 0) {
			return 1;
		} else {
			return base * recToPower(base, power-1);
		}
	}

}
