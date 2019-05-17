package java_test_preparation;

import javax.swing.JOptionPane;

public class assign02_2 {

	static final int BASE_YEAR = 1996;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] this_month = new int[12];
		int year = Integer.parseInt(JOptionPane.showInputDialog("년 입력하세요"));
		int month = Integer.parseInt(JOptionPane.showInputDialog("월을 입력하세요"));
		

//		int days=2;//1996.1.1을 수요일로
		int days=0;
		for (int i = BASE_YEAR; i < year; i++) {
			this_month = months_in_a_year(i);
			for (int j = 0; j < this_month.length; j++) {
				days+= this_month[j];
			}
		}
		this_month = months_in_a_year(year);
		for (int i = 0; i < month; i++) {
			days += this_month[i];
		}
		
		int start_day = (days%7);
		System.out.printf("%9s%9s%9s %9s%9s %9s%9s","월","화","수","목","금","토","일");
		System.out.println();
		
		for (int i = 0; i < start_day; i++) {
			System.out.printf("%5s"," ");
		}
		for (int i = 1; i < this_month[month-1]; i++) {
			
			System.out.printf("%5d",i);
			
			if ((start_day+i)%7==0) {
				System.out.println();
			}
		}
	}
	static boolean Is_Leap_Year(int year) {
		if ((year%4==0 && year%100 !=0) || (year%400 ==0)) {
			return true;
		}else {
			return false;
		}
	}
	
	static int[] months_in_a_year(int year) {
		int[] months;
		if (Is_Leap_Year(year)) {
			months = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
		}else {
			months = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		}
		
		return months;
	}
	
}
