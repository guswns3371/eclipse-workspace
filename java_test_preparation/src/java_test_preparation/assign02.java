package java_test_preparation;

import java.util.Scanner;

public class assign02 {

	static final int BASE_YEAR=1996;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("년을 입력하세요 :");
		int year = input.nextInt();
		if (year<BASE_YEAR) {
			System.out.println("연도 입력 오류");
			return;
		}
		System.out.print("월을 입력하세요 :");
		int month = input.nextInt();
		if (month>12 || month<1) {
			System.out.println("월 입력 오류");
			return;
		}
		
		int days=0;
		for (int i = BASE_YEAR; i < year; i++) {
			days += days_in_a_leap_year(i);
		}
		
		for (int i = 1; i < month; i++) {
			days += days_in_a_month(i, year);
		}
		
		int start_day = (days%7);
		System.out.printf("%9s%9s%9s %9s%9s %9s%9s","월","화","수","목","금","토","일");
		System.out.println();
		for (int i = 0; i < start_day; i++) {
			System.out.printf("%5s"," ");
		}
		for (int i = 1; i <= days_in_a_month(month, year); i++) {
			
			System.out.printf("%5d",i);
			
			if ( (start_day+i)%7==0) {
				System.out.println();
			}
		}
		
		
		input.close();
	}
	
	static int days_in_a_month(int month, int year) {
		int days=0;
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				days=31;
			break;

		case 2:
				if (Is_Leap_Year(year)) {
					days=29;
				}else {
					days=28;
				}
			break;
		case 4:case 6:case 9:case 11:
				days=30;
			break;
		}
		return days;
	}
	
	static boolean Is_Leap_Year(int year) {
		if ( (year%4==0 && year%100 !=0) || year%400 ==0) {
			return true;
		}else {
			return false;
		}
	}
	
	static int days_in_a_leap_year(int year) {
		if (Is_Leap_Year(year)) {
			return 366;
		}else {
			return 365;
		}
	}

}
