package guswns2;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("1~6 사이의 정수를 입력하세요 :");
		int r_num = generate_rnum(1,6);
		int num;
		num = input.nextInt();
		
		for(;;) {
			
			if(r_num==num) {
				break;
			}else {
				System.out.print("1~6 사이의 정수를 입력하세요 :");
				r_num = generate_rnum(1,6);
				num = input.nextInt();
			}
		}
		System.out.println("성공");
		input.close();
		
	}

	public static int generate_rnum(int start, int end) {
	

        int ret = 0;
		double d_rnum=0.0;
		d_rnum= Math.random();
		ret =(int)(d_rnum*1000)%end+start;

        System.out.println(ret);
        return ret;
        
	}
}
