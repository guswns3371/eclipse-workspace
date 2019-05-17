package java_0411;

public class test01 {

	public static void main(String[] args) {

		Human chai = new Human("채치수", 19);
		chai.intro();
		
		Student hyun = new Student("하현준", 25, 15109379, "컴퓨터공학과");
		hyun.intro();
		hyun.study();
		
		Human kim = new Human();
		kim.intro();
		
		Student kang = new Student("체육교육학과", 123456789);
		kang.intro();
		kang.study();
		
	}

}
