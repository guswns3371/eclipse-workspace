package java0418;

public class Human {
	String name;
	int age;
	
	 Human(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 
	 void intro() {
		 System.out.println(name+"의 나이는 "+age+"입니다.");
	 }
}
