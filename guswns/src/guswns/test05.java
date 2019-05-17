package guswns;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		char grade;
		Scanner input = new Scanner(System.in);
		
		System.out.println("점수 입력 :");
		
		score = input.nextInt();
		 if (score<0 || score>100) {
			System.out.println("점수 입력 범위 오류");
			input.close();
			return;
		}
		if (score>=90) {
			grade = '수';
		}
	}

}
