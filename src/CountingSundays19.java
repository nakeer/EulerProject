
public class CountingSundays19 {

	private static final short startYear = 1900;
	private static final short endYear = 2000;
	
	public enum Month
	{
		JANUARY,
		FEBRUARY (28), 
		MARCH, 
		APRIL (30), 
		MAY, 
		JUNE (30),
		JULY, 
		AUGUST, 
		SEPTEMBER (30), 
		OCTOBER, 
		NOVEMBER(30), 
		DECEMBER;
		private int days;
		Month() {
			this.days = 31;
		}
		Month(int days) {
			this.days = days;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Start with year
		 * Check if its leap or not with %4 and %100 !=0 but %400 is ok
		 * have a total days count. start 1900 jan 1 as 0, so check if every 7th day is falling on the 1st of the month.
		 * if so add the sundays counter.  
		 */
		
		int totalDaysCount = 0;
		int sundaysCount = 0;
		
		for (short year = startYear; year <= endYear; year++) {
			if(!isYearLeapYear(year)) {
				for(Month month : Month.values()) {
					totalDaysCount = totalDaysCount + month.days;
					//System.out.println(totalDaysCount);
					if (isSundayTheFirst(totalDaysCount)) {
						if(year !=1900)
						sundaysCount++;
					}
				}
			}
			else {
				for(Month month : Month.values()) {
					if(month == Month.FEBRUARY){
						totalDaysCount = totalDaysCount + Month.FEBRUARY.days+1;
					} else {
						totalDaysCount = totalDaysCount + month.days;
					}
					if (isSundayTheFirst(totalDaysCount)) {
						sundaysCount++;
					}
				}
			}
			
		}
		System.out.println(sundaysCount);
	}
	
	public static boolean isYearLeapYear(short year) {
		return (year % 4 == 0 && year !=1900);			
	}
	
	public static boolean isSundayTheFirst(int days) {
		int value = (days+1) % 7;
		//System.out.println(value);
		if ( value == 0) {
			return true;
		} else
			return false;
	}

}
