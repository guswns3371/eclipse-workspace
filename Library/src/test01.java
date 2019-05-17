import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("사용자 ==> 1, 관리자 ==> 2 : ");
		int no = in.nextInt();
		
		if (no ==1) {
			while(user_menu())
				;
		}
		in.close();
	}
	
	static boolean user_menu() {
		int menu_no;
		boolean ret = true;
		Scanner in = new Scanner(System.in);
		System.out.println("*********************");
		System.out.println("      1.대    출                   ");
		System.out.println("      2.반    납                   ");
		System.out.println("      3.조    회                   ");
		System.out.println("      4.예    약                   ");
		System.out.println("      5.exit         ");
		System.out.println("*********************");
		System.out.print("input menu number : ");
		menu_no = in.nextInt();
		
		if (menu_no == 5) {
			ret = false;
		}else {
			if (menu_no>=1 && menu_no<=4) {
				
			}else {
				System.out.println("메뉴번호 잘못입력 , 다시 입력하세요");
			}
			ret = true;
		}
//		in.close();
		return ret;
	}

	static void admin_menu() {
		System.out.println("*********************");
		System.out.println("      1.대    출                   ");
		System.out.println("      2.반    납                   ");
		System.out.println("      3.책목록 관리             ");
		System.out.println("      4.exit         ");
	}
}
