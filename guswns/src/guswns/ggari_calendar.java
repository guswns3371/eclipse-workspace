package guswns;
import java.util.*;
public class ggari_calendar {

	static int year = 0;
	static int month = 0;
	static int tempNal = 0;
	static int week = 0;
	static int i = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int monthArray[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		setYear();		//날짜 셋팅

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			monthArray[1] = 29;      //윤년이 아님
		}else{
			monthArray[1] = 28;		//윤연 임
		}
		
		// 01년 01월 01일부터 일계산
		tempNal = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100	+ (year - 1) / 400;
		//tempNal = (year - 1996) * 365 + (year - 1) / 4 - (year - 1) / 100	+ (year - 1) / 400;
		System.out.println(tempNal+"");
		for (i = 0; i < month - 1; i++){
			tempNal += monthArray[i];
		// 구하는달의 첫번째 날의 수
		tempNal += 1;
		// 구하고자 하는 달이 1일이 무슨요일인지
		week = tempNal % 7;
		
		}
		
		System.out.println("  월  화  수  목  금  토  일\n");
		for (i = 0; i < week; i++) {
			System.out.print("    ");
		}
		for (i = 1; i <= monthArray[month - 1]; i++) {
			System.out.printf("%4d", i);
			week++;
			if (week % 7 == 0){
				System.out.println("\n");
			}
		}
		if (week % 7 != 0){
			System.out.println();
		}
	}

	private static void setYear() {
		System.out.print("연도: ");
		year = sc.nextInt();
		if (year < 1996) {
			System.out.println("날짜 입력 오류");
			setYear();
			return;
		}
		setMonth();
	}

	private static void setMonth() {
		System.out.print("월: ");
		month = sc.nextInt();
		if (month < 1 || month > 12) {
			System.out.println("월수를 재대로 입력하세요");
			setMonth();
			return;

		}
	}
}
