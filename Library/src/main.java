import java.util.ArrayList;
import java.util.Scanner;

public class main {

	static Scanner input = new Scanner(System.in);
	static Book[] booklist = {
			new Book(0,"방에관한 기억", "서성란", 5),
			new Book(1,"파프리카", "서성란", 3),
			new Book(2,"어린 왕자", "쌩땍쥐뼤리", 10),
			new Book(3,"자바전쟁", "생활토딩", 4),
			new Book(4,"PHP 뿌쉬기", "마크 주커버그", 7),
			new Book(5,"아홉살 인생", "하현준", 2),
			new Book(6,"하이탑", "서보인", 6),
			new Book(7,"이산수학", "박두순", 11),
			new Book(8,"오베라는 남자", "프레드릭 배크만", 3),
			new Book(9,"연금술사", "파울로 코엘료", 5),
			new Book(10,"숨", "테드 창", 3),
			new Book(11,"살인 카드 게임", "제임스 패터슨", 6),
			new Book(12,"고양이 1", "베르나르 베르베르", 9),
			new Book(13,"편지", "히가시노 게이고", 2)
			};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int user_menu_num = 0,admin_menu_num=0,age;
		String name,major;
		Student student = null;
		Faculty faculty = null;
		Admin admin = null;
		
		System.out.print("사용자 ==> 1, 관리자 ==> 2 : ");
		int who = input.nextInt();
		switch (who) {
		case 1:
				System.out.print("학생 ==> 1 , 교직원 ==> 2 :");
				int who2 = input.nextInt();
				switch (who2) {
				case 1:
					System.out.print("이름을 입력하세요 : ");
					name = input.next();
					System.out.print("나이를 입력하세요 : ");
					age = input.nextInt();
					System.out.print("학과를 입력하세요 : ");
					major = input.next();
					System.out.print("학번을 입력하세요 : ");
					String stu_num = input.next();
					student = new Student(age, name, stu_num, major);
					
					break;
				case 2:
					System.out.print("이름을 입력하세요 : ");
					name = input.next();
					System.out.print("나이를 입력하세요 : ");
					age = input.nextInt();
					System.out.print("담당 학과를 입력하세요 : ");
					major = input.next();
					faculty = new Faculty(age, name, major);
					break;

				}
				for(;;) {
					user_menu_num = user_menu();
					
					if (student == null) {
						faculty_act(faculty, user_menu_num);
					}else if (student != null) {
						student_act(student, user_menu_num);
					}
					
					if (user_menu_num==5) {
						break;
					}else if (user_menu_num>5 || user_menu_num <1) {
						System.out.println("입력값 오류");
					}
				}
			break;

		case 2:
				System.out.print("이름을 입력하세요 : ");
				name = input.next();
				System.out.print("나이를 입력하세요 : ");
				age = input.nextInt();
				admin = new Admin(age, name);
				
				for(;;) {
					admin_menu_num = admin_menu();
					
					admin_act(admin, admin_menu_num);
					
					if (admin_menu_num==4) {
						break;
					}else if (admin_menu_num>4 || admin_menu_num <1) {
						System.out.println("입력값 오류");
					}
				}			
			break;
		}
		
		input.close();
	}

	static int user_menu() {
		System.out.println("*********************");
		System.out.println("      1.대    출                   ");
		System.out.println("      2.반    납                   ");
		System.out.println("      3.조    회                   ");
		System.out.println("      4.예    약                   ");
		System.out.println("      5.exit         ");
		System.out.println("*********************");
		System.out.print("input menu number : ");
		int num = input.nextInt();
		
		return num;
	}
	
	static int admin_menu() {
		System.out.println("*********************");
		System.out.println("      1.대    출                   ");
		System.out.println("      2.반    납                   ");
		System.out.println("      3.책목록 관리             ");
		System.out.println("      4.exit         ");
		System.out.println("*********************");
		
		System.out.print("input menu number : ");
		int num = input.nextInt();
		
		return num;
	}
	
	static void display_booklist() {
		System.out.println("*********************");
		for(Book b : booklist) {
			System.out.println(b.index+". "+b.name+" | "+b.author+" | "+b.num+"권 ------ ( "+b.occupied_num+"권 대출중 )");
		}
		System.out.println("*********************");

	}
	static void student_act(Student student, int user_menu_num) {
		int book_idx;
		switch (user_menu_num) {
		case 1:
			book_idx = student.대출시도();
			student.대출가능성(booklist[book_idx].책_대출가능성());
			student.display_info();

			break;
		case 2:
			book_idx = student.반납시도();
			student.반납가능성(booklist[book_idx].책_반납가능성());
			student.display_info();

			break;
		case 3:
			student.조회시도();
			display_booklist();
			break;
		case 4:
			student.예약시도();
			break;
		case 5:
			student.나가기();
			break;
		default:
			System.out.println("error");
			break;
		}
	}
	
	static void faculty_act(Faculty faculty, int user_menu_num ) {
		int book_idx;
		switch (user_menu_num) {
		case 1:
			 book_idx = faculty.대출시도();
			 faculty.대출가능성(booklist[book_idx].책_대출가능성());
			 faculty.display_info();
			 break;
		case 2:
			 book_idx = faculty.반납시도();
			 faculty.반납가능성(booklist[book_idx].책_반납가능성());
			 faculty.display_info();
			 break;
		case 3:
			faculty.조회시도();
			display_booklist();
			break;
		case 4:
			faculty.예약시도();
			break;
		case 5:
			faculty.나가기();
			break;
		default:
			System.out.println("error");
			break;
		}
	}
	
	static void admin_act(Admin admin, int admin_menu_num) {
		switch (admin_menu_num) {
		case 1:
			admin.대출처리();
			break;
		case 2:
			admin.반납처리();
			break;
		case 3:
			admin.사용자_배열정보();
			break;
		case 4:
			admin.나가기();
			break;
		default:
			System.out.println("error");
			break;
		}
	}
}