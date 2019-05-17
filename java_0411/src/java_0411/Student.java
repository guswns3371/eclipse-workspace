package java_0411;

public class Student extends Human{

	int studID;
	String major;
	Student(String name, int age, int studID, String major) {
		super(name, age); // 가장 처음에 선언해야 한다.
		this.studID = studID;
		this.major = major;
	}
	Student(String major, int studID){
		super(); // 매개 변수가 없는 Human의 생성자를 상속받음
		this.studID = studID;
		this.major = major;
	}
	
	@Override
	void intro() {
//		 super.intro();
		 System.out.println("- 오버라이딩 -");
		 System.out.println("이름 :"+name);
		 System.out.println("전공 :"+major);
		 System.out.println("학번 :"+studID);
		 System.out.println("나이 :"+age);
		 
	}
	
	void study() {
//		super.intro();
		System.out.println("전공 :"+major+", 학번 :"+studID);
	}

}
