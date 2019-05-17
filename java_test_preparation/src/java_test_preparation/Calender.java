package java_test_preparation;

public class Calender {
	int year,month;
	final int BASE_YEAR = 1996;
	 Calender(int year, int month) {
		this.year = year;
		this.month = month;
	}
	
	 boolean check_leap(int year) {
		 if ( (year%4==0 && year%100 !=0) || year%400 ==0) {
			return true;
		}else {
			return false;
		}
	 }
	
	 int days_in_a_month(int month, int year) {
		 int days=0;
		 switch (month) {
		 case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			 days =31;
			break;
		 case 2:
			 if (check_leap(year)) {
				days = 29;
			}else {
				days = 28;
			}
			 break;
		 case 4:case 6:case 9:case 11:
			 days = 30;
			break;
		}
		 return days;
	 }
	 
	 int all_days_before_year() {
		 int days =0;
		 for (int i = BASE_YEAR; i < year; i++) {
			for (int j = 1; j < 13; j++) {
				days += days_in_a_month(j, i);
			}
		}
		 return days;
	 }
	 
	 void displayCalende() {
		 System.out.println("--- "+year+"년 "+month+" ----");
		 System.out.printf("%9s%9s%9s %9s%9s %9s%9s","월","화","수","목","금","토","일");
		 System.out.println();
		 int DAYS = all_days_before_year();
		 
		 for (int i = 1; i <month; i++) {
			DAYS += days_in_a_month(i, year);
		}
		 
		 int left_days = DAYS%7;
		 
		 for (int i = 0; i < left_days; i++) {
			System.out.printf("%5s"," ");
		}
		 for (int i = 1; i <= days_in_a_month(month, year); i++) {
			
			 System.out.printf("%5s",i);
			 if ((left_days+i)%7 ==0) {
				System.out.println();
			}
		}
	 }
}
