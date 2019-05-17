package guswns3;

import java.util.Random;
import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] song = {"노래1","노래2","노래3","노래4"
				,"노래5","노래6","노래7","노래8","노래9","노래10"};
		
		System.out.print("노래 ==> play :");
		String S = input.nextLine();
		
		if (S.equals("y")) {
			int[] randoms = new int[10];
			Random R = new Random();
		
			
			for (int i = 0; i < 10; i++) {
				randoms[i] = R.nextInt(10); // 난수 발생
				for (int j = 0; j < i; j++) {
					if (randoms[i]==randoms[j]) {
						i--;
					}
				}
			}
			for (int i = 0; i < 10; i++) {
				System.out.println((i+1)+"번째 노래 : "+song[randoms[i]]);
			}
		}else {
			
		}
		
		input.close();
		
	}

}
