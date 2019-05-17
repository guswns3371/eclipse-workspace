package java0418;

public class Student extends Human{

	String major;
	
	Student(String name, int age,String major) {
		super(name, age);
		this.major = major;
	}
	
	void intro() {
		System.out.println(name+"님의 전공은 "+major+"입니다.");
	}

	void study() {
		System.out.println("공부중~~~~");
	}
}
