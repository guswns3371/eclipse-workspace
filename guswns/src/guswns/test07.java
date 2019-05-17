package guswns;

import java.util.Scanner;

public class test07 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.println("연도를 입력하세요 :");
		year = input.nextInt();
		if (year<1996) {
			System.out.println("입력값 오류");
			return;
		}
		
		if (Is_leap_year(year)) {
			System.out.println("윤년입니다");
			System.out.println("2월은 29일까지 있습니다");
		}else {
			System.out.println("윤년이 아닙니다");
			System.out.println("2월은 28일까지 있습니다");		
		}
		
		System.out.println("1996부터 "+year+" 까지의 일수"+days_in_the_year(year));
		input.close();
	}
	
	public static boolean Is_leap_year(final int year) {
		boolean ret = false;
		
		if (year%4==0 && year%100 !=0  || year%400 ==0) {
			ret = true;

		}else {
			ret = false;
	
		}
		
		return ret;
		
	}
	
	public static int days_in_the_year(final int year) {
		//1996-year 까지의 일수를 계산해서 반환하기
		
		int days =0;
		
		int gapY = year - 1996;
		int[] endDate = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int i = 0; i < gapY+1; i++) {
			int Y = 1996+i;
			if (Is_leap_year(Y)) {
				days += 366;//윤년 o
			}else {
				days += 365;// 윤년x
			
			}
		}
		
		
		return days;
		
	}

}
