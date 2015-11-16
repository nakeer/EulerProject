import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class GridProduct {
	
	public static int rows =0;
	public static int ar = 20;
	public static int cr = 20;
	public static int[][] grid = new int[ar][cr];
	public static int max = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inputFile = new File("src/Resoruces/LargestGridProduct.txt");
		
		String tempStr = null;
		try {
			Scanner scan = new Scanner(inputFile);

			while (scan.hasNextLine()) {
				tempStr = scan.nextLine();
				StringBuffer strBuf = new StringBuffer();
				strBuf.append(tempStr);
				convertToIntArray(strBuf);
				if (tempStr.length() == 0)
					continue;
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		compute();
		
		System.out.println("MAX: "+max);
		
	}
	
	
	public static void convertToIntArray(StringBuffer strBuf){
		String inputString = strBuf.toString();
		String[] inputNumberString = inputString.split(" ");
		int[] inputNumbers = new int[ar];
		
		for(int i=0;i<inputNumbers.length;i++) {
			grid[rows][i] = Integer.parseInt(inputNumberString[i]);
			//System.out.print(" "+grid[rows][i]);
		}
		//System.out.println();
		rows++;	
	}
	
	public static void compute() {
		rowWise();
		columnWise();
		LRDiagonal();
		RLDiagonal();
	}
	
	public static void rowWise(){
		
		for(int row=0;row < ar;row++) {
			for(int column = 0; column <cr-3 ;column++) {
				int product = 1;
				int revProduct = 1;
				for (int k = column; k < column+4; k++) {
					product = product * grid[row][k];
				}
				if (product > max) {
					max = product;
				}
			}
		}
	}
	public static void columnWise() {
		for(int column=0;column < cr;column++) {
			for(int row = 0; row <ar-3 ;row++) {
				int product = 1;
				for (int k = row; k < row+4; k++) {
					product = product * grid[k][column];
				}
				
				if (product > max) {
					max = product;
				}
			}
		}
	}
	public static void LRDiagonal() {
		for(int row=0;row < ar-3;row++) {
			for(int column = 0; column <cr-3 ;column++) {
				int product = 1;
				for (int l= row,k = column; l < row+4 && k < column+4; l++, k++) {
					product = product * grid[l][k];
				}
				if (product > max) {
					max = product;
				}
			}
		}
	}
	public static void RLDiagonal(){
		
		for(int row=0;row < ar-3;row++) {
			for(int column = cr-1; column > 3 ;column--) {
				int product = 1;
				for (int l= row,k = column; l < row+4 && k < column+4; l++, k--) {
					System.out.println("["+l+"]["+k+"]");
					product = product * grid[l][k];
				}
				if (product > max) {
					max = product;
				}
				System.out.println("*******");
			}
		}
	}
	

}
