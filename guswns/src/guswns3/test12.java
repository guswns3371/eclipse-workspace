package guswns3;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] student ;
		int[][] stu_score;
		
		System.out.print("학생 수 입력 :");
		int student_num = input.nextInt();
		student = new String[student_num];
		stu_score = new int[student_num][];
		
		
		
		for (int i = 0; i < student_num; i++) {
			System.out.print("학생 이름 입력 :");
			String name = input.next();
			student[i] = name;
		}
		
		
		
		for (int i = 0; i < student.length; i++) {
			System.out.print(student[i]+" 학생의 수강 과목 수 입력:");
			int class_num = input.nextInt();
			stu_score[i] = new int[class_num];
			
			System.out.println(student[i]+" 학생 점수 입력");
			for (int j = 0; j < class_num; j++) {
				int ss = input.nextInt();
				stu_score[i][j] = ss;
			}			
			System.out.println();
		}
		
		System.out.println("총점과 평균 출력");
		for (int i = 0; i < student.length; i++) {
			System.out.print(student[i]);
			int sum=0;
			for (int j = 0; j < stu_score[i].length; j++) {
				System.out.printf("%3d",stu_score[i][j]);
				sum+= stu_score[i][j];
			}
			double avg = (double)(sum/(stu_score[i].length));
			System.out.print(" ==> 총점 :"+sum+", 평균 : "+avg);
			System.out.println();
		}
		
		input.close();
	}

}
