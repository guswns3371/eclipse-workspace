package guswns;

import java.util.Scanner;

public class test08 {

	static Scanner input = new Scanner(System.in);
    
	static int[] endDate = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int month;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("달력을 만드는 프로그램입니다.");
		int year;
		System.out.println("년 입력하세요 : "); //1) 연도 입력
		year = input.nextInt();
		if (year<1996) {
			System.out.println("날짜 입력 오류");
			return;
		}


		int days3 =days_in_the_year(year)%7; // days3 는  4)에서 구한 총일수를 7로 나눈 나머지 수
		
		
		if (IS_leap_year(year)) {
			System.out.println(year+"은 윤년입니다");
			System.out.println("2월은 29일까지 있습니다");
		}else {
			System.out.println(year+"은 윤년이 아닙니다");
			System.out.println("2월은 28일까지 있습니다");		
		}
		
		System.out.printf("월\t화\t수\t목\t금\t토\t일\n");
		
		// 공백 출력
	    for(int i =0; i<days3; i++) {
	     System.out.print("\t");
	    }
	    int lastday = endDate[month-1];
	    
	    // 날짜 출력
	    for(int i = 1; i<=lastday; i++) {
	     System.out.print(i + "\t");
	     if((days3+i)%7 ==0) {
	      System.out.println();
	     }
	    }
	    
		input.close();
	}
	
	public static boolean IS_leap_year(final int year) {
		boolean ret = false;
		
		if (year%4==0 && year%100 !=0  || year%400 ==0) 
			ret = true;
		else 
			ret = false;
	
		return ret;
	}
	
	public static int days_in_the_year(final int year) {
		//1996-year 까지의 일수를 계산해서 반환하기
		System.out.println("월을 입력하세요 : ");//2) 월 입력
	    month = input.nextInt();
		
		int days =0;
		
		int gapY = year - 1996;

		if (IS_leap_year(year)) {
			endDate[1]=29; //윤년 o
		}
		
		for (int i = 0; i < gapY; i++) {
			int Y = 1996+i;
			if (IS_leap_year(Y)) {
				days += 366;//윤년 o
			}else {
				days += 365;// 윤년x
			
			}
		}
		System.out.println("1996부터 입력한 연도"+year+"년의 전년도 까지의 일수 : "+days); //3) 1996년부터 입력한 연도의 전년도까지 일수 계산
		
		int days2=0;
		for (int i = 0; i < month-1; i++) {
			days2 += endDate[i];
		}
		System.out.println("입력한 년도 "+year+"년도의 입력한 "+month+"월의 전월 까지의 일수 : "+days2);
		
		days = days+days2;
		System.out.println("1996년부터 "+year+"년 "+month+"월의 전월 까지의 총 일수 :"+days); //4) 입력한 연도의 입력한 전월까지 일수 계산해서 3)의 결과와 총합
		
		
		return days;
		
	}

}
