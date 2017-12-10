package exam3;
/*
 * Exam 3 Program 2
 */

public class DateUtil {

	private int year=0, month=0, day=0;
	private static String calendar[][][] = new String[10000][13][32];	// calendar[year][month][day]
	
	public DateUtil(){
		
		buildCalendar();	// builds calendar with year bounds of 1 to 9999
	}
	
	public DateUtil(int y, int m, int d){
		
		// assign instance variables
		year = y;
		month = m;
		day = d;
		
		// build calendar
		buildCalendar();
	}
	
	public boolean isLeapYear(){
		
		// check to see if year is leap year
		if(year%4==0) return true;
		else return false;
	}
	
	public boolean isLeapYear(int year){
		
		// check to see if year is leap year
		if(year%4==0) return true;
		else return false;
	}
	
	public boolean isValidDate(){	// check to see if the input date is a valid date
		
			// check bounds
		if (year>9999||year<1){
			System.out.println("Error: invalid year entered");
			return false;
		}
		if (month>12||month<1){
			System.out.println("Error: invalid month entered");
			return false;
		}
		if (day>31||day<1){
			System.out.println("Error: invalid day entered");
			return false;
		}
			// check for leap day
		if (isLeapYear(year)&&month==2&&day==29){
			System.out.println("Date is valid");
			return true;
		}
		if (isLeapYear(year)==false&&month==2&&day>28){
			System.out.println("Date is invalid");
			return false;
		}
			// check calendar contents
		if (calendar[year][month][day].isEmpty()){
			System.out.println("Date is invalid");
			return false;
		}
		else{
			System.out.println("Date is valid");
			return true;
		}
	}
	
	public boolean isValidDate(int year, int month, int day){	// check to see if the input date is a valid date
		
			// check bounds
		if (year>9999||year<1){
			System.out.println("Error: invalid year entered");
			return false;
		}
		if (month>12||month<1){
			System.out.println("Error: invalid month entered");
			return false;
		}
		if (day>31||day<1){
			System.out.println("Error: invalid day entered");
			return false;
		}
			// check for leap day
		if (isLeapYear(year)&&month==2&&day==29){
			System.out.println("Date is valid");
			return true;
		}
		if (isLeapYear(year)==false&&month==2&&day>28){
			System.out.println("Date is invalid");
			return false;
		}
			// check calendar contents
		if (calendar[year][month][day].isEmpty()){
			System.out.println("Date is invalid");
			return false;
		}
		else{
			System.out.println("Date is valid");
			return true;
		}
	}
	
	public void buildCalendar(){	// creates a calendar using a three dimensional array
		
		for (int i=1; i<=9999;i++){
			if (isLeapYear(i))
				for (int j=1; j<=29; j++){
					calendar[i][2][j] = "February "+j+", "+i;
				}
			else
				for (int j=1; j<=28; j++){
					calendar[i][2][j] = "February "+j+", "+i;
				}
			
			for (int j=1; j<=30; j++){
				calendar[i][4][j] = "April "+j+", "+i;
				calendar[i][6][j] = "June "+j+", "+i;
				calendar[i][9][j] = "September "+j+", "+i;
				calendar[i][11][j] = "November "+j+", "+i;
			}
			for (int j=1; j<=31; j++){
				calendar[i][1][j] = "January "+j+", "+i;
				calendar[i][3][j] = "March "+j+", "+i;
				calendar[i][5][j] = "May "+j+", "+i;
				calendar[i][7][j] = "July "+j+", "+i;
				calendar[i][8][j] = "August "+j+", "+i;
				calendar[i][10][j] = "October "+j+", "+i;
				calendar[i][12][j] = "December "+j+", "+i;
			}
		}
	}
	
//	public void buildCalendar(int year){	// builds calendar up to input year (saves on memory and time)
//		
//		for (int i=1; i<=year;i++){
//			if (isLeapYear(i))
//				for (int j=1; j<=29; j++){
//					calendar[i][2][j] = "February "+j+", "+i;
//				}
//			else
//				for (int j=1; j<=28; j++){
//					calendar[i][2][j] = "February "+j+", "+i;
//				}
//			
//			for (int j=1; j<=30; j++){
//				calendar[i][4][j] = "April "+j+", "+i;
//				calendar[i][6][j] = "June "+j+", "+i;
//				calendar[i][9][j] = "September "+j+", "+i;
//				calendar[i][11][j] = "November "+j+", "+i;
//			}
//			for (int j=1; j<=31; j++){
//				calendar[i][1][j] = "January "+j+", "+i;
//				calendar[i][3][j] = "March "+j+", "+i;
//				calendar[i][5][j] = "May "+j+", "+i;
//				calendar[i][7][j] = "July "+j+", "+i;
//				calendar[i][8][j] = "August "+j+", "+i;
//				calendar[i][10][j] = "October "+j+", "+i;
//				calendar[i][12][j] = "December "+j+", "+i;
//			}
//		}
//	}
	
	public String getDate(){
		
		return calendar[year][month][day];
	}
	public String getDate(int year, int month, int day){
		
		return calendar[year][month][day];
	}
}
