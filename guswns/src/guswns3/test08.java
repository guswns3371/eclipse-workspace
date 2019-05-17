package guswns3;

import java.time.LocalDate;

public class test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("오늘은 "+getData()+"일입니다.");
	}

	private static int getData() {
		LocalDate today = LocalDate.now();
		int day = today.getDayOfMonth();
		return day;
	}

}
