
public class LatticePaths15 {

	private static double rows=21,columns =21, totalCount=0;
	public static void main(String[] args) {
		recCountPaths(0, 0);
		System.out.println(Double.valueOf(totalCount).longValue());
	}
	
	public static void recCountPaths(double row, double column) {
		if(row == rows-1 && column == columns-1) {
			totalCount++;
			return;
		} else if (row < rows && column == columns-1) {
			recCountPaths(row+1, column);
		} else if (column < columns && row ==rows-1) {
			recCountPaths(row, column+1);
		} else {
			recCountPaths(row+1, column);
			recCountPaths(row, column+1);
		}
	}

	
}
