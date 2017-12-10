package exam3;

import java.util.*;

public class Exam3Program2 {

	public static void main(String[] args) {

		System.out.println("Test of DateUtil Class");
		System.out.println("----------------------");
		
		// test the validity method - TEST PASSES
//		System.out.println("\nTest validity method");
//		DateUtil firstDate = new DateUtil(2014, 12, 24);
//		System.out.println("Date: 2014, 12, 24");
//		if (firstDate.isValidDate()) System.out.println("Date is valid");
//		else System.out.println("Date is invalid");
		
		// test the leap year method - TESTS PASS
//		System.out.println("\nTest leap year method");
//		DateUtil secondDate = new DateUtil(2014, 2, 29);
//		System.out.println("Date: 2014, 2, 29");
//		if (secondDate.isValidDate()) System.out.println("Date is valid");
//		else System.out.println("Date is invalid");
//		
//		DateUtil thirdDate = new DateUtil(2012, 2, 29);
//		System.out.println("Date: 2012, 2, 29");
//		if (thirdDate.isValidDate()) System.out.println("Date is valid");
//		else System.out.println("Date is invalid");
		
		// test the bounds of the calendar - TESTS PASS
//		System.out.println("\nTest calendar bounds");
//		DateUtil fourthDate = new DateUtil(10001, 1, 12);
//		System.out.println("Date: 10001, 1, 12");
//		if (fourthDate.isValidDate()) System.out.println("Date is valid");
//		else System.out.println("Date is invalid");
//		
//		DateUtil fifthDate = new DateUtil(-25, 5, 15);
//		System.out.println("Date: -25, 5, 15");
//		if (fifthDate.isValidDate()) System.out.println("Date is valid");
//		else System.out.println("Date is invalid");
//		
//		DateUtil sixthDate = new DateUtil(2015, 13, 5);
//		System.out.println("Date: 2015, 13, 5");
//		if (sixthDate.isValidDate()) System.out.println("Date is valid");
//		else System.out.println("Date is invalid");
//		
//		DateUtil seventhDate = new DateUtil(2015, 0, 6);
//		System.out.println("Date: 2015, 0, 6");
//		if (seventhDate.isValidDate()) System.out.println("Date is valid");
//		else System.out.println("Date is invalid");
//		
//		DateUtil eighthDate = new DateUtil(2015, 7, 32);
//		System.out.println("Date: 2015, 7, 32");
//		if (eighthDate.isValidDate()) System.out.println("Date is valid");
//		else System.out.println("Date is invalid");
//		
//		DateUtil ninthDate = new DateUtil(2015, 7, 0);
//		System.out.println("Date: 2015, 7, 0");
//		if (ninthDate.isValidDate()) System.out.println("Date is valid");
//		else System.out.println("Date is invalid");
		
		// test the whole DateUtil class with an input date using a keyboard scanner
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter date...");
		System.out.print("[year]: ");
		int year = kb.nextInt();
		System.out.print("[month]: ");
		int month = kb.nextInt();
		System.out.print("[day]: ");
		int day = kb.nextInt();
		System.out.println("----------------------");
		// test 1: test using constructor with parameters and easy methods
		System.out.println("Test 1 of DateUtil class");
		DateUtil testDateUtil_1 = new DateUtil(year, month, day);
		System.out.println("\nTest 'isValidDate()' method");
		testDateUtil_1.isValidDate();
		System.out.println("Test 'isLeapYear()' method");
		System.out.println(testDateUtil_1.isLeapYear());
		System.out.println("Test 'getDate()' method");
		System.out.println(testDateUtil_1.getDate());
		System.out.println("----------------------");
		// test 2: test using constructor with no parameters and methods with parameters
		System.out.println("Test 2 of DateUtil class");
		DateUtil testDateUtil_2 = new DateUtil();
		System.out.println("\nTest 'isValidDate(int year, int month, int day)' method");
		testDateUtil_2.isValidDate(year, month, day);
		System.out.println("Test 'isLeapYear(int year)' method");
		System.out.println(testDateUtil_2.isLeapYear(year));
		System.out.println("Test 'getDate(int year, int month, int day)' method");
		System.out.println(testDateUtil_2.getDate(year, month, day));
		System.out.println("----------------------");
		kb.close();
	}

}
