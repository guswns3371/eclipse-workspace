package guswns2;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		int num;
		for(;;) {//무한 루프
			System.out.print("정수를 입력: ");
			
		     num = input.nextInt();
			
			if (num >=0 && num <=100) {
				
				break;
			}else {
				System.out.println("** 정수 입력범위 오류 **");
			}
		}
		System.out.println("당신의 점수는 "+num+"입니다.");
		
		input.close();// 반드시 스캐너 객체는 close 해줘야 한다.
	}

}
