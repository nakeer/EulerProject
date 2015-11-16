package old;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LargestProduct {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inputFile = new File("src/old/input.txt");
		StringBuffer strBuf = new StringBuffer();
		String tempStr = null;
		try {
			Scanner scan = new Scanner(inputFile);

			while (scan.hasNextLine()) {
				tempStr = scan.nextLine();
				strBuf.append(tempStr);
				if (tempStr.length() == 0)
					continue;
			}
			perform(strBuf);
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void perform(StringBuffer strBuf){
		String inputString = strBuf.toString();
		int[] numbers = new int[inputString.length()];
		for(int i=0;i<inputString.length();i++){
			numbers[i] = Integer.parseInt(((Character)inputString.charAt(i)).toString());
		}
		//System.out.println(numbers[0]+" "+numbers[998]);
		calculateProduct(numbers);
	}
	
	public static void calculateProduct(int[] num){
		System.out.println(num.length);
		long temp = 0;
		long product=1;
		for(int i=0;i<num.length-12;i++){
			
			for(int j=i;j<i+13;j++){
				product *=num[j];
			}
			System.out.println(product);
			if(product > temp)
				temp = product;
			product =1;
			
		}
		
		System.out.println("******"+temp);
	}

}