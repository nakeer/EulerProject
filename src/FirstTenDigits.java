import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FirstTenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inputFile = new File("src/Resoruces/150.txt");
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
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String input = strBuf.toString();
		int k=0;
		int[][] TwoDarray = new int[100][50];
		for(int i=0;i<100;i++){
			for(int j=0;j<50;j++) {
				TwoDarray[i][j] = Integer.valueOf(input.charAt(k++)+"");
			}
		}
		
		topTen(TwoDarray);
		
	}
	
	public static void topTen(int[][] twoD) {
		int[] buffer = new int[50];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int column = 49;column >=0; column--) {
			int indiSum =0;
			for (int row =0;row < 100;row++) {
				indiSum+=twoD[row][column];
				indiSum+=buffer[column];
				if(column != 0){
					buffer[column-1] = indiSum/10;	
				}
				
				System.out.println(indiSum);
			}
		}
	}

}
