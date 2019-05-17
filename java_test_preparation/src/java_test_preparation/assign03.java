package java_test_preparation;

import java.util.Scanner;

public class assign03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("start :");
		int start = input.nextInt();
		System.out.print("end :");
		int end = input.nextInt();
		int rnum,my_num;
		
		for(;;) {
			rnum= generate_rnum(start, end);
			if (rnum<start || rnum>end) {
				System.out.println("임의의 숫자 오류");
			}
			System.out.print(start+" ~ "+end+" 사이의 수를 맞추세요 :");
			my_num = input.nextInt();
		
			
			System.out.println("정답 :"+rnum);
			if (rnum == my_num) {
				System.out.println("성공");
				break;
			}
		}
		
		input.close();
	}

	public static int generate_rnum(int start, int end) {
		//0.0 <= Math.random() < 1.0 이다
		// start, end 포함하여 그 사이 수를 구함
		return (int)(Math.random()*(end-start+1))+start;
	}
}
