package java_test_preparation;

import java.util.Scanner;

public class assign05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("학생수 입력 :");
		int student_num = input.nextInt();
		String[] stud_name = new String[student_num];
		int[][] stu_info = new int[student_num][];
		
		System.out.println("학생 이름 입력 :");
		for (int i = 0; i < student_num; i++) {
			String name = input.next();// nextLine()쓰면 공백이 입력된다 그냥 next사용할 것
			stud_name[i] = name;
		}
		
		for (int i = 0; i < student_num; i++) {
			System.out.print(stud_name[i]+" 학생의 수강 과목 수 입력 :");
			int lec_num = input.nextInt();
			stu_info[i] = new int[lec_num];
			System.out.println(stud_name[i]+" 학생 점수 입력");
			for (int j = 0; j < stu_info[i].length; j++) {
				stu_info[i][j] = input.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("총점과 평균 출력");
		for (int i = 0; i <student_num; i++) {
			System.out.print(stud_name[i]+" ");
			int sum=0,avg=0;
			for (int j = 0; j < stu_info[i].length; j++) {
				System.out.print(stu_info[i][j]+" ");
				sum+= stu_info[i][j];
			}
			System.out.println("==> 총점 : "+sum+", 평균 : "+(double)(sum/stu_info[i].length));
		}
		input.close();
	}

}
