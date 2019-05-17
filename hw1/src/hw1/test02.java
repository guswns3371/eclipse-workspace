package hw1;

import java.util.Scanner;

public class test02 {

	static final int BASE =1996,MON1=1,MON12=12;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int year,month,t_days=0,m_days=0;
		
		
		System.out.print("연도 입력 : ");
		year = in.nextInt();
		if (year < BASE) {
			System.out.println("연도 입력값 오류");
			in.close();
			return ;
		}
		
		System.out.print("월 입력 : ");
		month = in.nextInt();
		if (month<MON1 || month>MON12) {
			System.out.println("월 입력값 오류");
			in.close();
			return ;
		}
		
		t_days = days_in_the_year(year-1);
		
		for (int i = MON1; i < month; i++) {
			t_days += days_in_a_month(year, i);
		}
		
		
		System.out.printf("%11s%12s%12s%11s%12s%11s%12s\n","월","화","수","목","금","토","일");
		for (int i = 1; i <= (t_days%7); i++) {
			System.out.printf("%6s"," ");
		}
		
		m_days = days_in_a_month(year, month);
		for (int i = 1; i <=m_days; i++) {
			System.out.printf("%6d",i);
			if ( (i+t_days)%7 == 0) {
				System.out.println();
			}
		}
		
		in.close();
	}
	
	static boolean leap_year(int year) {
		if ((year%4==0 && year%100 !=0) || (year%400 ==0) ) 
			return true;
		else
			return false;
	}
	
	static int days_in_the_year(int year) {
		//final int BASE = 1996;
		int days =0;
		
		for (int i =1 ; i <= year; i++) {
			if (leap_year(year)) {
				days += 366;
			}else {
				days += 365;
			}
		}
		
		return days;
	}
	
	static int days_in_a_month(int year, int month) {
		int days =0;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			days = 31;
			break;

		case 4: case 6: case 9:
			days = 30;
			break;
		case 2:
			if (leap_year(year)) {
				days = 29;
			}else {
				days = 28;
			}
			break;
		}
		
		return days;
	}
}
