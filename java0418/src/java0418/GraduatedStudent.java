package java0418;

public class GraduatedStudent extends Student {

	String main_major;
	
	GraduatedStudent(String name, int age, String major, String main_major) {
		super(name, age, major);
		this.main_major = main_major;
	}

	void intro() {
		System.out.println(name+"님의 세부 전공은 "+main_major+"입니다.");
	}
	
	void research() {
		System.out.println("연구중~~~~~~~~");
	}
}
