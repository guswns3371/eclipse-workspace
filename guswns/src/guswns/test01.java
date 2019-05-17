package guswns;
import java.util.*;
import javax.swing.*;
public class test01 {

	//static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		
//		java.util.Scanner input = new Scanner(System.in);
//		System.out.println("이름 입력 :");
//		name = input.nextLine();

		name = JOptionPane.showInputDialog("이름 입력 :");
//		System.out.println("나이 입력 :");
//		age = input.nextInt();
		age = Integer.parseInt(JOptionPane.showInputDialog("나이 입력 :"));
		
		
		System.out.println(name+"님의 나이는 "+age+"입니다.");
//		input.close();// 스캐너 객체는 반드시 사용 후에 닫아줘야 메모리 누수를 막을 수 있다.
		
	}

}
